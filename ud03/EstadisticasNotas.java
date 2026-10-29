import java.util.Scanner;

public class EstadisticasNotas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double contador = 0;
        double suma = 0;
        double media = 0;
        double notaMáxima = 0;

        System.out.println("Introducir un número(-1 para terminar): ");

        numero = scanner.nextDouble();

        while(numero != -1){
            contador++;
            suma += numero;
            media = suma/contador;

            System.out.println("Notas leídas: " + contador);
            System.out.println("Nota medria: " + media);
            System.out.println("Nota máxima: " + notaMáxima);

        }

           
    }
}