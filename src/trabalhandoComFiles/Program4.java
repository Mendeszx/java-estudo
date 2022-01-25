package trabalhandoComFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
    public static void main(String[] args) {

        String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite"};

        String path = "C:\\Users\\GuiZz\\Desktop\\cria.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {  //Cria um arquivo, para não recriar (new FileWriter(path, true)
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
