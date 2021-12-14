package bai_Tap_Them.bai3.model;

public class Cadres {
    private String code;
    private String name;
    private String male;
    private String homeTown;
    private String yearOfBirth;
    private String transfer;
    private String level;
    private double salary;
    private double allowance;
    private double realTrick;

    public Cadres() {
    }

    public Cadres(String code, String name, String male, String homeTown,
                  String yearOfBirth, String transfer, String level,
                  double salary, double allowance) {
        this.code = code;
        this.name = name;
        this.male = male;
        this.homeTown = homeTown;
        this.yearOfBirth = yearOfBirth;
        this.transfer = transfer;
        this.level = level;
        this.salary = salary;
        this.allowance = allowance;
        this.realTrick=(salary+allowance)*450000;
    }

    public String getCode() {
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

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getRealTrick() {
        return realTrick;
    }

    public void setRealTrick(double realTrick) {
        this.realTrick = realTrick;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", male='" + male + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", transfer='" + transfer + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                ", allowance=" + allowance +
                ", realTrick=" + realTrick +
                '}';
    }
}
