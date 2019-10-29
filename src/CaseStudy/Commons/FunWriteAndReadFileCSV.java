package Commons;

import Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FunWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static String[] headerRecordVilla = new String[]{"id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent", "roomStandard", "convenientDescription", "areaPool", "numberOfFloors"};
    private static final int NUM_OF_LINE_SKIP = 1;

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
                        villa.getTypeRent(), villa.getRoomStandard(), villa.getConvenientDesctiption(),
                        String.valueOf(villa.getAreaPool()),
                        String.valueOf(villa.getNumberOfFloors())
                });
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Villa> getVillaFromCSV(){
        Path path = Paths.get(pathVilla);
        if(!Files.exists(path)){
            try{
                Writer writer = new FileWriter(pathVilla);
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


}
