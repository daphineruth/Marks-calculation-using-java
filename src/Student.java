import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JButton calcButton;
    private JTextField textMarks1;
    private JTextField textMarks2;
    private JTextField textMarks3;
    private JTextField textTotal;
    private JTextField textAvg;
    private JTextField textGrade;
    private JPanel Main;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
