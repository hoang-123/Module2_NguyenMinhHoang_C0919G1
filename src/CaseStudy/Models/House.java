package Models;

public class House extends Service {
    private String roomStandard;
    private String convenientDescription;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String nameService, double areaUsed, double retalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, int numberOfFloors) {
        super(id, nameService, areaUsed, retalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return  "\nID Service : " + super.getId()  +
                "\nName Service: " + super.getNameService()  +
                "\nArea used: " + super.getAreaUsed()  +
                "\nRental Costs: " + super.getRetalCosts()  +
                "\nMax Number of Peoples: " + super.getMaxNumberOfPeople()  +
                "\nType Rent: " + super.getTypeRent()  +
                "\nRoom Standard: " + roomStandard  +
                "\nConvenient Desctiption='" + convenientDescription +
                "\nNumber Of Floors=" + numberOfFloors;
    }
}
