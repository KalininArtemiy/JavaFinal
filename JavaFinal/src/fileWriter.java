import java.io.BufferedWriter;
import java.io.FileWriter;

public class fileWriter {
    public void writer(){
        String fileName = "result";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
                for (Toy toy : Loterey){
                    writer.write(String.format("Id: %d, Название: %s, Частота выпадения: %.2fn", toy.getId(), toy.getName(), toy.gerFrequency()));
                    }
                }
        catch (Exception e) {
            System.err.format("IOException: %s%n", e);
            }
        
        }
}
