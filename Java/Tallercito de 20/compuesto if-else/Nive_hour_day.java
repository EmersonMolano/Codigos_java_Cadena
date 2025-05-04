import java.util.Scanner;

class Nive_hour_day{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la hora (0-23): ");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora <= 12){
            System.out.println("Es de mañana");
        }else if (hora >= 13 && hora <= 18){
            System.out.println("Es de tarde");
        }else if (hora >= 19 && hora <= 23){
            System.out.println("Es de noche");
        }else{
            System.out.println("Es de madrugada");
        }
        
        scanner.close();
    }
}   
