import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> employeesList = new ArrayList<>();

        employeesList.add("João");
        employeesList.add("Maria");
        employeesList.add("Ana");
        employeesList.add("Pedro");
        employeesList.add("Antônio");

        System.out.printf("A segunda pessoa da lista é: " + employeesList.get(1));

        System.out.printf("\nTotal de funcionários: " + employeesList.size());
    }
}
