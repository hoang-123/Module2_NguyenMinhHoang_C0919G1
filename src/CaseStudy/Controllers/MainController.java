package CaseStudy.Controllers;

import CaseStudy.Commons.FunWriteAndReadFileCSV;
import CaseStudy.Commons.FuncValidation;
import CaseStudy.Models.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainController {
    private static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu(){
        sc.nextLine();
        System.out.println("---MAIN MENU---");
        System.out.println("\n1.Add new Service. "+
                "\n2.Show Service. "+
                "\n3.Add Customer. "+
                "\n4.Show Information Customers. "+
                "\n5.Add New Booking Resort. "+
                "\n6.Show Information Employee. "+
                "\n7.Show List Customer Buy Ticket. "+
                "\n8.Search Information Employee. "+
                "\n9.Exit. "+
                "\nPlease select one function below: ");
        String choose = sc.nextLine();
        switch (choose){
            case "1":
                addNewService();
                break;
            case "2":
                showService();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInforCustomer();
                backMainMenu();
                break;
            case "5":
                addNewBookingResort();
                break;
            case "6":
                showInforCusBuyTickets();
                break;
            case "7":
                showInforCusBuyTickets();
                break;
            case "8":
                searchEmployee();
                break;
            case "9":
                System.exit(0);
            default:
                System.out.println("\nError. Back to Menu.");
                backMainMenu();
        }
    }
    private static void addNewCustomer(){
        String content = "";
        String errMes = "";
        Customer cus = new Customer();
        cus.setIdCus(UUID.randomUUID().toString().replace("-", ""));
        System.out.println("Enter Name Customer:");
        cus.setNameCustomer(sc.nextLine());
        while (!FuncValidation.checkNameCustomer(cus.getNameCustomer())){
            System.out.println("Name Customer is Invalid. Please try again !!!");
            System.out.println("Enter Name Customer:");
            cus.setNameCustomer(sc.nextLine());
        }
        System.out.println("Enter Gender(Male / Female / Unknown):");
        cus.setGender(sc.nextLine());
        while (!FuncValidation.checkGender(cus.getGender())){
            System.out.println("Gender is Invalid. Please try again !!!");
            System.out.println("Enter Gender:");
            cus.setGender(sc.nextLine());
        }

        System.out.println("Enter ID Card:");
        cus.setIdCard(sc.nextInt());
        while (!FuncValidation.checkIdCard(String.valueOf(cus.getIdCard()))){
            System.out.println("Id Card is Invalid. Please try again !!!");
            System.out.println("Enter Id Card:");
            cus.setIdCard(sc.nextInt());
        }

        content = "Enter Phone: ";
        errMes = "Phone is Invalid (Phone must be a Integer). Please try again!!!";
        cus.setPhone(FuncValidation.checkValidNumberInteger(content, errMes));
        while (cus.getPhone() <= 0){
            System.out.println(errMes);
            cus.setPhone(FuncValidation.checkValidNumberInteger(content, errMes));
        }

        System.out.println("Enter Email:");
        sc.nextLine();
        cus.setMail(sc.nextLine());
        while (!FuncValidation.checkEmail(cus.getMail())){
            System.out.println("Email is Invalid. Please try again !!!");
            System.out.println("Enter Email:");
            cus.setMail(sc.nextLine());
        }

        System.out.println("Enter Type Customer:");
        cus.setTypeCustomer(sc.nextLine());
        while (!FuncValidation.checkNameService(cus.getTypeCustomer())){
            System.out.println("Type Customer is Invalid. Please try again!!!");
            System.out.println("Enter Type Customer:");
            cus.setTypeCustomer(sc.nextLine());
        }

        System.out.println("Enter Address:");
        cus.setAddress(sc.nextLine());

        System.out.println("Enter Birthday (MM/DD/YYYY):");
        cus.setBirthday(sc.nextLine());
        while (!FuncValidation.checkBirthday(cus.getBirthday())){
            System.out.println("Birthday is Invalid. Please try again!!!");
            System.out.println("Enter Birthday:");
            cus.setBirthday(sc.nextLine());
        }
        ArrayList<Customer> listCustomer = FunWriteAndReadFileCSV.getCustomerFromCSV();
        listCustomer.add(cus);
        FunWriteAndReadFileCSV.writeCustomerToFileCSV(listCustomer);
        System.out.println("\nAdd Customer: "+ cus.getNameCustomer() + "Successfully!!!");
        backMainMenu();
    }

    private static void showInforCustomer(){
        ArrayList<Customer> listCustomer = FunWriteAndReadFileCSV.getCustomerFromCSV();
        listCustomer.sort(new SortName());
        for (Customer customer: listCustomer) {
            System.out.println("------------------");
            System.out.println(customer.showInfor());
            System.out.println("------------------");
        }
        sc.nextLine();
    }


    private static void backMainMenu(){
        System.out.println("\nEnter to continue...");
        sc.nextLine();
        System.out.println("\n------------");
        displayMainMenu();
    }

    private static void addNewService(){
        System.out.println("\nEnter to continue...");
        System.out.println("\n1.Add new Villa. "+
                "\n2.Add new House. "+
                "\n3.Add new Room. "+
                "\n4.Back to Menu. "+
                "\n5.Exit. "+
                "\nPlease select one function below: ");
        switch (sc.nextLine()){
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
                System.out.println("\n-------------");
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("\nError. Back to Menu.");
                backMainMenu();
        }
    }
    private static void showService() {
        System.out.println("\n-------------" +
                "\n1.Show all Villa. " +
                "\n2.Show all House. " +
                "\n3.Show all Room. " +
                "\n4.Show all name Villa Not Duplicate . " +
                "\n5.Show all name House Not Duplicate . " +
                "\n6.Show all name Room Not Duplicate . " +
                "\n7.Back to Menu. " +
                "\n8.Exit. " +
                "\nPlease select one function below: ");
        switch (sc.nextLine()) {
            case "1":
                showAllVilla();
                break;
            case "2":
                showAllHouse();
                break;
            case "3":
                showAllRoom();
                break;
            case "4":
                showAllVillaNotDuplicate();
                break;
            case "5":
                showAllHouseNotDuplicate();
                break;
            case "6":
                showAllRoomNotDuplicate();
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("\nError. Back to Menu.");
                backMainMenu();
        }
    }

    private static void showAllVilla(){
        ArrayList<Villa> listVilla = FunWriteAndReadFileCSV.getVillaFromCSV();
        for(Villa villa: listVilla){
            System.out.println("--------------");
            System.out.println(villa.showInfor());
            System.out.println("--------------");
        }
        backMainMenu();
        }

    private static void showAllVillaNotDuplicate(){
        String pathVilla = "src/Data/Villa.csv";
        Path path = Paths.get(pathVilla);
        if(!Files.exists(path)){
            System.out.println("File Villa Does Not Exits");
        }else {
            TreeSet<String> listVillaTreeSet = FunWriteAndReadFileCSV.getAllNameServicesFromCSV(pathVilla);
            System.out.println("Lists Name Service Villa Not Duplicate:");
            for (String string : listVillaTreeSet) {
                System.out.println("\n-----------");
                System.out.println(string);
                System.out.println("\n-----------");
            }
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void showAllHouse(){
        ArrayList<House> listHouse = FunWriteAndReadFileCSV.getHouseFromCSV();
        for(House house: listHouse){
            System.out.println("--------------");
            System.out.println(house.showInfor());
            System.out.println("--------------");
        }
        backMainMenu();
    }
    private static void showAllHouseNotDuplicate(){
        String pathHouse = "src/Data/House.csv";
        Path path = Paths.get(pathHouse);
        if(!Files.exists(path)){
            System.out.println("File House Does Not Exits");
        }else {
            TreeSet<String> listHouseTreeSet = FunWriteAndReadFileCSV.getAllNameServicesFromCSV(pathHouse);
            System.out.println("Lists Name Service House Not Duplicate:");
            for (String string : listHouseTreeSet) {
                System.out.println("\n-----------");
                System.out.println(string);
                System.out.println("\n-----------");
            }
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void showAllRoom(){
        ArrayList<Room> listRoom = FunWriteAndReadFileCSV.getRoomFromCSV();
        for(Room room: listRoom){
            System.out.println("--------------");
            System.out.println(room.showInfor());
            System.out.println("--------------");
        }
        backMainMenu();
    }
    private static void showAllRoomNotDuplicate(){
        String pathRoom = "src/Data/Room.csv";
        Path path = Paths.get(pathRoom);
        if(!Files.exists(path)){
            System.out.println("File Room Does Not Exits");
        }else {
            TreeSet<String> listRoomTreeSet = FunWriteAndReadFileCSV.getAllNameServicesFromCSV(pathRoom);
            System.out.println("Lists Name Service Room Not Duplicate:");
            for (String string : listRoomTreeSet) {
                System.out.println("\n-----------");
                System.out.println(string);
                System.out.println("\n-----------");
            }
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void addNewBookingResort(){
        ArrayList<Customer> lisCustomer = FunWriteAndReadFileCSV.getCustomerFromCSV();
                int i = 1;
        for (Customer customer : lisCustomer) {
            System.out.println("--------------");
            System.out.println("NO " + i);
            System.out.println(customer.showInfor());
            System.out.println("--------------");
            i++;
        }
        System.out.println("Choose Customer Booking:");
        Customer customer = lisCustomer.get(sc.nextInt() - 1);
        System.out.println("\n1.Booking Villa."+
                            "\n2.Booking House."+
                             "\n3.Booking Room.");
        System.out.println("Choose Service Booking.");
        sc.nextLine();
        String choose = sc.nextLine();
        switch (choose){
            case "1":
                i = 1;
                ArrayList<Villa> listVilla = FunWriteAndReadFileCSV.getVillaFromCSV();
                for (Villa villa: listVilla) {
                    System.out.println("----------------------------");
                    System.out.println("NO " + i);
                    System.out.println(villa.showInfor());
                    System.out.println("----------------------------");
                    i++;
                }
                System.out.println("Choose Villa Booking.");
                Villa villa = listVilla.get(sc.nextInt() - 1);
                customer.setService(villa);
                break;
            case "2":
                i = 1;
                ArrayList<House> listHouse = FunWriteAndReadFileCSV.getHouseFromCSV();
                for (House house: listHouse) {
                    System.out.println("----------------------------");
                    System.out.println("NO " + i);
                    System.out.println(house.showInfor());
                    System.out.println("----------------------------");
                    i++;
                }
                System.out.println("Choose House Booking.");
                House house = listHouse.get(sc.nextInt() - 1);
                customer.setService(house);
                break;
            case "3":
                i = 1;
                ArrayList<Room> listRoom = FunWriteAndReadFileCSV.getRoomFromCSV();
                for (Room room: listRoom) {
                    System.out.println("----------------------------");
                    System.out.println("NO " + i);
                    System.out.println(room.showInfor());
                    System.out.println("----------------------------");
                    i++;
                }
                System.out.println("Choose Room Booking.");
                Room room = listRoom.get(sc.nextInt() - 1);
                customer.setService(room);
                break;
            default:
                backMainMenu();
                break;
        }
        ArrayList<Customer> listBooking = FunWriteAndReadFileCSV.getBookingFromCSV();
        listBooking.add(customer);
        FunWriteAndReadFileCSV.writeBookingToFileCSV(listBooking);
        System.out.println("\nAdd Booking For " + customer.getNameCustomer() + " Successfully !!!");
        sc.nextLine();
        backMainMenu();
    }

    private static Service addNewService(Service service){
        String content = "";
        String errMes = "";
        service.setId(UUID.randomUUID().toString().replace("-", ""));
        System.out.println("Enter name Service: ");
        service.setNameService(sc.nextLine());
        while (!FuncValidation.checkNameService(service.getNameService())){
            System.out.println("Name Service is Invalid. Please try again !!!");
            System.out.println("Enter name Service: ");
            service.setNameService(sc.nextLine());
        }
        content = "Enter Area Used: ";
        errMes = "Area Used is Invalid (Area > 30, Area must be a Double). Please try again!!!";
        service.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        while (service.getAreaUsed() <= 30){
            System.out.println(errMes);
            service.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        content = "Enter Rental Costs: ";
        errMes = "Rental Costs is Invalid (Costs > 0, Costs must be a Double). Please try again!!!";
        service.setRetalCosts(FuncValidation.checkValidNumberDouble(content, errMes));
        while (service.getRetalCosts() <= 0){
            System.out.println(errMes);
            service.setRetalCosts(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        content = "Enter Max Number of People: ";
        errMes = "Max Number of People is Invalid (Number of People > 0 and Number of People < 20, Number of People must be a Integer). Please try again!!!";
        service.setMaxNumberOfPeople(FuncValidation.checkValidNumberInteger(content, errMes));
        while (service.getMaxNumberOfPeople() <= 0 || service.getMaxNumberOfPeople() >= 20){
            System.out.println(errMes);
            service.setMaxNumberOfPeople(FuncValidation.checkValidNumberInteger(content, errMes));
        }
        System.out.println("Enter Type Rent:");
        service.setTypeRent(sc.nextLine());
        while (!FuncValidation.checkNameService(service.getTypeRent())){
            System.out.println("Type Rent is Invalid. Please try again!!!");
            System.out.println("Enter Type Rent:");
            service.setTypeRent(sc.nextLine());
        }
        return service;
    }

    private static void addNewVilla(){
        String content = "";
        String errMes = "";
        Service villa = new Villa();
        villa = addNewService(villa);
        System.out.println("Enter Room Standard:");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        while (!FuncValidation.checkNameService(((Villa) villa).getRoomStandard())){
            System.out.println("Room Standard is Invalid. Please try again !!!");
            System.out.println("Enter Room Standard:");
            ((Villa)villa).setRoomStandard(sc.nextLine());
        }
        System.out.println("Enter Convenient Description");
        ((Villa)villa).setConvenientDescription(sc.nextLine());

        content = "Enter Area Pool: ";
        errMes = "Area Pool is Invalid (Area Pool > 30, Area Pool must be a Double). Please try again!!!";
        ((Villa) villa).setAreaPool(FuncValidation.checkValidNumberDouble(content, errMes));
        while (((Villa) villa).getAreaPool() <= 30){
            System.out.println(errMes);
            ((Villa) villa).setAreaPool(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        content = "Enter Number of Floor: ";
        errMes = "Number of Floor is Invalid (Number of Floor > 0, Area Pool must be a Integer). Please try again!!!";
        ((Villa) villa).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        while (((Villa) villa).getNumberOfFloors() <= 0){
            System.out.println(errMes);
            ((Villa) villa).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        }
        ArrayList<Villa> listVilla = FunWriteAndReadFileCSV.getVillaFromCSV();
        listVilla.add((Villa) villa);
        FunWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\nAdd Villa: "+ villa.getNameService() + "Successfully!!!");
        backMainMenu();
    }
    private static void addNewHouse(){
        String content = "";
        String errMes = "";
        Service house = new House();
        house = addNewService(house);
        System.out.println("Enter Room Standard:");
        ((House) house).setRoomStandard(sc.nextLine());
        while (!FuncValidation.checkNameService(((House) house).getRoomStandard())){
            System.out.println("Room Standard is Invalid. Please try again !!!");
            System.out.println("Enter Room Standard:");
            ((House)house).setRoomStandard(sc.nextLine());
        }
        System.out.println("Enter Convenient Description");
        ((House)house).setConvenientDescription(sc.nextLine());

        content = "Enter Number of Floor: ";
        errMes = "Number of Floor is Invalid (Number of Floor > 0, Area Pool must be a Integer). Please try again!!!";
        ((House) house).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        while (((House) house).getNumberOfFloors() <= 0){
            System.out.println(errMes);
            ((House) house).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));
        }
       ArrayList<House> listHouse = FunWriteAndReadFileCSV.getHouseFromCSV();
        listHouse.add((House) house);
        FunWriteAndReadFileCSV.writeHouseToFileCSV(listHouse);
        System.out.println("\nAdd House: "+ house.getNameService() + "Successfully!!!");
        backMainMenu();
    }
    private static void addNewRoom(){
        String content = "";
        String errMes = "";
        Service room = new Room();
        room = addNewService(room);
        System.out.println("Enter Free Service: ");
        ((Room)room).setFreeService(sc.nextLine());

        ArrayList<Room> listRoom = FunWriteAndReadFileCSV.getRoomFromCSV();
        listRoom.add((Room) room);
        FunWriteAndReadFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\nAdd Room: "+ room.getNameService() + "Successfully!!!");
        backMainMenu();
    }
    private static void showInforEmployee(){
        Employee employee1 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Dao",40,"Quang Binh");
        Employee employee2 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Lien",20,"Quang Tri");
        Employee employee3 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hoang",28,"Quang Nam");
        Employee employee4 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Duc",20,"Quang Ninh");
        Employee employee5 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Vuong",30,"Quang Ngai");
        Employee employee6 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hai",22,"Quang Nam");
        Employee employee7 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hung",25,"Hue");
        Employee employee8 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Nam",27,"Binh Dinh");
        Employee employee9 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hong",25,"Quang Binh");
        Employee employee10 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Ha",33,"Quang Nam");
        Map<String, Employee> map = new HashMap<String, Employee>();
        map.put(employee1.getIdEmployee(), employee1);
        map.put(employee2.getIdEmployee(), employee2);
        map.put(employee3.getIdEmployee(), employee3);
        map.put(employee4.getIdEmployee(), employee4);
        map.put(employee5.getIdEmployee(), employee5);
        map.put(employee6.getIdEmployee(), employee6);
        map.put(employee7.getIdEmployee(), employee7);
        map.put(employee8.getIdEmployee(), employee8);
        map.put(employee9.getIdEmployee(), employee9);
        map.put(employee10.getIdEmployee(), employee10);
        Set<String> set = map.keySet();
        System.out.println("List Employee in Resort: ");
        for (String key : set) {
            System.out.println(key + " " + map.get(key).getNameEmployee());
        }
        displayMainMenu();
        }

    private static void showInforCusBuyTickets() {
        Customer customer1 = new Customer("Cus01","Haong","female",123456789,123456,"haong@gmai.com","Vip","quang tri","12/02/1999");
        Customer customer2 = new Customer("Cus02","Hung","female",123456789,123456,"haong@gmai.com","Vip","quang tri","12/02/1999");
        Customer customer3 = new Customer("Cus03","Hien","female",123456789,123456,"haong@gmai.com","Vip","quang tri","12/02/1999");
        Customer customer4 = new Customer("Cus04","Nam","female",123456789,123456,"haong@gmai.com","Vip","quang tri","12/02/1999");
        Customer customer5 = new Customer("Cus05","Nghia","female",123456789,123456,"haong@gmai.com","Vip","quang tri","12/02/1999");

        Queue<Customer> myTicket = new LinkedList<Customer>();
        myTicket.offer(customer1);
        myTicket.offer(customer2);
        myTicket.offer(customer3);
        myTicket.offer(customer4);
        myTicket.offer(customer5);
        while (!myTicket.isEmpty()) {
            System.out.println(myTicket.remove().getNameCustomer() + " 1");
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void searchEmployee() {
        Employee employee1 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Dao",40,"Quang Binh");
        Employee employee2 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Lien",20,"Quang Tri");
        Employee employee3 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hoang",28,"Quang Nam");
        Employee employee4 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Duc",20,"Quang Ninh");
        Employee employee5 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Vuong",30,"Quang Ngai");
        Employee employee6 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hai",22,"Quang Nam");
        Employee employee7 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hung",25,"Hue");
        Employee employee8 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Nam",27,"Binh Dinh");
        Employee employee9 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Hong",25,"Quang Binh");
        Employee employee10 = new Employee(UUID.randomUUID().toString().replace("-", ""),"Ha",33,"Quang Nam");
        FileCabinet fileCabinet = new FileCabinet();
        fileCabinet.showFile = new Stack<>();
        fileCabinet.showFile.push(employee1);
        fileCabinet.showFile.push(employee2);
        fileCabinet.showFile.push(employee3);
        fileCabinet.showFile.push(employee4);
        fileCabinet.showFile.push(employee5);
        fileCabinet.showFile.push(employee6);
        fileCabinet.showFile.push(employee7);
        fileCabinet.showFile.push(employee8);
        fileCabinet.showFile.push(employee9);
        fileCabinet.showFile.push(employee10);
        System.out.println("List Employee in Resort: ");
        while (!fileCabinet.showFile.isEmpty()) {
            System.out.println(fileCabinet.showFile.pop().getNameEmployee());
        }
        System.out.println("Choose Employee You Want Find: ");
        int choose = sc.nextInt();



//
//        for (int i = 0; i < fileCabinet.showFile.size(); i++) {
//            if (i == choose ){
//                System.out.println(fileCabinet.showFile.get(i).toString());
//            }else System.out.println("Cannot Find This Employee!!!");
//        }
        backMainMenu();
    }
    }





