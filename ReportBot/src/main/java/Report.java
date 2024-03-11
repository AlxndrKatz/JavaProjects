import java.time.LocalDate;

public class Report {
    private long id;
    private String studentUserName;
    private Integer hours;
    private LocalDate date;
    private String title;

    public Report(long id, String studentUserName, Integer hours, LocalDate date, String title) {
        this.id = id;
        this.studentUserName = studentUserName;
        this.hours = hours;
        this.date = date;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public Integer getHours() {
        return hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return studentUserName + "\n" +
                date + "\n" +
                hours + "\n" +
                title + "\n-----------------\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Report report)) return false;

        if (id != report.id) return false;
        if (!studentUserName.equals(report.studentUserName)) return false;
        if (!hours.equals(report.hours)) return false;
        if (!date.equals(report.date)) return false;
        return title.equals(report.title);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + studentUserName.hashCode();
        result = 31 * result + hours.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }
}
