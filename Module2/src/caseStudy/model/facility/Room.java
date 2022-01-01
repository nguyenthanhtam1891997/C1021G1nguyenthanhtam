package caseStudy.model.facility;

import java.util.Random;

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
        return super.toString()+
                "," + freeService
                ;
    }

    @Override
    public int hashCode() {
        return this.getIdFacility().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null||!(obj instanceof Room)){
            return false;
        }
        Room otherRoom=(Room) obj;
        if (this.getIdFacility().equals(otherRoom.getIdFacility())&& this.getNameService().equals(otherRoom.getNameService())){
            return true;
        }
        return false;
    }
}
