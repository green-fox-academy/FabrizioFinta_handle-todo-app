import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Database {
  
  private Path file = Paths.get("Database.txt");
  private List<String> dataList;
  private List<Element> getElementList;
  
  Database(){
    try {
      this.dataList = new ArrayList<String>(Files.readAllLines(file));
      this.getElementList = new ArrayList<>();
      for (int index = 0; index < dataList.size(); index++) {
        Element task = new Element(dataList.get(index));
        getElementList.add(task);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public List<String> getDatabaseArray() {
    try {
      List<String> dataArray = new ArrayList<String>(Files.readAllLines(file));
      return dataArray;
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
  
  public void refreshDatabase() {
    List<String> tempList = new ArrayList<>();
    for (int index = 0; index < getElementList().size(); index++) {
      tempList.add(getElementList().get(index).toString());
    }
    try {
      Files.write(file, tempList);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public List<Element> getElementList(){
    return this.getElementList;
  }
}
