package caseStudy.model.facility;

public class Villa extends FuramaFacility{
    private String standardRoom;
    private double areaPool;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String nameService, double areaUsable, double costsRental, int maxPeople, String typeRental, String standardRoom, double areaPool, int numberFloors) {
        super(nameService, areaUsable, costsRental, maxPeople, typeRental);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public Villa(String standardRoom, double areaPool, int numberFloors) {
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                ", numberFloors=" + numberFloors +super.toString()+
                '}';
    }

    @Override
    public String maintenance() {
        return null;
    }
}
