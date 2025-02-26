package grade.randomstars;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class Gui extends JFrame{
    private JLabel label;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton exit;
    private JButton start;
    private JButton clear;
    private JTextArea area;
    int value;
    String number;
    
    
    public Gui(){
        super("RandomStars");
        
        label = new JLabel("RANDOM STARS");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        exit = new JButton("Exit");
        clear = new JButton("Clear");
        start = new JButton("Start");
        area = new JTextArea();
        
        
        //First Panel 
        panel1.setLayout(new GridLayout(1,1));
        panel1.setPreferredSize(new Dimension(400, 200));
        panel1.add(label);
        
        //Second Panel
        panel2.setLayout(new GridLayout(1,1));
        panel2.setPreferredSize(new Dimension(400,300));
        panel2.add(area);
        
        //Third Panel
        panel3.setLayout(new GridLayout(1,3,2,2));
        panel3.setPreferredSize(new Dimension(400,100));
        panel3.add(clear);
        clear.setFocusable(false);
        clear.setBackground(Color.LIGHT_GRAY);
        panel3.add(start);
        start.setFocusable(false);
        start.setBackground(Color.LIGHT_GRAY);
        panel3.add(exit);
        exit.setFocusable(false);
        exit.setBackground(Color.LIGHT_GRAY);
        
        
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);  
    }
    
    public void stars(){
        Random rand = new Random();
        value = rand.nextInt(10);
        
        number = Integer.toString(value);
        
        area.append("Your random chosen number is ...." + number);
        
        String star = "*";
        String space = " ";
        
        for(int i = 1; i < 2; i++){
            area.append("\n");
            area.append(star.repeat(value));
            
            for(int j = 1; j < value; j++){
                area.append("\n");
                area.append(space.repeat(j) + star.repeat(value - j));
            }
        }
        
    
    }
    
    public void buttons(){
        
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== exit){
                    System.exit(0);
                }
            }
        });
        
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== clear){
                        area.setText("");
                        label.setText("CLEARED");
                }
            }
        });
        
        start.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                stars();
                label.setText("STARTED...");
            }
            
        });
    }
    
}
