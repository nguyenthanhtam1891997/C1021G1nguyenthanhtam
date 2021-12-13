package bai_Tap_Them.bai2.model;

public class Student implements Comparable<Student>{
    private String code;
    private String name;
    private String dayOfBirth;
    private String male;
    private String course;

    public Student(String code, String name, String dayOfBirth, String male, String course) {
        this.code = code;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.male = male;
        this.course = course;
    }

    public Student() {
    }

    public String  getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", male='" + male + '\'' +
                ", course='" + course + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.code.compareTo(o.code);
    }
}
