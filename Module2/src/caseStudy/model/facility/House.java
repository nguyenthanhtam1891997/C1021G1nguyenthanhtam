package caseStudy.model.facility;

public class House extends FuramaFacility {
    private String standardRoom;
    private int numberFloors;

    public House(String standardRoom, int numberFloors) {
        this.standardRoom = standardRoom;
        this.numberFloors = numberFloors;
    }

    public House(String idFacility,String nameService, double areaUsable, double costsRental, int maxPeople,
                 String typeRental, String standardRoom, int numberFloors) {
        super(idFacility,nameService, areaUsable, costsRental, maxPeople, typeRental);
        this.standardRoom = standardRoom;
        this.numberFloors = numberFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "standardRoom='" + standardRoom + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public String maintenance() {
        return null;
    }


}
