package ud03;

import java.util.Scanner;

public class EstadisticasNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double contador = 0;
        double suma = 0;
        double media = 0;
        
        double notaMaxima = 0;
        double notaMinima = 0;

        System.out.println("Introducir un número(-1 para terminar): ");

        nota = scanner.nextDouble();

        while(nota != -1){

            if(contador == 0){
                notaMaxima = nota;
                notaMinima = nota;

            }else{
                if(nota > notaMaxima){
                    notaMaxima = nota;
                }
                if(nota < notaMinima){
                    notaMinima = nota;
                }
            }
            contador++;
            suma += nota;

            nota = scanner.nextDouble();
           
        }
        System.out.println("Notas leídas: " + contador);
            
        if(contador == 0){

            System.out.println("Nota media: no hay notas leídas. ");
            System.out.println("Nota máxima: no hay.");
            System.out.println("Nota mínima: no hay.");
        }else{
        media = suma / contador;

        System.out.println("Nota media: " + media);
        System.out.println("Nota máxima: " + notaMaxima);
        System.out.println("Nota Minima: " + notaMinima);

        }
        

        scanner.close();           
    }
}
    

