import java.util.Scanner;

public class Eight_calcular_salario {

    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.print("¿Cuantas horas has trabajado?: ");
        double worksHours = scanner.nextDouble();

    
        System.out.print("¿Cuanto pagan por hora?: ");
        double payHour = scanner.nextDouble();

        if (worksHours > 60) {
            
            double pay = (worksHours * payHour) * 1.5;
            System.out.print("El pago total es de: " + pay);


        }else{

            double pay = worksHours * payHour;
            
            System.out.print("El pago total es de: " + pay);

        }

        scanner.close();
    }
}
