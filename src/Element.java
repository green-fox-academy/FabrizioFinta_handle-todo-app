import java.util.List;

public class Element {
  
  private String name;
  private boolean isDone;
  private List<Element> elementList;
  
  Element (String name){
    this.name = name;
    this.isDone = false;
  }
  
  Element (){
    this.name = name.substring(1);
    this.isDone = false;
  }
  
  void editName(String text){
    this.name += text;
  }
  
  boolean getIsDone(){
    return this.isDone;
  }
  void setDone(){
    this.isDone = true;
  }
  
}
