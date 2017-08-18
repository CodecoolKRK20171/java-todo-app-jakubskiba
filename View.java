import java.util.Scanner;
public class View{
    public static void printPrompt(){
        System.out.println("Please specify a command [list, add, mark, archive, exit]: ");
    }

    public static String getChoice(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();   
    }

    public static void printChoiceError(){
        System.out.println("No such option.");
    }

    public static void printListHeader(){
        System.out.println("You saved the following to-do items:");
    }

    public static void printTodoItem(TodoItem item, Integer index){
        String isMarked;
        if(item.isMarked) isMarked = "x";
        else isMarked = " ";
        System.out.printf("%d. [%s] %s%n", index, isMarked, item.task);
    }

    public static String getTaskContent(){
        Scanner in = new Scanner(System.in);
        System.out.print("Add an item: ");
        String taskContent = in.nextLine();
        System.out.println("\nItem added.");
        return taskContent;
    }

    public static Integer getTaskIndex(){
        Scanner in = new Scanner(System.in);
        System.out.print("Which one you want to mark as completed: ");
        Integer taskIndex = in.nextInt();
        return taskIndex;
    }

    public static void printNoSuchIndexError(){
        System.out.println("No such index.");
    }
}