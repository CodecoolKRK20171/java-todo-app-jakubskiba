/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
import java.util.ArrayList;

public class TodoList{
    private ArrayList<TodoItem> todoList;

    public TodoList(){
        todoList = new ArrayList<>();
    }

    public void add(String task){
        todoList.add(new TodoItem(task));
    }

    public void mark(Integer index){
        todoList.get(index).mark();
    }

    public void list(){
        View.printListHeader();
        for(int i = 0; i < todoList.size(); i++){
            View.printTodoItem(this.todoList.get(i), i);
        }
    }

    public void archive(){
        for(TodoItem item : todoList){
            if(item.isMarked) todoList.remove(item);
        }
    }
}
