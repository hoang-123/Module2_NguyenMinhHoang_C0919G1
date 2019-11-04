package CaseStudy.Models;

public class Room extends Service {
    private String freeService;

    public Room() {
    }

    public Room(String id, String nameService, double areaUsed, double retalCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areaUsed, retalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        return  "\nID Service : " + super.getId()  +
                "\nName Service: " + super.getNameService()  +
                "\nArea used: " + super.getAreaUsed()  +
                "\nRental Costs: " + super.getRetalCosts()  +
                "\nMax Number of Peoples: " + super.getMaxNumberOfPeople()  +
                "\nType Rent: " + super.getTypeRent()  +
                "\nFree Service: " + freeService;
    }
}
