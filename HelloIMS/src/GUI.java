
import javax.swing.*;

public class GUI extends JFrame
{
    JButton button1;
    JPanel panel;

    public GUI(String text)
    {

        super("Quit Button");
        setSize(300,300);
        panel = new JPanel();
        button1 = new JButton(text);
        button1.addActionListener(new CloseListener());
        panel.add(button1);
        add(panel);
        setLocation(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
