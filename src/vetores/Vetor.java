package vetores;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vetor[] = new double[5];

        double a = 0;

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextDouble();
            a = a + vetor[i];
        }

        a = a / vetor.length;

        System.out.println(a);


    }
}
