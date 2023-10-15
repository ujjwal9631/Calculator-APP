import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.*;
import java.awt.*;

public class CalculatorApplication implements ActionListener {
    double num1 = 0, num2 = 0, result = 0;
    int calculation;

    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDel = new JButton("Del");
    JButton buttonEqual = new JButton("=");
    JButton buttonDivide = new JButton("/");
    JButton buttonAdd = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x^2");
    JButton buttonRec = new JButton("1/x");
    JButton buttonSqrt = new JButton("√");
    JButton buttonMul = new JButton("x");

    public CalculatorApplication() {
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui() {
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.WHITE);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
        onRadioButton.setBackground(Color.BLACK);
        onRadioButton.setForeground(Color.WHITE);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.BLACK);
        offRadioButton.setForeground(Color.WHITE);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        frame.validate();

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 14));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 14));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 14));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 14));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 14));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 14));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 14));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 14));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 14));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 40);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDivide.setBounds(220, 110, 60, 40);
        buttonDivide.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDivide.setBackground(new Color(239, 188, 2));
        buttonDivide.setFocusable(false);
        frame.add(buttonDivide);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setFocusable(false);
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setFocusable(false);
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonAdd.setBounds(220, 290, 60, 40);
        buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
        buttonAdd.setBackground(new Color(239, 188, 2));
        buttonAdd.setFocusable(false);
        frame.add(buttonAdd);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 14));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonRec.setBounds(150, 170, 60, 40);
        buttonRec.setFont(new Font("Arial", Font.BOLD, 15));
        buttonRec.setFocusable(false);
        frame.add(buttonRec);

        buttonDel.setBounds(150, 110, 60, 40);
        buttonDel.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDel.setBackground(Color.RED);
        buttonDel.setForeground(Color.WHITE);
        buttonDel.setFocusable(false);
        frame.add(buttonDel);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.RED);
        buttonClear.setFocusable(false);
        buttonClear.setForeground(Color.WHITE);
        frame.add(buttonClear);
    }

    public void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDel.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonRec.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonMinus.addActionListener(this);
    }

    public static void main(String[] args) {
        new CalculatorApplication();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
    
        if (obj == onRadioButton) {
            enable();
        } else if (obj == offRadioButton) {
            disable();
        } else if (obj == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (obj == buttonDel) {
            String currentText = textField.getText();
            if (!currentText.isEmpty()) {
                textField.setText(currentText.substring(0, currentText.length() - 1));
            }
        } else if (obj == buttonZero) {
            textField.setText(textField.getText() + "0");
        } else if (obj == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (obj == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (obj == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (obj == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (obj == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (obj == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (obj == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (obj == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (obj == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (obj == buttonDot) {
            String currentText = textField.getText();
            if (!currentText.contains(".")) {
                textField.setText(currentText + ".");
            }
        } else if (obj == buttonAdd) {
            performOperation(1, "+");
        } else if (obj == buttonMinus) {
            performOperation(2, "-");
        } else if (obj == buttonMul) {
            performOperation(3, "x");
        } else if (obj == buttonDivide) {
            performOperation(4, "/");
        } else if (obj == buttonSquare) {
            double num = Double.parseDouble(textField.getText());
            double square = Math.pow(num, 2);
            textField.setText(formatResult(square));
        } else if (obj == buttonSqrt) {
            double num = Double.parseDouble(textField.getText());
            if (num >= 0) {
                double sqrt = Math.sqrt(num);
                textField.setText(formatResult(sqrt));
            } else {
                textField.setText("Error");
            }
        } else if (obj == buttonRec) {
            double num = Double.parseDouble(textField.getText());
            if (num != 0) {
                double rec = 1 / num;
                textField.setText(formatResult(rec));
            } else {
                textField.setText("Error");
            }
        } else if (obj == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());
            switch (calculation) {
                case 1:
                    performOperation(1, "+");
                    break;
                case 2:
                    performOperation(2, "-");
                    break;
                case 3:
                    performOperation(3, "x");
                    break;
                case 4:
                    performOperation(4, "/");
                    break;
            }
        }
    }
    
    private void performOperation(int opCode, String opSymbol) {
        double currentNum = Double.parseDouble(textField.getText());
        if (calculation == 0) {
            num1 = currentNum;
            label.setText(currentNum + opSymbol);
        } else {
            double result = 0;
            switch (calculation) {
                case 1:
                    result = num1 + currentNum;
                    break;
                case 2:
                    result = num1 - currentNum;
                    break;
                case 3:
                    result = num1 * currentNum;
                    break;
                case 4:
                    if (currentNum != 0) {
                        result = num1 / currentNum;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            label.setText("");
            textField.setText(formatResult(result));
            frame.repaint();

        }
        calculation = opCode;
        textField.setText("");
    }
    
    private String formatResult(double result) {
        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%s", result);
        }
    }
    

    public void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDel.setEnabled(true);
        buttonDivide.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonRec.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonMinus.setEnabled(true);
    }

    public void disable() {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDel.setEnabled(false);
        buttonDivide.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonRec.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }
}
