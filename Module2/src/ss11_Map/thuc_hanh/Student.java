package ss11_Map.thuc_hanh;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private  int age;
    private String address;
  //  private String like;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
      //  this.like=like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public String getLike() {
//        return like;
//    }

//    public void setLike(String like) {
//        this.like = like;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(address);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(like, student.like);
//    }
}
