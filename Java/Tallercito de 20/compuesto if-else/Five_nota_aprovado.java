import java.util.Scanner;

public class Five_nota_aprovado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nota para ver si ya aprovaste:");
        int nota = scanner.nextInt();

        if (nota < 10){

            System.out.println("Desaprovado");

        }else if (nota <= 13) {

            System.out.println("Regular");             

        } else if(nota <= 17){

            System.out.println("Bueno");

        }else if(nota < 20){

            System.out.println("Exelente");

        }
                    
        scanner.close();
    }
    
}