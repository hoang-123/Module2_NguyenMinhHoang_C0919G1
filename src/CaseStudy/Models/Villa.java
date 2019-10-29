package Models;

public class Villa extends Service {
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String nameService, double areaUsed, double retalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDesctiption, double areaPool, int numberOfFloors) {
        super(id, nameService, areaUsed, retalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDesctiption;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDesctiption() {
        return convenientDescription;
    }

    public void setConvenientDesctiption(String convenientDesctiption) {
        this.convenientDescription = convenientDesctiption;
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
                "\nConvenient Desctiption='" + convenientDescription +
                "\nArea Pool=" + areaPool +
                "\nNumber Of Floors=" + numberOfFloors;
    }
}
