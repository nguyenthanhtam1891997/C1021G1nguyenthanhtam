package caseStudy.model.facility;

public class Villa extends FuramaFacility {
    private String standardRoom;
    private double areaPool;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String idFacility,String nameService, double areaUsable, double costsRental,
                 int maxPeople, String typeRental, String standardRoom,
                 double areaPool, int numberFloors) {
        super(idFacility,nameService, areaUsable, costsRental, maxPeople, typeRental);
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
        return super.toString()+
                "," + standardRoom  +
                "," + areaPool +
                "," + numberFloors
                ;
    }


    @Override
    public int hashCode() {
        return this.getIdFacility().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null||!(obj instanceof Villa)){
            return false;
        }
        Villa otherVilla=(Villa) obj;
        if (this.getIdFacility().equals(otherVilla.getIdFacility())&& this.getNameService().equals(otherVilla.getNameService())){
            return true;
        }
        return false;
    }




}
