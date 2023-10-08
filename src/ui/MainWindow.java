package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.UIManager.*;
import java.awt.FlowLayout;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 400;
	private static final int HEIGHT = 600;
	private static final int PADDING = 10;
	private JPanel screen;
	private JPanel buttons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Buscamos si esta Disponible el Theme Nimbus
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				        	// Asignamos el Theme Nimbus
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
					// Creamos la ventana principal
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setTitle("Soft Tech MX | Calculator");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, PADDING, PADDING));
		
		screen = new Screen();
		screen.setPreferredSize(new Dimension(WIDTH - (PADDING*2),100));
		screen.setBackground(Color.BLACK);
		getContentPane().add(screen);
		
		buttons = new Buttons(WIDTH - (PADDING*2), 400);
		getContentPane().add(buttons);
	}

}
