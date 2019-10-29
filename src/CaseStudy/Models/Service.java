package Models;

public abstract class Service {
    private String id;
    private String nameService;
    private double areaUsed;
    private double retalCosts;
    private int maxNumberOfPeople;
    private String typeRent;

    public Service() {
    }

    public Service(String id, String nameService, double areaUsed, double retalCosts, int maxNumberOfPeople, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.retalCosts = retalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRetalCosts() {
        return retalCosts;
    }

    public void setRetalCosts(double retalCosts) {
        this.retalCosts = retalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }
    public abstract String showInfor();
}
