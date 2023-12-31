package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Buttons extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_0;
	
	private JButton btn_plus;
	private JButton btn_minus;
	private JButton btn_divide;
	private JButton btn_equal;
	private JButton btn_dot;
	private JButton btn_multiply;
	private JButton btn_C;
	private JButton btn_CE;
	
	/**
	 * Create the panel.
	 */
	public Buttons(int WIDTH, int HEIGHT) {
		
		Font font = new Font("Arial",Font.PLAIN, 20);
		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setLayout(new GridLayout(0,4));
		
		// INICIALIZACION DE LOS BOTONES
		this.btn_0 = new JButton("0");
		this.btn_0.setFont(font);

		this.btn_1 = new JButton("1");
		this.btn_1.setFont(font);

		this.btn_2 = new JButton("2");
		this.btn_2.setFont(font);

		this.btn_3 = new JButton("3");
		this.btn_3.setFont(font);

		this.btn_4 = new JButton("4");
		this.btn_4.setFont(font);

		this.btn_5 = new JButton("5");
		this.btn_5.setFont(font);
		
		this.btn_6 = new JButton("6");
		this.btn_6.setFont(font);
		
		this.btn_7 = new JButton("7");
		this.btn_7.setFont(font);
		
		this.btn_8 = new JButton("8");
		this.btn_8.setFont(font);
		
		this.btn_9 = new JButton("9");
		this.btn_9.setFont(font);
		
		this.btn_plus = new JButton("+");
		this.btn_plus.setFont(font);
		
		this.btn_minus = new JButton("-");
		this.btn_minus.setFont(font);
		
		this.btn_divide = new JButton("/");
		this.btn_divide.setFont(font);
		
		this.btn_equal = new JButton("=");
		this.btn_equal.setFont(font);
		
		this.btn_dot = new JButton(".");
		this.btn_dot.setFont(font);
		
		this.btn_multiply = new JButton("*");
		this.btn_multiply.setFont(font);
		
		this.btn_C = new JButton("C");
		this.btn_C.setFont(font);
		
		this.btn_CE = new JButton("CE");
		this.btn_CE.setFont(font);
		
		// Agregamos los botones a la interfaz Grafica
		this.add(btn_C);		this.add(new JLabel(""));	this.add(new JLabel("")); this.add(btn_CE);
		this.add(btn_7);		this.add(btn_8);	this.add(btn_9);			this.add(btn_plus);			
        this.add(btn_4);		this.add(btn_5);	this.add(btn_6);			this.add(btn_minus);
        this.add(btn_1);		this.add(btn_2);	this.add(btn_3);			this.add(btn_multiply);
        this.add(btn_dot);		this.add(btn_0);	this.add(btn_equal);		this.add(btn_divide);
	}
}
