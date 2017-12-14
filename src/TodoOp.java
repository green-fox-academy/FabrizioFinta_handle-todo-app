public class TodoOp extends  Database{
  
  Element getElement(int index){
    return super.elementList.get(index);
  }
  void setElement(String text){
    Element element = new Element(text);
  }
  
  void addOrder(){
    for (int index = 0; index < super.elementList.size(); index++) {
      super.elementList.get(index).editName(index+1 + " - ");
    }
  }
  void addStatus(){
    for (int index = 0; index < super.elementList.size(); index++) {
      if (super.elementList.get(index).getIsDone()) {
        super.elementList.get(index).editName(index + 1 + " - " + " [x] ");
      } else {
        super.elementList.get(index).editName(index + 1 + " - " + " [ ] ");
      }
      
    }
  }
  
}
