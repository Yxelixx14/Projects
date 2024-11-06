import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
    public static void main(String[] args) {
        String filePath = "Arxiu.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}
