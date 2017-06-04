package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Container.Container;
import models.Tiempo;
import models.Trayecto;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import java.awt.Font;
import javax.swing.JLabel;


import org.joda.time.LocalTime;

public class Principal {

	private JFrame frame;
	private JButton btninicio;
	private JButton btncajadeldia;
	private Trayecto x;
	
	private Tiempo t;
	private JLabel lbltiempo;
	private JButton btnfinaltrayecto;
	private JLabel lbltiempo2;
	private JLabel lblprecio;
	private JLabel lblprecio2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {

		frame = new JFrame();
		btninicio = new JButton("INICIO TRAYECTO");

		btncajadeldia = new JButton("CAIA DEL DIA");
		btnfinaltrayecto = new JButton("FINAL TRAYECTO");
		lbltiempo = new JLabel("Tiempo:");
		lbltiempo2 = new JLabel("");

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		propiedades();
		eventos();

	}

	private void propiedades() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btninicio.setBounds(22, 55, 161, 151);
		frame.getContentPane().add(btninicio);
		btninicio.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));

		btncajadeldia.setBounds(265, 55, 161, 151);
		frame.getContentPane().add(btncajadeldia);

		btnfinaltrayecto.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 15));
		btnfinaltrayecto.setVisible(false);
		btnfinaltrayecto.setBounds(81, 31, 274, 199);
		frame.getContentPane().add(btnfinaltrayecto);

		lbltiempo.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lbltiempo.setVisible(false);
		lbltiempo.setBounds(39, 242, 95, 16);
		frame.getContentPane().add(lbltiempo);

		lbltiempo2.setBounds(134, 242, 74, 16);
		lbltiempo2.setVisible(false);
		frame.getContentPane().add(lbltiempo2);
		
		lblprecio = new JLabel("Precio:");
		lblprecio.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 13));
		lblprecio.setBounds(249, 242, 61, 16);
		lblprecio.setVisible(false);
		frame.getContentPane().add(lblprecio);
		
		lblprecio2 = new JLabel("");
		lblprecio2.setBounds(344, 242, 61, 16);
		frame.getContentPane().add(lblprecio2);
	

	}

	private void eventos() {

		btninicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				x = new Trayecto();
				x.setIniciotrayecto(new LocalTime());
			

				btninicio.setVisible(false);
				btncajadeldia.setVisible(false);
				btnfinaltrayecto.setVisible(true);
				lbltiempo.setVisible(true);
				lbltiempo2.setVisible(true);
				
				
				t=new Tiempo();
				t.Contar(lbltiempo2,lblprecio2);
				
				
			}
		});
		
		btnfinaltrayecto.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				x.setFinaltrayecto(new LocalTime());
				Suplemento window=new Suplemento(x,lblprecio2,frame);
				window.getFrame3().setVisible(true);
				frame.dispose();
				
				btnfinaltrayecto.setVisible(false);
				lbltiempo.setVisible(false);
				lbltiempo2.setVisible(false);
				lblprecio.setVisible(false);
				lblprecio2.setVisible(false);
				btninicio.setVisible(true);
				btncajadeldia.setVisible(true);
			}
		});
		
		btncajadeldia.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				CajaDelDia window=new CajaDelDia();
				window.getFrame4().setVisible(true);
				frame.dispose();
				
				
			}
		});


	}
}
