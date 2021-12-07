package ss5_Static.bai_tap;

public class Student {
    private String name;
    private String classes;
    public Student(){
       name="john";
        classes = "C02";
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
