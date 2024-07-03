import java.util.Date;
import java.text.SimpleDateFormat;

public class digitalClock {
    public static void main(String[] args) 
    {
        while (true) 
        {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            String timeString = formatter.format(date);
            System.out.print("\r" + timeString);

            try 
            {
                Thread.sleep(1000);  
            } 
            catch (Exception e) 
            {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
