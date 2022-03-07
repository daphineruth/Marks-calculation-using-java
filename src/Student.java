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
    private JTextField textName;

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

                int n1,n2,n3,tot;
                double avg;


                n1 = Integer.parseInt(textMarks1.getText());
                n2 = Integer.parseInt(textMarks2.getText());
                n3 = Integer.parseInt(textMarks3.getText());

                tot = n1 + n2 + n3 ;
                textTotal.setText(String.valueOf(tot));

                avg = tot/3 ;
                textAvg.setText(String.valueOf(avg));

                if (avg > 50)
                {
                    textGrade.setText("pass");
                }
                else {
                    textGrade.setText("fail");
                }

            }
        });
    }
}
