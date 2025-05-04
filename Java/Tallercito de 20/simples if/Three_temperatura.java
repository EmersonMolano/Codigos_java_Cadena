import java.util.Scanner;

public class Three_temperatura {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        //Escribe la temperatura en letra
        System.out.print("Coloca la temperatura que usaras (K(kelvin), C(celcius), F(fahrenheit)): ");
        String grados = scanner.nextLine().toUpperCase();

        //Escribe la temperatura en numero
        System.out.print("Coloca la temperatura: ");
        double temperatura = scanner.nextDouble();
        
        
        System.out.println("Has puesto que la temperatura es: " + temperatura + " °" + grados);
        
        switch (grados) {
            case "K":

                temperatura = temperatura - 273.15;
                break;
        
            case "C":
                
                break;

            case "F":
                
                temperatura = (temperatura - 32) * (5/9);
                break;

            default:
                break;
        }

        if (temperatura > 30) {
            System.out.println("Es mayor a 30°C");
        }
        if (temperatura <= 30) {
            System.out.println("Es menor a 30°C");
        }
    
        scanner.close();
    }

}
