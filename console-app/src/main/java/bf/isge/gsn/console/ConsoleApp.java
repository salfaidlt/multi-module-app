package bf.isge.gsn.console;

import bf.isge.gsn.model.Todo;

import java.time.LocalDate;

public class ConsoleApp {
    public static void main(String[] args) {
        Todo todo = new Todo(1, "First todo", LocalDate.now());
        System.out.println(todo);
    }
}
