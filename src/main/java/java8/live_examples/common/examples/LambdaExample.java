package java8.live_examples.common.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


public class LambdaExample {

    public static void main(String[] args)

    // zadanie, w którym mieliśmy wyfiltrować liczby dodatnie i zsumować
    {
        List<Integer> listInt = Arrays.asList(8, 9, 111, 23, 44, 55, 1, -123, 66, 88, -12345);

        System.out.println(
                listInt
                        .stream()             // (tworzymy strumień
                        .mapToInt(x -> x)     // mapujemy do strumienia intów
                        .filter(x -> x >= 0)  // filtrujemy nieujemne liczby
                        .sum()                // i sumujemy
        );

        ;
        // Collectiom.frequency(collection.element)
        // Stream<T>.count()
        // Znaleźć ilość powtarzających się wartości w mapie
        Map<String, String> map = new HashMap<>();
        map.put("01", "aa");
        map.put("02", "bb");
        map.put("03", "cc");
        map.put("04", "dd");
        map.put("05", "aa");

        System.out.println(
                map.values()
                        .stream()
                        .distinct()
                        .filter(x -> Collections.frequency(map.values(), x) > 1)
                        .count()
        );

        // FORMAT: YYYY-MM-dd
        // Przekształcić listę dat do listy stringów wedle formatu podanego powyżej

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        List<LocalDate> dates = Arrays.asList(
                LocalDate.now(), LocalDate.now().plusDays(2), LocalDate.now().minusMonths(1));
                List<String> dateString = dates.stream().map(date -> date.format(formatter)).collect(Collectors.toList());
        System.out.println(dateString);

    }

}
