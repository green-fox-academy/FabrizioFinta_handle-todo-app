import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Database {
  
  Path database = Paths.get("tododatabase.txt");
  
  public List<String> getDatabaseArray() {
    try {
      List<String> dataArray = new ArrayList<String>(Files.readAllLines(database));
      for (String data : dataArray) ;
      return dataArray;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
  
  public void modifyDatabase(ArrayList freshData) {
    try {
      Files.write(database, freshData);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
