import javax.xml.crypto.Data;

public class Todos {

  //TODO when you type -l you should print all of theese things stored in this array with indexes
  //TODO if there is nothing than should sout: No todos for today! :)
  
  Database data = new Database();
  
  public void seeToDos(){
    for (int index = 0; index < data.getDatabaseArray().size(); index++) {
      if (!(data.getDatabaseArray().get(index).substring(0,2) == "[X]")){
        System.out.println(data.getDatabaseArray().get(index));
      } else {
        System.out.println("[ ]" + data.getDatabaseArray().get(index));
      }
    }
  }
}
