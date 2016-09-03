/**
 * Created by Abdulrhman on 29/08/2016.
 */
public class ReportCard {

    private String exames;
    private int grade;
    protected int year;

    final int totalgrade = getGrade();

    public ReportCard(String exames, int year, int grade) {
        exames = "math";
        year = 2016;
        grade = 7;
        this.grade = grade;
        this.exames = exames;
        this.year = year;
    }

    //set your exams name
    public void setExames(String exames) {
        this.exames = exames;
    }

    //get your exams name
    public String getExames() {
        return exames;
    }

    //set your grade
    public void setGrade(int grade) {
    }

    //get your grade
    public int getGrade() {
        return grade;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int theGrade(String exames, String Sname, int grade) {
        this.grade = grade;
        if (grade > 6) System.out.printf("the " + Sname + "is passed in the exame " + exames);
        else {
            System.out.println("try again mr. " + Sname);
        }
        return grade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "exames='" + exames + '\'' +
                ", grade=" + grade +
                ", year=" + year +
                ", totalgrade=" + totalgrade +
                '}';
    }
}
