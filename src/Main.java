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
    } else if ((args[0].contains("-a"))){
        if (args.length == 2) {
        todo.addTodo(args[1]);
          System.out.println("Task \"" + args[1] + "\" succesfully added!");
        } else if (args.length > 2){
          System.err.println("Unable to add: syntax error.");
          System.out.println("Hint: Did you put your \"task\" in quotation marks?");
        } else {
          System.err.println("Unable to add: no task provided");
        }
    } else if ((todo.getElementList().size() == 0)) {
      System.out.println("No todos for today! :)\n" +
                                 "Add some with '-a' command!");
    } else if (args[0].contains("-l")) {
      todo.addOrder();
      todo.printList();
    } else if (args[0].contains("-r")){
      if (args[0].contains("-r") && !(args.length==1)) {
        try {
          int index = Integer.parseInt(args[1]) - 1;
          todo.removeTodo(index);
        } catch (NumberFormatException e) {
          System.err.println("Unable to remove: index is not a number");
        } catch (IndexOutOfBoundsException e) {
          System.err.println("Unable to remove: index is out of bound");
        }
      } else {
        System.err.println("Please give the index of the task which you would like to remove!");
      }
    } else if (args.length == 2 && args[0].contains("-c")){
      try {
          int index = Integer.parseInt(args[1]) - 1;
          todo.setDone(index);
          todo.addStatus();
          System.out.println(todo.getElement(index));
      } catch (IndexOutOfBoundsException e) {
        System.err.println("Unable to check: index is out of bound");
      } catch (NumberFormatException e) {
        System.err.println("Unable to check: index is not a number");
      }
    } else if (args[0].contains("-c")){
      todo.addStatus();
      todo.printList();
    } else {
      System.err.println("Invaild argument.");
      System.out.println();
      System.out.println("Command Line Todo application\n" +
                                 "=============================\n" +
                                 "\n" +
                                 "Command line arguments:\n" +
                                 " -l   Lists all the tasks\n" +
                                 " -a   Adds a new task\n" +
                                 " -r   Removes an task\n" +
                                 " -c   Completes an task");
    }
  }
}
