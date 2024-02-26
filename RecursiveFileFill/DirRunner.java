package Research.RecursiveFileFill;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class DirRunner {
    public static void inspectInsert(String path) throws IOException {
        File file = new File(path);
        File source = new File("src/main/resources/Joke.java");
        try (BufferedReader reader = Files.newBufferedReader(source.toPath(), Charset.defaultCharset())) {
            List<String> content = Files.readAllLines(source.toPath());
            if (file.isDirectory()) {
                injectJoke(file, reader, content);
            }
        }

        File[] dirContent = file.listFiles();
        if (dirContent != null) {
            for (File subDir : dirContent) {
                if (subDir.isDirectory()) {
                    inspectInsert(subDir.getPath());
                }
            }
        }
    }

    public static void inspectDelete(String path) throws IOException {
        File file = new File(path);
        if (file.isDirectory()) {
            deleteJoke(file);
        }

        File[] content = file.listFiles();
        if (content != null) {
            for (File subDir : content) {
                if (subDir.isDirectory()) {
                    deleteJoke(subDir);
                    inspectDelete(subDir.getPath());
                }
            }
        }
    }

    private static void injectJoke(File parent, BufferedReader reader, List<String> content) throws IOException {
        String newFileName = "Joke.java";
        File newFile = new File(parent, "Joke.java");
        newFile.createNewFile();
        try (BufferedWriter writer = Files.newBufferedWriter(newFile.toPath())) {
            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }
        }
        if (newFile.exists()) {
            System.out.println(parent.getPath() + " " + newFileName + " INSERTED");
        }
    }

    private static void deleteJoke(File parent) throws IOException {
        String targetFileName = "Joke.java";
        String filePath = parent.getPath() + File.separator + targetFileName;
        File targetFile = new File(filePath);
        targetFile.delete();
        if (!(targetFile.exists())) {
            System.out.println(parent.getPath() + " " + targetFileName + " DELETED");
        }
    }
}
