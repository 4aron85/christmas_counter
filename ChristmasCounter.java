import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChristmasCounter {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Get Christmas date
        LocalDate christmas = LocalDate.of(today.getYear(), Month.DECEMBER, 25);
        
        // Calculate days until Christmas
        long daysUntilChristmas = ChronoUnit.DAYS.between(today, christmas);
        
        // Print the result
        System.out.println("There are " + daysUntilChristmas + " days until Christmas");
    }
}