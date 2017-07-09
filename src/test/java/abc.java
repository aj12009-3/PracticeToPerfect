import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class abc {

    public static  void main(String argsp[]) throws ParseException{
        System.out.println(getKeyForEntities("14-05-2014T18:53:17.386"));
    }

    private static String getKeyForEntities(String timestamp) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        Date date = dateFormat.parse(timestamp);
        return dateFormat.format(date);
    }
}
