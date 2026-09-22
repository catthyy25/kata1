package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String name() {
        return name;
    }

    public LocalDate birthday() {
        return birthday;
    }

    public int age(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    public static final double DAYS_PER_YEARS = 365.25;

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEARS);
    }
}
