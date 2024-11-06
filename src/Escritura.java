import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura  {
    public static void main(String[] args) {

        String filePath = "Arxiu2.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 1; i < 11; i++) {
                String info = "Fila nombre:" + i + "\n";
                bw.write(info);
            }
        }catch(IOException e){
            System.out.println("error");
        }
    }
}
