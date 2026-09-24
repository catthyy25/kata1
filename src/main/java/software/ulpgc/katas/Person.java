package software.ulpgc.katas;

import java.time.LocalDate;
import java.util.Objects;

public final class Person {

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private static final double DAYS_PER_YEAR = 365.25;
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    private int toYears(long days) {
        return (int) (days / DAYS_PER_YEAR);
    }

    public String name() {
        return name;
    }

    public LocalDate birthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "birthday=" + birthday + ']';
    }

}
