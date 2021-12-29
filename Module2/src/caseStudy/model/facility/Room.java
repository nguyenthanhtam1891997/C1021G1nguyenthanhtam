package caseStudy.model.facility;

public class Room extends FuramaFacility {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility,String nameService, double areaUsable, double costsRental,
                int maxPeople, String typeRental, String freeService) {
        super(idFacility,nameService, areaUsable, costsRental, maxPeople, typeRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String maintenance() {
        return null;
    }


}
