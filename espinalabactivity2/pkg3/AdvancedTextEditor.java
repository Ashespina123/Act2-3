package espinalabactivity2.pkg3;


import java.util.Stack;
public class AdvancedTextEditor extends TextEditor {

    private final Stack<String> history;

    public AdvancedTextEditor(String text) {
        super(text);
        history = new Stack<>();
    }

    public void undo() {
        if (!history.isEmpty()) {
            setText(history.pop());
        }
    }

    @Override
    public void append(String newText) {
        history.push(getText());
        super.append(newText);
    }

    @Override
    public void delete(int n) {
        history.push(getText());
        super.delete(n);
    }

    private void setText(String pop) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}