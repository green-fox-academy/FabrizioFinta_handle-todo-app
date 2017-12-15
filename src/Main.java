public class Main {
  
  public static void main(String[] args) {
    
    TodoOp todo = new TodoOp();
    
    if (args.length == 0){
      printIntro();
    } else if ((args[0].contains("-a"))){
        if (args.length == 2) {
        todo.addTodo(args[1]);
          System.out.println("Task \"" + args[1] + "\" succesfully added!");
        } else if (args.length > 2){
            System.err.println("Unable to add: syntax error.");
            System.err.println("You can just add one task at a time.");
            System.out.println("Hint: Did you put your \"task\" in quotation marks?");
        } else {
            System.err.println("Unable to add: no task provided");
        }
    } else if ((todo.getElementList().size() == 0)) {
        System.out.println("No todos for today! :)\n" +
                                   "Add some with '-a' command!");
    } else if (args[0].contains("-l")) {
        printStatus(todo);
    } else if (args[0].contains("-r")){
        if (args[0].contains("-r") && !(args.length==1)) {
          try {
            removeTodo(args, todo);
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
          changeStatus(todo,args);
        } catch (IndexOutOfBoundsException e) {
          System.err.println("Unable to check: index is out of bound");
        } catch (NumberFormatException e) {
          System.err.println("Unable to check: index is not a number");
        }
    } else if (args[0].contains("-c")){
        printStatus(todo);
    } else {
        System.err.println("Invaild argument.");
        System.out.println();
        printIntro();
    }
  }
  
  private static void changeStatus(TodoOp todo, String[] args){
    int index = Integer.parseInt(args[1]) - 1;
    todo.setDone(index);
    todo.addStatus();
    System.out.println(todo.getElement(index));
  }
  
  private static void printStatus(TodoOp todo){
    todo.addStatus();
    todo.printList();
  }
  
  private static void printIntro(){
    System.out.println("Command Line Todo application\n" +
                               "=============================\n" +
                               "\n" +
                               "Command line arguments:\n" +
                               " -l   Lists all the tasks\n" +
                               " -a   Adds a new task\n" +
                               " -r   Removes an task\n" +
                               " -c   Completes an task");
  }
  
  private static void removeTodo(String[] args, TodoOp todo){
    int index = Integer.parseInt(args[1]) - 1;
    todo.removeTodo(index);
  }
  
}
