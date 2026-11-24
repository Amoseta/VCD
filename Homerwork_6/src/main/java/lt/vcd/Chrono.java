package lt.vcd;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono {
    public static long daysBetween(int year_from, int month_from, int day_from,
                                   int year_to, int month_to, int day_to) {
        LocalDate startDate = LocalDate.of(year_from, month_from, day_from);
        LocalDate endDate = LocalDate.of(year_to, month_to, day_to);

        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    static void main(String[] args) {
        // PVZ: Dienos tarp sausio 1, 2026 ir sausio 10, 2026
        long days = daysBetween(2026, 1, 1, 2026, 1, 10);
        System.out.println("Days between: " + days); // Output: 9

        // Example across a leap year (2026 has Feb 29)
        long leapYearDays = daysBetween(2026, 2, 28, 2026, 3, 1);
        System.out.println("Leap year days between: " + leapYearDays); // Output: 2
    }
}
