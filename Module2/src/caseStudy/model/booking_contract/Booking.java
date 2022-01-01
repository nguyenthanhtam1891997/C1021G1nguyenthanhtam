package caseStudy.model.booking_contract;

import caseStudy.model.facility.FuramaFacility;
import caseStudy.model.person.Customer;

public class Booking  {
    private int idBooking;
    private String dayStart;
    private String dayEnd;
    private Customer idCustomer;
    private FuramaFacility facility;

    public Booking() {
    }

    public Booking(int idBooking, String dayStart, String dayEnd, Customer idCustomer, FuramaFacility facility) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.facility = facility;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public FuramaFacility getFacility() {
        return facility;
    }

    public void setFacility(FuramaFacility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", idCustomer=" + idCustomer +
                ", facility=" + facility +
                '}';
    }


}
