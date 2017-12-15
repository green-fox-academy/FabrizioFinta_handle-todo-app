public class TodoOp extends  Database{
  
  Element getElement(int index){
    return super.getElementList().get(index);
  }
  void setElement(String text){
    Element element = new Element(text);
  }
  
  void addOrder(){
    for (int index = 0; index < super.getElementList().size(); index++) {
      super.getElementList().get(index).editName(index+1 + " - ");
    }
  }
  void addStatus(){
    for (int index = 0; index < super.getElementList().size(); index++) {
      if (super.getElementList().get(index).getIsDone()) {
        super.getElementList().get(index).editName(index + 1 + " - " + " [x] ");
      } else {
        super.getElementList().get(index).editName(index + 1 + " - " + " [ ] ");
      }
    }
  }
  
  void printList(){
    for (int index = 0; index < super.getElementList().size(); index++) {
      System.out.println(super.getElementList().get(index));
    }
  }
  
  void addTodo(String name) {
    Element todo = new Element(name);
    getElementList().add(todo);
    refreshDatabase();
  }
  
}
