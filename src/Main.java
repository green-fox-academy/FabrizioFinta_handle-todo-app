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
      if (! (todo.getElementList().size() == 0)) {
        todo.addOrder();
        todo.printList();
      } else {
        System.out.println("No todos for today! :)");
      }
    } else if ((args[0].contains("-a"))){
        if (args.length == 2) {
        todo.addTodo(args[1]);
          System.out.println("Task " + args[1] + " succesfully added!");
        } else if (args.length > 2){
          System.err.println("Unable to add: syntax error.");
          System.out.println("Hint: Did you put your \"task\" in quotation marks?");
        } else {
          System.err.println("Unable to add: no task provided");
        }
    } else if (args[0].contains("-r")){
      try {
        int index = Integer.parseInt(args[1]);
        todo.removeTodo(index);
      } catch (NumberFormatException e) {
        System.err.println("Unable to remove: index is not a number");
      } catch (IndexOutOfBoundsException e) {
        System.err.println("Unable to remove: index is out of bound");
      }
    } else if (args.length == 2 && args[0].contains("-c")){
      try {
        int index = Integer.parseInt(args[1]);
        todo.addStatus();
        todo.getElement(index);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Unable to check: index is out of bound");
      }
      //TODO shows a todo at the args[1] index
      //TODO if it is nothing there trhows: Unable to check: index is out of bound
      //TODO if there is nothing at args[1] throws: Unable to check: no index provided
      //TODO if there is a string or anything instead of number than throws: Unable to check: index is not a number
    } else if (args[0].contains("-c")){
      todo.addStatus();
      todo.printList();
      //TODO if there is nothing recognized argument then throws: Invaild argument. && throws the command todo's help screen
    }
    
    
  }
}
