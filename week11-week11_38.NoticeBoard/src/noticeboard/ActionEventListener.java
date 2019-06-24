/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kiplagat
 */
public class ActionEventListener implements  ActionListener{
    private JTextField top;
    private JLabel bottom;
    
    public ActionEventListener(JTextField top, JLabel bottom){
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         this.bottom.setText(this.top.getText());
         this.top.setText("");
    }
    
}
