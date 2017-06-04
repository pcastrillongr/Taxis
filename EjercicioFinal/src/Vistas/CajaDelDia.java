package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import models.Trayecto;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CajaDelDia {

	private JFrame frame4;

	private JLabel lblcaja2;
	private JLabel lblcaja;
	private JLabel lblorden;

	public CajaDelDia() {

		lblcaja2 = new JLabel("");
		lblcaja = new JLabel("Caja Del Dia");

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		propiedades();
		eventos();

	}

	public void propiedades() {
		frame4 = new JFrame();
		frame4.setBounds(100, 100, 450, 300);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);

		lblcaja.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 15));
		lblcaja.setBounds(29, 108, 178, 16);
		frame4.getContentPane().add(lblcaja);

		lblcaja2.setBounds(226, 108, 165, 16);
		frame4.getContentPane().add(lblcaja2);
		
		lblorden = new JLabel("");
		lblorden.setBounds(226, 164, 152, 92);
		frame4.getContentPane().add(lblorden);
	}

	public void eventos() {

		float total = 0;
		for (Trayecto x : Container.Container.getTrayectos()) {

			total += x.getPago();

			lblcaja2.setText(String.valueOf(total));
			System.out.println(x.getIniciotrayecto().toString());
			
		}
		

	}

	public JFrame getFrame4() {
		return frame4;
	}

}
