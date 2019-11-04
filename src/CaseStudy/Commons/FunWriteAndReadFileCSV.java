package CaseStudy.Commons;
import CaseStudy.Models.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FunWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final String pathCustomer = "src/Data/Customer.csv";
    private static final String pathBooking = "src/Data/Booking.csv";
    private static String[] headerRecordVilla = new String[]{"id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent", "roomStandard", "convenientDescription", "areaPool", "numberOfFloors"};
    private static String[] headerRecordHouse = new String[]{"id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent", "roomStandard", "convenientDescription", "numberOfFloors"};
    private static String[] headerRecordRoom = new String[]{"id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent", "freeService"};
    private static String[] headerRecordCustomer = new String[]{"idCus", "nameCustomer", "gender", "idCard", "phone", "mail", "typeCustomer", "address", "birthday"};
    private static String[] headerRecordBooking = new String[]{"idCus", "nameCustomer", "gender", "idCard", "phone", "mail", "typeCustomer", "address", "birthday", "id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent"};
    private static final int NUM_OF_LINE_SKIP = 1;


    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList){
        try(Writer writer = new FileWriter(pathCustomer);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END))
        { csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer: arrayList){
                csvWriter.writeNext(new String[]{
                        customer.getIdCus(), customer.getNameCustomer(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getPhone()),
                        customer.getMail(), customer.getTypeCustomer(), customer.getAddress(),
                        customer.getBirthday()});
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList){
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END))
            { csvWriter.writeNext(headerRecordVilla);
            for (Villa villa: arrayList){
                csvWriter.writeNext(new String[]{
                    villa.getId(), villa.getNameService(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRetalCosts()),
                        String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getTypeRent(), villa.getRoomStandard(), villa.getConvenientDescription(),
                        String.valueOf(villa.getAreaPool()),
                        String.valueOf(villa.getNumberOfFloors())});
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void writeHouseToFileCSV(ArrayList<House> arrayList){
        try(Writer writer = new FileWriter(pathHouse);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END))
        { csvWriter.writeNext(headerRecordVilla);
            for (House house: arrayList){
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getNameService(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRetalCosts()),
                        String.valueOf(house.getMaxNumberOfPeople()),
                        house.getTypeRent(), house.getRoomStandard(), house.getConvenientDescription(),
                        String.valueOf(house.getNumberOfFloors())});
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writeRoomToFileCSV(ArrayList<Room> arrayList){
        try(Writer writer = new FileWriter(pathRoom);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END))
        { csvWriter.writeNext(headerRecordRoom);
            for (Room room: arrayList){
                csvWriter.writeNext(new String[]{
                        room.getId(), room.getNameService(),
                        String.valueOf(room.getAreaUsed()),
                        String.valueOf(room.getRetalCosts()),
                        String.valueOf(room.getMaxNumberOfPeople()),
                        String.valueOf(room.getFreeService())});
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    public static void writeBookingToFileCSV(ArrayList<Customer> arrayList){
        try(Writer writer = new FileWriter(pathBooking);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END))
        { csvWriter.writeNext(headerRecordBooking);
            for (Customer customer: arrayList){
                csvWriter.writeNext(new String[]{
                        customer.getIdCus(), customer.getNameCustomer(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getPhone()),
                        customer.getMail(), customer.getTypeCustomer(), customer.getAddress(),
                        customer.getBirthday(),
                        customer.getService().getId(), customer.getService().getNameService(), String.valueOf(customer.getService().getAreaUsed()),
                        String.valueOf(customer.getService().getRetalCosts()), String.valueOf(customer.getService().getMaxNumberOfPeople()), customer.getService().getTypeRent()});
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Villa> getVillaFromCSV(){
        Path path = Paths.get(pathVilla);
        if(!Files.exists(path)){
            try{ Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try{
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla)).withMappingStrategy(strategy).withSeparator(DEFAULT_SEPARATOR).withQuoteChar(DEFAULT_QUOTE).withSkipLines(NUM_OF_LINE_SKIP).withIgnoreLeadingWhiteSpace(true).build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }
    public static ArrayList<House> getHouseFromCSV(){
        Path path = Paths.get(pathHouse);
        if(!Files.exists(path)){
            try{ Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try{
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse)).withMappingStrategy(strategy).withSeparator(DEFAULT_SEPARATOR).withQuoteChar(DEFAULT_QUOTE).withSkipLines(NUM_OF_LINE_SKIP).withIgnoreLeadingWhiteSpace(true).build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    public static ArrayList<Room> getRoomFromCSV(){
        Path path = Paths.get(pathRoom);
        if(!Files.exists(path)){
            try{ Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try{
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom)).withMappingStrategy(strategy).withSeparator(DEFAULT_SEPARATOR).withQuoteChar(DEFAULT_QUOTE).withSkipLines(NUM_OF_LINE_SKIP).withIgnoreLeadingWhiteSpace(true).build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

    public static ArrayList<Customer> getCustomerFromCSV(){
        Path path = Paths.get(pathCustomer);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> csvToBean = null;
        try{
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer)).withMappingStrategy(strategy).withSeparator(DEFAULT_SEPARATOR).withQuoteChar(DEFAULT_QUOTE).withSkipLines(NUM_OF_LINE_SKIP).withIgnoreLeadingWhiteSpace(true).build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }

    public static ArrayList<Customer> getBookingFromCSV(){
        ArrayList<Customer> listBooking  = new ArrayList<>();
        BufferedReader br = null;
            try{
                String line;
                br = new BufferedReader(new FileReader(pathBooking));
                while ((line = br.readLine()) != null){
                    String[] data = line.split(",");
                    if(data[1].equals("nameCustomer"))
                        continue;
                    Customer customer = new Customer();
                    Service villa = new Villa();
                    customer.setIdCus(data[0]);
                    customer.setNameCustomer(data[1]);
                    customer.setGender(data[2]);
                    customer.setIdCard(Integer.parseInt(data[3]));
                    customer.setPhone(Integer.parseInt(data[4]));
                    customer.setMail(data[5]);
                    customer.setTypeCustomer(data[6]);
                    customer.setAddress(data[7]);
                    customer.setBirthday(data[8]);
                    villa.setId(data[9]);
                    villa.setNameService(data[10]);
                    villa.setAreaUsed(Float.parseFloat(data[11]));
                    villa.setRetalCosts(Float.parseFloat(data[12]));
                    villa.setMaxNumberOfPeople(Integer.parseInt(data[13]));
                    villa.setTypeRent(data[14]);
                    customer.setService(villa);
                    listBooking.add(customer);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }finally {
                try {
                    if (br != null)
                        br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return listBooking;
    }
    public static TreeSet<String> getAllNameServicesFromCSV(String path){
        BufferedReader br = null;
        TreeSet<String> result = new TreeSet<String>();
        try {
            String line;
            br = new BufferedReader(new FileReader(path));
            while (br.readLine() != null){
                line = br.readLine();
             if(getNameServicesFromFile(line).equals("nameService")) {
                 continue;
             }
             result.add(getNameServicesFromFile(line));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static String getNameServicesFromFile(String csvLine){
        String name = "";
        if(csvLine != null){
            String[] splitData = csvLine.split(",");
            name = splitData[1];
        }
        return name;
    }





}
