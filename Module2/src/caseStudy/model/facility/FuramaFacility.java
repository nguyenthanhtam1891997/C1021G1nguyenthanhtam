package caseStudy.model.facility;

public abstract class FuramaFacility {
    private String idFacility;
    private String nameService;
    private double areaUsable;
    private double costsRental;
    private int maxPeople;
    private int typeRental;

    public FuramaFacility() {
    }

    public FuramaFacility(String idFacility,String nameService, double areaUsable, double costsRental, int maxPeople, int typeRental) {
       this.idFacility=idFacility;
        this.nameService = nameService;
        this.areaUsable = areaUsable;
        this.costsRental = costsRental;
        this.maxPeople = maxPeople;
        this.typeRental = typeRental;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(double areaUsable) {
        this.areaUsable = areaUsable;
    }

    public double getCostsRental() {
        return costsRental;
    }

    public void setCostsRental(double costsRental) {
        this.costsRental = costsRental;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getTypeRental() {
        return typeRental;
    }

    public void setTypeRental(int typeRental) {
        this.typeRental = typeRental;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    @Override
    public String toString() {
        return "FuramaFacility" +
                "nameService='" + nameService + '\'' +
                ", areaUsable=" + areaUsable +
                ", costsRental=" + costsRental +
                ", maxPeople=" + maxPeople +
                ", typeRental='" + typeRental + '\''
                ;
    }

    public abstract String maintenance();
}
