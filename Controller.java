import java.util.InputMismatchException;
public class Controller{
    boolean isProgramRunning = true;
    TodoList todoList = new TodoList();

    public void start(){
        
        while(isProgramRunning){
            View.printPrompt();
            String choice = View.getChoice();
            run(choice);
        }
    }

    private void run(String choice){
        switch(choice){
            case "list":
                list();
            break;

            case "add":
                add();
            break;

            case "mark":
                mark();
            break;

            case "archive":
                archive();
            break;

            case "exit":
                isProgramRunning = false;
            break;

            default:
                View.printChoiceError();
            break;
        }
    }

    private void list(){
        this.todoList.list();
    }
    
    private void add(){
        String taskContent = View.getTaskContent();
        this.todoList.add(taskContent);
    }

    private void mark(){
        this.todoList.list();
        try{
            Integer index = View.getTaskIndex();
            this.todoList.mark(index);
        } catch(IndexOutOfBoundsException e){
            View.printNoSuchIndexError();
        } catch(InputMismatchException e){
            View.printNoSuchIndexError();
        }
    }

    private void archive(){
        this.todoList.archive();
    }
}