import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame{
    private static JTextField widthObj = new JTextField(16);
    private static JTextField heightObj = new JTextField(16);

    private static int width = 0;
    private static int height = 0;

    private static JLabel errorMessage = new JLabel();


    public Main(){
        super("MAKE A WINDOW");
        Container c =  getContentPane();
        c.setLayout(new GridLayout(3,1));

        JPanel x = new JPanel();
        x.setLayout(new FlowLayout());
        JLabel heightLabel = new JLabel();
        heightLabel.setText("Insert Height");
        x.add(heightLabel);
        x.add(heightObj);





        JPanel y = new JPanel();
        y.setLayout(new FlowLayout());
        JLabel widthLabel = new JLabel();
        widthLabel.setText("Insert Width");
        y.add(widthLabel);
        y.add(widthObj);



        JPanel z = new JPanel();
        z.setLayout(new FlowLayout());
        JButton inputButton = new JButton("Create A WINDOW");
        z.add(inputButton);
        inputButton.addActionListener(new Button());
        z.add(errorMessage);


        c.add(x);
        c.add(y);
        c.add(z);



    }
    public Main(int width, int height){
        super("WIDTH: " + width + " HEIGHT: " + height);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
    }

    private static class Button implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try {
                errorMessage.setText("");
                width = Integer.parseInt(widthObj.getText());


            } catch (Exception f){
                errorMessage.setText("Please enter a number");

            }

            try {
                errorMessage.setText("");
                height = Integer.parseInt(heightObj.getText());


            } catch (Exception g){
                errorMessage.setText("Please enter a number");



            }

            Main newWindow = new Main(width, height);
            newWindow.setVisible(true);
            newWindow.setBounds(100,100,width,height);
            newWindow.setResizable(false);

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
