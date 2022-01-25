package forEach;

public class ProgramForEach {
    public static void main(String[] args) {
        String[] vetor = new String[] { "Maria", "Bob", "Alex"};

        for (String nome : vetor) { //Tipo da variavel - nome da variavel - lista para buscar
            System.out.println(nome);
        }
    }
}
