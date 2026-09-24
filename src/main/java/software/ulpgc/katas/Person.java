package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private static final double DAYS_PER_YEAR = 365.25;

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }
}
