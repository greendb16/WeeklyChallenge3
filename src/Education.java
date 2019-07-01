import java.util.ArrayList;

public class Education {

    private String school;
    private int year;
    private String Degree;
    private String major;

    public Education(String school, int year, String degree, String major) {
        this.school = school;
        this.year = year;
        Degree = degree;
        this.major = major;
    }

    public Education() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return "Education\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n" + getDegree() + " in " + getMajor() + ",\n" + getSchool() + ", " + getYear();
    }


}
