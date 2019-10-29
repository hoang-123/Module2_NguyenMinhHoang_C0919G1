package CaseStudy.FuramaResort.Controllers;

        import java.util.Scanner;

public class MainControllers<E> {

    public E addNewServies() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a Service:" +
                "\n1. Add New Villa" +
                "\n2. Add New House" +
                "\n3. Add New Room" +
                "\n4. Back to menu" +
                "\n5. Exit");
        return (E) input.nextLine();
    }

    public void displayMainMenu() {
        System.out.println("1. Add New Services\n" +
                "2. Show Services\n" +
                "3.Exit\n");
    }
    public void showServices(){
        System.out.println("1. Show All Villa\n" +
                            "2. Show All House\n" +
                            "3. Show All Room\n" +
                            "4. Back to menu\n" +
                            "5. Exit\n");
    }





}

