package bf.isge.gsn.desktop;

import bf.isge.gsn.model.Todo;

import javax.swing.*;
import java.time.LocalDate;

public class DesktopApp {
    public static void main(String[] args) {
        Todo todo = new Todo(1, "First todo", LocalDate.now());
        JOptionPane.showMessageDialog(null, todo);
    }
}
