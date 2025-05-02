import java.util.Scanner;

public class Teen_daysLives {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantos años tienes?: ");
        int years = scanner.nextInt();
    
        int days = years*365;
        
        System.out.print("Has vivido: "+ days + " días");

        scanner.close();
    }
}
