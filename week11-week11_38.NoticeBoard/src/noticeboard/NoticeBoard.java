package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField top = new JTextField();
        JButton copyButton = new JButton("Copy!");
        JLabel bottom = new JLabel();
        
        ActionEventListener listner = new ActionEventListener(top, bottom);
        copyButton.addActionListener(listner);
        
        container.add(top);
        container.add(copyButton);
        container.add(bottom);
    }
    
    
}
