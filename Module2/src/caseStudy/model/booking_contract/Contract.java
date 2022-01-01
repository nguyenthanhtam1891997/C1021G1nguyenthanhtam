package caseStudy.model.booking_contract;

import caseStudy.model.person.Customer;

public class Contract {
    private String idContract;
    private String booking;
    private double moneyDeposit;
    private double sumMoney;
    private String customer;

    public Contract(String idContract, String booking, double moneyDeposit, double sumMoney, String customer) {
        this.idContract = idContract;
        this.booking = booking;
        this.moneyDeposit = moneyDeposit;
        this.sumMoney = sumMoney;
        this.customer = customer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public double getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(double moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", booking='" + booking + '\'' +
                ", moneyDeposit=" + moneyDeposit +
                ", sumMoney=" + sumMoney +
                ", customer='" + customer + '\'' +
                '}';
    }
}
