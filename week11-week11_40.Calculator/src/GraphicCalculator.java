
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private Calculator calculator;
    private JFrame frame;

    @Override
    public void run() {
        this.calculator = new Calculator();
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField outPut = new JTextField("0");
        outPut.setEnabled(false);
        
        JTextField inPut = new JTextField("");
        
        container.add(outPut);
        container.add(inPut);
        container.add(createPanel(inPut, outPut));
        
    }
    
    private JPanel createPanel(JTextField inPut, JTextField outPut){
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton zet = new JButton("Z");
        
        panel.add(plus);
        panel.add(minus);
        panel.add(zet);
        
        ClickListener listener = new ClickListener(this.calculator, inPut, outPut, plus, minus, zet);
        
        plus.addActionListener(listener);
        minus.addActionListener(listener);
        zet.addActionListener(listener);
        
        zet.setEnabled(false);
         
        return panel;
    } 

    public JFrame getFrame() {
        return frame;
    }
}