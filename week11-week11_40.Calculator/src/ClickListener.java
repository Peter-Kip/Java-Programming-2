
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class ClickListener implements ActionListener{
    private Calculator calculator;
    private JTextField inPut;
    private JTextField outPut;
    private JButton plus;
    private JButton minus;
    private JButton zet;
    
    public ClickListener(Calculator calculator, JTextField inPut, JTextField outPut, 
            JButton plus, JButton minus, JButton zet){
        
        this.calculator = calculator;
        this.inPut = inPut;
        this.outPut = outPut;
        this.plus = plus;
        this.minus = minus;
        this.zet = zet;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== plus){
             this.plus();
         }else if(e.getSource()== minus){
             this.minus();
         }else if(e.getSource()== zet){
             this.zet();
         }
    }
    
    private void setOutput(){
        this.outPut.setText("" + calculator.getValue());
        this.zet.setEnabled(true);
    }
     
    private void plus(){
        try {
            this.calculator.plus(Integer.parseInt(inPut.getText()));
             setOutput();
        } catch (NumberFormatException exception) {
        }
        this.inPut.setText("");
    }
    
    private void minus(){
        try {
            this.calculator.minus(Integer.parseInt(inPut.getText()));
            setOutput();
        } catch (NumberFormatException exception) {
        }
        this.inPut.setText("");
    }
    
    private void zet(){
        this.calculator.zet();
        this.inPut.setText("");
        this.outPut.setText("0");
        this.zet.setEnabled(false);
    }
}
