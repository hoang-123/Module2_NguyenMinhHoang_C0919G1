package Controllers;

import Commons.FunWriteAndReadFileCSV;
import Models.Service;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu(){
        System.out.println("\n1.Add new Service. "+
                "\n2.Show Service. "+
                "\n3.Exit. "+
                "\nPlease select one function below: ");
        switch (sc.nextInt()){
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("\nError. Back to Menu.");
                backMainMenu();
        }
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
        switch (sc.nextInt()){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                System.out.println("\n-------------");
                break;
            case 5:
                System.exit(0);
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
                "\n4.Back to Menu. " +
                "\n5.Exit. " +
                "\nPlease select one function below: ");
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
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
            villa.showInfor();
            System.out.println("--------------");
        }
        }
    private static void showAllHouse(){
    }
    private static void showAllRoom(){
    }





    private static Service addNewService(Service service){
        service.setId(UUID.randomUUID().toString().replace("-", ""));
        System.out.println("Enter name Service: ");
        service.setNameService(sc.nextLine());
        System.out.println("Enter Area Used: ");
        service.setAreaUsed(sc.nextDouble());
        System.out.println("Enter Rental Costs: ");
        service.setRetalCosts(sc.nextDouble());
        System.out.println("Enter Max Number of People: ");
        service.setMaxNumberOfPeople(sc.nextInt());
        System.out.println("Enter Type Rent:");
        service.setTypeRent(sc.nextLine());
        return service;
    }



    private static void addNewVilla(){
        Service villa = new Villa();
        villa = addNewService(villa);
        System.out.println("Enter Room Standard:");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        System.out.println("Enter Convenient Description");
        ((Villa)villa).setConvenientDesctiption(sc.nextLine());
        System.out.println("Enter Area Pool:");
        ((Villa)villa).setAreaPool(sc.nextDouble());
        System.out.println("Enter Number of Floor: ");
        ((Villa)villa).setNumberOfFloors(sc.nextInt());
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        FunWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\nAdd Villa: "+ villa.getNameService() + "Successfully!!!");
        backMainMenu();
    }
    private static void addNewHouse(){}
    private static void addNewRoom(){}







}
