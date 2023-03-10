package tashfiq;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Cacl extends JFrame implements ActionListener{
	JPanel panel1, panel2, panel3;
	JTextField text;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnAdd,btnSub,btnMulti,btnDiv,btnEqual,btnClr;
        int Flag;
        double num1, num2, num3, numResult = 0;
        String str1, str2;
        
	Cacl(){
            
		setSize(515,540);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(null);
		
		Font font = new Font("Arial", Font.BOLD,30);
		
		panel1 = new JPanel();
		panel1.setBounds(0,0,500,150);
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		add(panel1);
		
		panel2 = new JPanel();
		panel2.setBounds(0,150,350,350);
		panel2.setBackground(Color.GRAY);
		panel2.setLayout(new GridLayout(4,3));
		add(panel2);
		
		panel3 = new JPanel();
		panel3.setBounds(350,150,150,350);
		panel3.setBackground(Color.CYAN);
		panel3.setLayout(new GridLayout(5,1));
		add(panel3);
		
		text = new JTextField();
		text.setBounds(10,10,480,130);
		text.setFont(font);
		panel1.add(text);
		
		btn1 = new JButton("1");btn1.addActionListener(this);btn1.setFont(font);
		btn2 = new JButton("2");btn2.addActionListener(this);btn2.setFont(font);
		btn3 = new JButton("3");btn3.addActionListener(this);btn3.setFont(font);
		btn4 = new JButton("4");btn4.addActionListener(this);btn4.setFont(font);
		btn5 = new JButton("5");btn5.addActionListener(this);btn5.setFont(font);
		btn6 = new JButton("6");btn6.addActionListener(this);btn6.setFont(font);
		btn7 = new JButton("7");btn7.addActionListener(this);btn7.setFont(font);
		btn8 = new JButton("8");btn8.addActionListener(this);btn8.setFont(font);
		btn9 = new JButton("9");btn9.addActionListener(this);btn9.setFont(font);
		btn0 = new JButton("0");btn0.addActionListener(this);btn0.setFont(font);
		btnEqual = new JButton("=");btnEqual.addActionListener(this);btnEqual.setFont(font);
		btnClr = new JButton("C");btnClr.addActionListener(this);btnClr.setFont(font);
		
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(btn3);
		panel2.add(btn4);
		panel2.add(btn5);
		panel2.add(btn6);
		panel2.add(btn7);
		panel2.add(btn8);
		panel2.add(btn9);
		panel2.add(btn0);
		panel2.add(btnEqual);
		panel2.add(btnClr);
		
		btnAdd = new JButton("+");btnAdd.addActionListener(this);btnAdd.setFont(font);
		btnSub = new JButton("-");btnSub.addActionListener(this);btnSub.setFont(font);
		btnMulti = new JButton("*");btnMulti.addActionListener(this);btnMulti.setFont(font);
		btnDiv = new JButton("/");btnDiv.addActionListener(this);btnDiv.setFont(font);
		btnDot = new JButton(".");btnDot.addActionListener(this);btnDot.setFont(font);
		
		panel3.add(btnAdd);
		panel3.add(btnSub);
		panel3.add(btnMulti);
		panel3.add(btnDiv);
		panel3.add(btnDot);
		
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1)
                {
                   text.setText(text.getText()+"1");
                }

                if(e.getSource()==btn2)
                {
                    text.setText(text.getText()+"2");
                }
                
                if(e.getSource()==btn3)
                {
                    text.setText(text.getText()+"3");
                }
                
                if(e.getSource()==btn4)
                {
                    text.setText(text.getText()+"4");
                }
                
                if(e.getSource()==btn5)
                {
                    text.setText(text.getText()+"5");
                }
                
                if(e.getSource()==btn6)
                {
                    text.setText(text.getText()+"6");
                }
                
                if(e.getSource()==btn7)
                {
                    text.setText(text.getText()+"7");
                }
                
                if(e.getSource()==btn8)
                {
                    text.setText(text.getText()+"8");
                }
                
                if(e.getSource()==btn9)
                {
                    text.setText(text.getText()+"9");
                }
                
                if(e.getSource()==btn0)
                {
                    text.setText(text.getText()+"0");
                }
                
                if(e.getSource()==btnDot)
                {
                    text.setText(text.getText()+".");
                }
                
                if(e.getSource()==btnAdd)
                {
                    try{
                        str1 = text.getText();
                        num1 = Double.parseDouble(str1);
                    }catch (NumberFormatException es)
                    {
                        System.out.println(es);
                    }
                    
                    text.setText("");
                    Flag=1;
                }
                
                if(e.getSource()==btnSub)
                {
                    try{
                        str1 = text.getText();
                        num1 = Double.parseDouble(str1);
                    }catch (NumberFormatException es)
                    {
                        System.out.println(es);
                    }
                    text.setText("");
                    Flag=2;
                }
                
                if(e.getSource()==btnMulti)
                {
                    try{
                        str1 = text.getText();
                        num1 = Double.parseDouble(str1);
                    }catch (NumberFormatException es)
                    {
                        System.out.println(es);
                    }   
                    text.setText("");
                    Flag=3;
                }
                
                if(e.getSource()==btnDiv)
                {
                    try{
                        str1 = text.getText();
                        num1 = Double.parseDouble(str1);
                    }catch (NumberFormatException es)
                    {
                        System.out.println(es);
                    }
                    text.setText("");
                    Flag=4;
                }
                
		if(e.getSource()==btnClr){
                    str1 = str2 = null;
                    num1 = num2 = 0;
                    text.setText("");
                }
                
                if(e.getSource()==btnEqual)
                {
                    if(Flag==1)
                    {
                        str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 + num2;
                        text.setText(Double.toString(numResult));
                        numResult = num1;
                    }
                    
                    if(Flag==2)
                    {
                        str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 - num2;
                        text.setText(Double.toString(numResult));
                        num1 = numResult;
                    }   
                    
                    if(Flag==3)
                    {
                        str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 * num2;
                        text.setText(Double.toString(numResult));
                        num1 = numResult;
                    }
                    
                    if(Flag==4)
                    {
                        str2 = text.getText();
                        num2 = Double.parseDouble(str2);
                        numResult = num1 / num2;
                        text.setText(Double.toString(numResult));
                        num1 = numResult;
                    }
                }
	}
}
