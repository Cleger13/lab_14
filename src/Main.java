import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main{
    public static void main(String[] args){
        Frame f = new Frame("Sum of two digits");

        Label lb1, lb2, lb3;
        lb1 = new Label("a");
        lb2 = new Label("b");
        lb3 = new Label("sum");
        lb1.setBounds(100, 110, 20, 30);
        lb2.setBounds(100, 140, 20, 30);
        lb3.setBounds(90, 170, 30, 30);

        TextField tf1, tf2, tf3;
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf1.setBounds(120, 110, 80, 25);
        tf2.setBounds(120, 140, 80, 25);
        tf3.setBounds(120, 170, 80, 25);
        tf3.setEditable(false);

        Button bt1 = new Button("Calculate");
        Button bt2 = new Button("Clear");
        bt1.setBounds(120, 210, 80, 30);
        bt2.setBounds(120, 245, 60, 30);

        f.add(lb1);
        f.add(lb2);
        f.add(lb3);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(bt1);
        f.add(bt2);

        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    int result = num1 + num2;
                    tf3.setText(String.valueOf(result));
                }
                catch (NumberFormatException ne){
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("error");
                }
            }
        });

        bt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });

        f.setSize(340, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
}