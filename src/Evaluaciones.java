import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darías a la película Matrix:");
            nota = teclado.nextDouble();

            if (nota != -1){
                if (nota >= 1 && nota <= 10) {
                    mediaEvaluaciones += nota;
                    totalEvaluaciones++;
                } else {
                    System.out.println("Error: Ingresa números del 1 al 10.");
                }
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}