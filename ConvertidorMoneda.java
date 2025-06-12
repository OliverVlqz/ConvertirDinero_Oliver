
import java.util.Scanner;
public class ConvertidorMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cantidad;
        System.out.println("Cual es la conversion de moneda que deseas realiza?");
        System.out.println("1. Pesos a Dolares");
        System.out.println("2. Pesos a Euros");
        System.out.println("3. Dolares a Pesos");
        System.out.println("4. Euros a Pesos");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese la cantidad en pesos:");
                cantidad = scanner.nextDouble();
                double dolares = convertirAPesosADolares(cantidad);
                System.out.printf("%.2f pesos son %.2f dolares%n", cantidad, dolares);
                break;
            case 2:
                System.out.println("Ingrese la cantidad en pesos:");
                cantidad = scanner.nextDouble();
                double euros = convertirAPesosAEuros(cantidad);
                System.out.printf("%.2f pesos son %.2f euros%n", cantidad, euros);
                break;
            case 3:
                System.out.println("Ingrese la cantidad en dolares:");
                cantidad = scanner.nextDouble();
                double pesosDeDolares = convertirADolaresAPesos(cantidad);
                System.out.printf("%.2f dolares son %.2f pesos%n", cantidad, pesosDeDolares);
                break;
            case 4:
                System.out.println("Ingrese la cantidad en euros:");
                cantidad = scanner.nextDouble();
                double pesosDeEuros = convertirAEurosAPesos(cantidad);
                System.out.printf("%.2f euros son %.2f pesos%n", cantidad, pesosDeEuros);
                break;
            default:
                System.out.println("Opcion no valida. Por favor, elige una opcion del 1 al 4.");
                break;

        }




    }

    public static double convertirAPesosADolares(double pesos) {
        final double TASA_CAMBIO_DOLARES = 17.5;
        return pesos / TASA_CAMBIO_DOLARES;
    }

    public static double convertirAPesosAEuros(double pesos) {
        final double TASA_CAMBIO_EUROS = 19.2; 
        return pesos / TASA_CAMBIO_EUROS;
    }
    public static double convertirADolaresAPesos(double dolares) {
        final double TASA_CAMBIO_PESOS = 17.5;
        return dolares * TASA_CAMBIO_PESOS;
    }
    public static double convertirAEurosAPesos(double euros) {
        final double TASA_CAMBIO_PESOS = 19.2;
        return euros * TASA_CAMBIO_PESOS;
    }
}