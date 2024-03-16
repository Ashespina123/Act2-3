package espinalabactivity2.pkg3;


public class PrintTextEditor extends TextEditor {

    public PrintTextEditor(String text) {
        super(text);
    }

    public void print() {
        System.out.println(getText());
    }

    private boolean getText() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}