import java.util.Scanner;

public class Teen_salario_alto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca tu salario: ");
        double salario = scanner.nextDouble();

        if (salario > 3000) {
            System.out.println("Tienes un salario alto");
        }
        if (salario <= 3000) {
            System.out.println("Tienes un salario bajo");
        }

        scanner.close();
    }
}
