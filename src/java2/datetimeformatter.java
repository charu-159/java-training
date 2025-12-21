package java2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy --E H:m a");

        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df2);
        String myDate=dt.format(df2);
        System.out.println(myDate);


        String myDate1=dt.format(df);//locat date ko iss format par lane ka kaam karte hai yeh
        System.out.println(myDate1);
    }
}
