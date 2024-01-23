import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame{
    private static JTextField widthObj = new JTextField(16);
    private static JTextField heightObj = new JTextField(16);

    private static int width = 0;
    private static int height = 0;

    private static JLabel widthError = new JLabel();
    private static JLabel heightError = new JLabel();

    public Main(){
        super("MAKE A WINDOW");
        Container c =  getContentPane();
        c.setLayout(new GridLayout(2,1));

        JPanel x = new JPanel();
        x.setLayout(new FlowLayout());

        x.add(widthObj);
        JButton widthButton = new JButton("Enter Width");
        widthButton.addActionListener(new Button());
        x.add(widthButton);
        x.add(widthError);





        JPanel y = new JPanel();
        y.setLayout(new FlowLayout());

        y.add(heightObj);
        JButton heightButton = new JButton("Enter Height");
        y.add(heightButton);
        heightButton.addActionListener(new Button());
        y.add(heightError);



        c.add(x);
        c.add(y);



    }

    private static class Button implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try {
                width = Integer.parseInt(widthObj.getText());
                widthError.setText("");

            } catch (Exception f){
                widthError.setText("Please enter a number");

            }

            try {
                height = Integer.parseInt(heightObj.getText());
                heightError.setText("");

            } catch (Exception g){
                heightError.setText("Please enter a number");



            }

        }
    }

    public static void main (String[] args){
        Main window = new Main();
        window.setVisible(true);
        window.setBounds(100, 100, 600, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);


    }
}
