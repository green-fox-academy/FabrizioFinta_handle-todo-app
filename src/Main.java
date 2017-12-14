public class Main {
  public static void main(String[] args) {
    TodoOp todo = new TodoOp();
    if (args.length == 0){
      System.out.println("Command Line Todo application\n" +
                                 "=============================\n" +
                                 "\n" +
                                 "Command line arguments:\n" +
                                 " -l   Lists all the tasks\n" +
                                 " -a   Adds a new task\n" +
                                 " -r   Removes an task\n" +
                                 " -c   Completes an task");
    } else if (args[0].contains("-l")) {
      if (!(todo.elementList.size() == 0)){
      //TODO list all the elements in order to 1 - index:0; 2 - index:1; ...so on
     } else {
     // System.out.println("No todos for today! :)");
    //}
    } else if (args[0].contains("-a")){
      //TODO add elements to the element list -a "Feed the monkey"
      //TODO when after -a there is no string or the value is not string must trhow: Unable to add: no task provided
    } else if (args[0].contains("-r")){
      //TODO remove elements -r index
      //TODO index > elements.size throw: Unable to remove: index is out of bound
      //TODO index = String || index != int : Unable to remove: index is not a number
    } else if (args.length == 2 && args[0].contains("-c")){
      //TODO shows a todo at the args[1] index
      //TODO if it is nothing there trhows: Unable to check: index is out of bound
      //TODO if there is nothing at args[1] throws: Unable to check: no index provided
      //TODO if there is a string or anything instead of number than throws: Unable to check: index is not a number
    } else {
      //TODO if there is nothing recognized argument then throws: Invaild argument. && throws the command todo's help screen
    }
    
    
  }
}
