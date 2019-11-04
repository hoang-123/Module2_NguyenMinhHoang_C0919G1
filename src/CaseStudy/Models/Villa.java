package CaseStudy.Models;

public class Villa extends Service {
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String nameService, double areaUsed, double retalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOfFloors) {
        super(id, nameService, areaUsed, retalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return
                "\nID Service : " + super.getId()  +
                "\nName Service: " + super.getNameService()  +
                "\nArea used: " + super.getAreaUsed()  +
                "\nRental Costs: " + super.getRetalCosts()  +
                "\nMax Number of Peoples: " + super.getMaxNumberOfPeople()  +
                "\nType Rent: " + super.getTypeRent()  +
                "\nRoom Standard: " + roomStandard  +
                "\nConvenient Description='" + convenientDescription +
                "\nArea Pool=" + areaPool +
                "\nNumber Of Floors=" + numberOfFloors;
    }
}
