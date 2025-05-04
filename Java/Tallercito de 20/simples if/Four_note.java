import java.util.Scanner;

public class Four_note {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloca la nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 10){
            System.out.print("aprobado");
        }
        if (nota < 10){
            System.out.print("reprobado");
        }
       
        scanner.close();
    }
}
