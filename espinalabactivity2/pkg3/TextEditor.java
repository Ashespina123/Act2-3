package espinalabactivity2.pkg3;



import java.util.Scanner;
import espinalabactivity2.pkg3.PrintTextEditor;
import espinalabactivity2.pkg3.TextEditor;
import espinalabactivity2.pkg3.AdvancedTextEditor;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial text:");
        String initialText = scanner.nextLine();
        System.out.println("Choose editor type (1 for Print, 2 for Advanced):");
        int editorType = scanner.nextInt();
        TextEditor editor;

        if (editorType == 2) {
            editor = new AdvancedTextEditor(initialText);
        } else {
            editor = new PrintTextEditor(initialText);
        }

        Tester.test(editor);
    }
}
