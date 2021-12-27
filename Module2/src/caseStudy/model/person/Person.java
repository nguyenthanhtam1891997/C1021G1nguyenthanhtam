package caseStudy.model.person;

public abstract class Person {
   private String id;
   private String name;
   private String dayOfBirth;
   private String idCitizen;
   private String phoneNumber;
   private String email;

    public Person(String id, String name, String dayOfBirth, String idCitizen, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.idCitizen = idCitizen;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getIdCitizen() {
        return idCitizen;
    }

    public void setIdCitizen(String idCitizen) {
        this.idCitizen = idCitizen;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", idCitizen=" + idCitizen +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email ;
    }
}
