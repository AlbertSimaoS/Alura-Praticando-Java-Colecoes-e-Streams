import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "José");
        clientes.put(2, "Marta");
        clientes.put(3, "Marcus");

        System.out.printf("O nome do cliente com ID 2 é: %s%n",
            clientes.get(2));
    }
}
