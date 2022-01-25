package excecoes;

import java.util.Scanner;

public class TratandoExecoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String[] vetor = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vetor[position]);
        }catch (Exception e){
            System.out.println("Invalid position: " + e);
        }finally {
            System.out.println("Fim");
        }
    }
}
