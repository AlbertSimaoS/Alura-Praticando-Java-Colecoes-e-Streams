import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> square = numeros.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());

        System.out.printf("Quadrados dos números:" + square);
    }
}
