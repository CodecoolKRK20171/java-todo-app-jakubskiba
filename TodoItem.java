/**
 * Class representing a single todo item.
 * 
 */
public class TodoItem{
    String task;
    boolean isMarked;

    public TodoItem(String task){
        this.task = task;
        this.isMarked = false;
    }

    public void mark(){
        this.isMarked = true;
    }
}
