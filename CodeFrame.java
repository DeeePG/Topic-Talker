import javax.swing.JFrame;

public class CodeFrame extends JFrame {

    CodeFrame(){

        this.add(new CodePanel());
        this.setTitle("Word Generator");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
