import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);) { //append true não substitui o texto.
          fw.write("Meu nome é Samuel...\n E eu sou legal");
          fw.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}