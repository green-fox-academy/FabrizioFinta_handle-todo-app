import java.awt.dnd.InvalidDnDOperationException;
import java.util.List;

public class Element {
  
  private String name;
  private boolean isDone;
  
  Element(String name) {
    this.name = name;
    if (name.startsWith("!")) {
      this.isDone = true;
    } else {
      this.isDone = false;
    }
  }
  
  void editName(String text) {
    if (this.name.startsWith("!")) {
      this.name = text + this.name.substring(1);
    } else {
      this.name = text + this.name;
    }
  }
  
  boolean getIsDone() {
    return this.isDone;
  }
  
  void setDone() {
    if (!(this.name.startsWith("!"))) {
      this.name = "!" + this.name;
      this.isDone = true;
    }
  }
  
  @Override
  public String toString() {
    return name;
  }
}