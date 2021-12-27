package caseStudy.model.person;



public class Employee extends Person implements Comparable<Employee>{
    private String level;
    private String position;
    private double salary;
    private String gender;

    public Employee(String level, String position, double salary,String gender) {
        this.level = level;
        this.position = position;
        this.salary = salary;
        this.gender=gender;
    }

    public Employee(String id, String name, String dayOfBirth, String idCitizen, String phoneNumber, String email, String level, String position, double salary, String gender) {
        super(id, name, dayOfBirth, idCitizen, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
        this.gender = gender;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId().compareTo(o.getId());
    }
}
