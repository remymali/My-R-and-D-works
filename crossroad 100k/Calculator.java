import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.net.http.WebSocket.Listener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.AncestorListener;

import org.w3c.dom.events.Event;

public class Calculator implements ActionListener, java.awt.event.ActionListener {
    JFrame jf;
    JLabel displayLable;
    JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, threeButton, twoButton, oneButton;
    JButton zeroButton, equalButton, clrButton, addButton, subButton, multipleButton, divisionButton, pointButton;
    boolean isOperatorclicked = false;
    String oldValue;
    String operatorValue;
    JTextField l;

    Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);
//Additional code implemented
try {
    // set look and feel
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
catch (Exception e) {
    System.err.println(e.getMessage());
}

//l.setEditable(false);
///end
        displayLable = new JLabel("0");
        displayLable.setBounds(30, 50, 540, 40);
        jf.add(displayLable);
        displayLable.setBackground(Color.GRAY);
        displayLable.setOpaque(true);
        displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLable.setForeground(Color.white);
        clrButton = new JButton("clr");
        clrButton.setBounds(430, 120, 80, 80);
        clrButton.setFont(new Font("Arial", Font.PLAIN, 40));
        clrButton.addActionListener(this);
        jf.add(clrButton);
        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 120, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);
        eightButton = new JButton("8");
        eightButton.setBounds(130, 120, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);
        nineButton = new JButton("9");
        nineButton.setBounds(230, 120, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);
        nineButton.addActionListener(this);
        fourButton = new JButton("4");
        fourButton.setBounds(30, 220, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener((this));
        jf.add(fourButton);
        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 220, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);
        sixButton = new JButton("6");
        sixButton.setBounds(230, 220, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);
        oneButton = new JButton("1");
        oneButton.setBounds(30, 320, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);
        twoButton = new JButton("2");
        twoButton.setBounds(130, 320, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);
        threeButton = new JButton("3");
        threeButton.setBounds(230, 320, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);
        zeroButton = new JButton("0");
        zeroButton.setBounds(30, 420, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        pointButton = new JButton(".");
        pointButton.setBounds(130, 420, 80, 80);
        pointButton.setFont(new Font("Arial", Font.PLAIN, 40));
        pointButton.addActionListener(this);
        jf.add(pointButton);
        equalButton = new JButton("=");
        equalButton.setBounds(230, 420, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);
        divisionButton = new JButton("/");
        divisionButton.setBounds(330, 120, 80, 80);
        divisionButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divisionButton.addActionListener(this);
        jf.add(divisionButton);
        multipleButton = new JButton("*");
        multipleButton.setBounds(330, 220, 80, 80);
        multipleButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multipleButton.addActionListener(this);
        jf.add(multipleButton);
        subButton = new JButton("-");
        subButton.setBounds(330, 320, 80, 80);
        subButton.setFont(new Font("Arial", Font.PLAIN, 40));
        subButton.addActionListener(this);
        jf.add(subButton);
        addButton = new JButton("+");
        addButton.setBounds(330, 420, 80, 80);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        addButton.addActionListener(this);
        jf.add(addButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String arg[]) {
        new Calculator();
    }

    /**
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

        jf.getContentPane().setBackground(Color.pink);
        if (e.getSource() == sevenButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("7");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "7");
            }

        } else if (e.getSource() == eightButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("8");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "8");
            }
        } else if (e.getSource() == nineButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("9");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "9");
            }

        } else if (e.getSource() == fourButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("4");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "4");
            }

        } else if (e.getSource() == fiveButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("5");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "5");
            }

        } else if (e.getSource() == sixButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("6");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "6");
            }

        } else if (e.getSource() == oneButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("1");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "1");
            }

        } else if (e.getSource() == twoButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("2");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "2");
            }

        } else if (e.getSource() == threeButton) {
            if(displayLable.getText()=="0")
            {
                displayLable.setText(" ");
            }
            if (isOperatorclicked) {
                displayLable.setText("3");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "3");
            }

        } else if (e.getSource() == zeroButton) {
            if (isOperatorclicked) {
                displayLable.setText("0");
                isOperatorclicked = false;
            } else {
                displayLable.setText(displayLable.getText() + "0");
            }

        } else if (e.getSource() == pointButton) {
            displayLable.setText(displayLable.getText() + ".");

        } else if (e.getSource() == addButton) {
            oldValue = displayLable.getText();
            isOperatorclicked = true;
            displayLable.setText("+");
            operatorValue="+";
        } else if (e.getSource() == subButton) {
            oldValue = displayLable.getText();
            isOperatorclicked = true;
            displayLable.setText("-");
            operatorValue="-";
        } else if (e.getSource() == multipleButton) {
            oldValue = displayLable.getText();
            isOperatorclicked = true;
            displayLable.setText("*");
            operatorValue="*";
        } else if (e.getSource() == divisionButton) {
            oldValue = displayLable.getText();
            isOperatorclicked = true;
            displayLable.setText("/");
            operatorValue="/";
        } else if (e.getSource() == equalButton) {
            isOperatorclicked=true;
            String newValue = displayLable.getText();
            Float oldValueFlt = Float.parseFloat(oldValue);
            Float newValueFlt = Float.parseFloat(newValue);
            Float result;
            if(operatorValue=="+"){
              result = oldValueFlt + newValueFlt;
            displayLable.setText(result + "");
            // displayLable.setText("=");
            }else if(operatorValue=="-")
            {
                result = oldValueFlt - newValueFlt;
                displayLable.setText(result + "");
            }else if(operatorValue=="*"){
                result = oldValueFlt * newValueFlt;
                displayLable.setText(result + "");
            }else if(operatorValue=="/"){
                result = oldValueFlt / newValueFlt;
                displayLable.setText(result + "");
            }
        } else if (e.getSource() == clrButton) {
            displayLable.setText("0");
        }
    }
}
