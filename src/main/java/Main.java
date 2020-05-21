import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main ( String[] args ) throws FileNotFoundException, ParseException {
        Gson gson = new Gson ( );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY");
        LocalDate egrulDate = LocalDate.now ();

        List < CompanyInfo > companyInfoList = new ArrayList <> ( );
        companyInfoList = gson.fromJson ( new FileReader
                        ( new File ( "test.json" ) ) ,
                new TypeToken < List < CompanyInfo > > ( ) {
                }.getType ( ) );

    companyInfoList.stream ( ).forEach ( s -> System.out.println ( s.nameShort + " " + formatter.format ( egrulDate )) );
    System.out.println ( "---------------------------------------------------------------" );




        }
    }
