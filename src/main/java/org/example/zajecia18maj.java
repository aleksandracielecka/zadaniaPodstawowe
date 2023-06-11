package org.example;

import java.time.*;

public class zajecia18maj {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
        LocalTime b = LocalTime.of(12, 14, 51);
        LocalDateTime c = LocalDateTime.parse("2007-12-03T10:15:30");

        LocalDate plus10dni = a.plusDays(10);
        LocalTime minus5godzin = b.minusHours(5);

        Instant d = Instant.now();
        int nano = d.getNano();
        long sec = d.getEpochSecond();

        LocalTime e = LocalTime.ofInstant(d, ZoneId.systemDefault());

        // ---

        Duration duration = Duration.between(b, minus5godzin); // różnica w godzinach
        Period period = Period.between(a, plus10dni); // różnica w datach


    }
}
