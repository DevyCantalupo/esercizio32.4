import java.time.Month;
import java.time.OffsetDateTime;

public class esercizio32di4 {
    public static void main(String[] args) {

        OffsetDateTime fecha = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(obtainYear(fecha));
        System.out.println(obtainMonth(fecha));
        System.out.println(obtainDay(fecha));
        System.out.println(obtainDayOfTheWeek(fecha));
    }

    public static String obtainDayOfTheWeek(OffsetDateTime fecha) {
        if (fecha == null) {
            return null;
        } else {
            return fecha.getDayOfWeek().name();
        }
    }

    public static Integer obtainDay(OffsetDateTime fecha) {
        if (fecha == null) {
            return null;
        } else {
            return fecha.getDayOfMonth();
        }
    }

    public static String obtainMonth(OffsetDateTime fecha) {
        if (fecha == null) {
            return null;
        } else {
            return String.valueOf(fecha.getMonth());
        }
    }

    public static Integer obtainYear(OffsetDateTime fecha) {
        if (fecha == null) {
            return null;
        } else {
            return fecha.getYear();
        }
    }
}

