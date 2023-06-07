import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator implements ActionListener{
 private static  JButton add;
 private static  JButton subtract;
 private static  JButton multiply;
 private static  JButton divide;
private static JButton one;
 private static JButton two;
 private static JButton three;
 private static JButton four;
 private static JButton five;
 private static JButton six;
 private static JButton seven;
 private static JButton eight;
 private static JButton nine;
 private static JButton zero;
 private static JFrame frame;
 private static JPanel panel;
 private static String firstInput;
 private static String secondInput;
 private static JLabel label;
 private static JButton equal;
 private static JButton clear;
 private static String operation;
 private static double answer;
	public static void main(String[] args) {
		
		frame = new JFrame();
		frame.setSize(500,650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		
		//Place Components In Panel
		
		panel.repaint();
		panel.revalidate();
		
		one = new JButton("1");
		one.setBounds(100, 100, 50, 50);
		panel.add(one);
		one.addActionListener(new Calculator());
		
		two = new JButton("2");
		two.setBounds(160, 100, 50, 50);
		panel.add(two);
		two.addActionListener(new Calculator());
		
		three = new JButton("3");
		three.setBounds(220, 100, 50, 50);
		panel.add(three);
		three.addActionListener(new Calculator());
		
		four = new JButton("4");
		four.setBounds(100, 160, 50, 50);
		panel.add(four);
		four.addActionListener(new Calculator());
		
		five = new JButton("5");
		five.setBounds(160, 160, 50, 50);
		panel.add(five);
		five.addActionListener(new Calculator());
		
		six = new JButton("6");
		six.setBounds(220, 160, 50, 50);
		panel.add(six);
		six.addActionListener(new Calculator());
		
		seven = new JButton("7");
		seven.setBounds(100, 220, 50, 50);
		panel.add(seven);
		seven.addActionListener(new Calculator());
		
		eight = new JButton("8");
		eight.setBounds(160, 220, 50, 50);
		panel.add(eight);
		eight.addActionListener(new Calculator());
		
		nine = new JButton("9");
		nine.setBounds(220, 220, 50, 50);
		panel.add(nine);
		nine.addActionListener(new Calculator());
		
		zero = new JButton("0");
		zero.setBounds(160, 280, 50, 50);
		panel.add(zero);
		zero.addActionListener(new Calculator());
		
		add = new JButton("+");
		add.setBounds(280, 100, 50, 50);
		panel.add(add);
		add.addActionListener(new Calculator());
		
		subtract = new JButton("-");
		subtract.setBounds(280, 160, 50, 50);
		panel.add(subtract);
		subtract.addActionListener(new Calculator());
		
		multiply = new JButton("x");
		multiply.setBounds(280, 220, 50, 50);
		panel.add(multiply);
		multiply.addActionListener(new Calculator());
		
		divide = new JButton("/");
		divide.setBounds(280, 280, 50, 50);
		panel.add(divide);
		divide.addActionListener(new Calculator());
		
		equal = new JButton("=");
		equal.setBounds(220, 280, 50, 50);
		panel.add(equal);
		equal.addActionListener(new Calculator());
		
		clear = new JButton("CLR");
		clear.setBounds(100, 280, 50, 50);
		panel.add(clear);
		clear.addActionListener(new Calculator());
		
		label = new JLabel("");
		label.setBounds(100,50,270,25);
		panel.add(label);
		System.out.println("Program Started!\nProgram Log");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==one) {
			System.out.println("Button one");
			label.setText(label.getText() + "1");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==two) {
			System.out.println("Button two");
			label.setText(label.getText() + "2");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==three) {
			System.out.println("Button three");
			label.setText(label.getText() + "3");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==four) {
			System.out.println("Button four");
			label.setText(label.getText() + "4");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==five) {
			System.out.println("Button five");
			label.setText(label.getText() + "5");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==six) {
			System.out.println("Button six");
			label.setText(label.getText() + "6");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==seven) {
			System.out.println("Button seven");
			label.setText(label.getText() + "7");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==eight) {
			System.out.println("Button eight");
			label.setText(label.getText() + "8");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==nine) {
			System.out.println("Button nine");
			label.setText(label.getText() + "9");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==zero) {
			System.out.println("Button zero");
			label.setText(label.getText() + "0");
			String test = label.getText();
			System.out.println(test);
		}
		if(e.getSource()==add) {
			System.out.println("Button add");
			firstInput = label.getText();
			System.out.println(firstInput);
			label.setText("");
			operation=("+");
			
		}
		if(e.getSource()==subtract) {
			System.out.println("Button subtract");
			firstInput = label.getText();
			System.out.println(firstInput);
			label.setText("");
			operation=("-");
		}
		if(e.getSource()==multiply) {
			System.out.println("Button multiply");
			firstInput = label.getText();
			System.out.println(firstInput);
			label.setText("");
			operation=("x");
			}
		if(e.getSource()==divide) {
			System.out.println("Button divide");
			firstInput = label.getText();
			System.out.println(firstInput);
			label.setText("");
			operation=("/");
		}
		
		if(e.getSource()==equal) {
			System.out.println("Button equal");
			secondInput = label.getText();
			switch(operation) {
			
			case "+":
				answer = Double.parseDouble(firstInput) + Double.parseDouble(secondInput);
				System.out.println(answer + "\nOperation: Addition");
				label.setText(Double.toString(answer));
				break;
			case "-":
				answer = Double.parseDouble(firstInput) - Double.parseDouble(secondInput);
				System.out.println(answer + "\nOperation: Subtraction");
				label.setText(Double.toString(answer));
				break;
			case "x":
				answer = Double.parseDouble(firstInput) * Double.parseDouble(secondInput);
				System.out.println(answer + "\nOperation: Multiplication");
				label.setText(Double.toString(answer));
				break;
			case "/":
				answer = Double.parseDouble(firstInput) / Double.parseDouble(secondInput);
				System.out.println(answer + "\nOperation: Division");
				label.setText(Double.toString(answer));
				break;
			default:
				break;
			}
		}
		
		
		if(e.getSource()==clear) {
			System.out.println("Button clear\nValues Cleared!");
			firstInput=null;
			secondInput=null;
			operation=null;
			label.setText("");
			
		}
	}

}




// BASIC CALCULATOR - CAN OPERATE WITH ONLY 2 DIGITS AT A TIME
