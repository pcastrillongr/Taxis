package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.joda.time.LocalDate;

import models.Trayecto;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Suplemento {

	private JFrame frame3;
	private JButton btnaeropuerto;
	private JButton btnnoche;
	private JButton btnNewButton;
	private Trayecto aux;
	private JLabel precioaux;
	private JFrame frameaux;
	private JTextField txtdinero;
	private JLabel lblvuelta2;
	private JLabel lblVuelta;
	private JLabel lblDineroEntregado ;
	private JLabel lblcantidad2 ;
	private JLabel lblcantidad ;
	private boolean escorrecto=true;
	private float dinero;
	public Suplemento(Trayecto x, JLabel lblprecio2, JFrame frame) {

		frame3 = new JFrame();
		btnaeropuerto = new JButton("AEROPUERTO");

		btnnoche = new JButton("NOCHE");
		btnNewButton = new JButton("SIMPLE");
		aux = x;
		precioaux = lblprecio2;
		frameaux = frame;
		 lblvuelta2 = new JLabel("");
		 lblVuelta = new JLabel("Vuelta:");
		 lblDineroEntregado = new JLabel("Dinero entregado:");
		 lblcantidad2 = new JLabel("");
		 lblcantidad = new JLabel("Cantidad a pagar:");
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

		frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);

		btnaeropuerto.setBounds(6, 74, 117, 116);
		frame3.getContentPane().add(btnaeropuerto);

		btnnoche.setBounds(172, 74, 117, 116);
		frame3.getContentPane().add(btnnoche);

		btnNewButton.setBounds(327, 74, 117, 116);
		frame3.getContentPane().add(btnNewButton);
		
		
		lblcantidad.setBounds(16, 209, 131, 16);
		frame3.getContentPane().add(lblcantidad);
		
		
		lblcantidad2.setBounds(166, 209, 104, 16);
		frame3.getContentPane().add(lblcantidad2);
		
		txtdinero = new JTextField();
		txtdinero.setBounds(159, 237, 130, 26);
		frame3.getContentPane().add(txtdinero);
		txtdinero.setColumns(10);
		
		
		lblDineroEntregado.setBounds(26, 242, 117, 16);
		frame3.getContentPane().add(lblDineroEntregado);
		
		
		lblVuelta.setBounds(349, 202, 61, 16);
		frame3.getContentPane().add(lblVuelta);
		
		
		lblvuelta2.setBounds(349, 242, 61, 16);
		frame3.getContentPane().add(lblvuelta2);
	}

	public void eventos() {

		
		
		btnaeropuerto.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (new LocalDate().getDayOfWeek() == 7 || new LocalDate().getDayOfWeek() == 6) {
					float precio = Float.parseFloat(precioaux.getText()) + 5.5f + 4.55f;
					aux.setPago(precio);
					
					lblcantidad2.setText(String.valueOf(aux.getPago()));

				
					Container.Container.getTrayectos().add(aux);
					System.out.println(aux.toString());
					JOptionPane.showMessageDialog(null, "Cantidad Pagada");
					frameaux.setVisible(true);

					frame3.dispose();
					}
					
				

				else{
					float precio = Float.parseFloat(precioaux.getText()) + 5.5f + 3.65f;
					aux.setPago(precio);
					
					
					
					
				
						
					lblcantidad2.setText(String.valueOf(dinero-aux.getPago()));
					Container.Container.getTrayectos().add(aux);
					JOptionPane.showMessageDialog(null, "Cantidad Pagada");
					frameaux.setVisible(true);

					frame3.dispose();}
			}
				
			

		});

		btnnoche.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				if (new LocalDate().getDayOfWeek() == 7 || new LocalDate().getDayOfWeek() == 6) {
					float precio = Float.parseFloat(precioaux.getText()) + 2f + 4.55f;
					aux.setPago(precio);
					Container.Container.getTrayectos().add(aux);
					
					JOptionPane.showMessageDialog(null, "Cantidad Pagada");
					frameaux.setVisible(true);

					frame3.dispose();
				} else {

					float precio = Float.parseFloat(precioaux.getText()) + 2f + 3.65f;
					aux.setPago(precio);
					Container.Container.getTrayectos().add(aux);
					System.out.println(aux.toString());
					JOptionPane.showMessageDialog(null, "Cantidad Pagada");
					frameaux.setVisible(true);

					frame3.dispose();
				}

			}
		});

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				if (new LocalDate().getDayOfWeek() == 7 || new LocalDate().getDayOfWeek() == 6) {
					float precio = Float.parseFloat(precioaux.getText())  + 4.55f;
					aux.setPago(precio);
					Container.Container.getTrayectos().add(aux);
					System.out.println(aux.toString());
					JOptionPane.showMessageDialog(null, "Cantidad Pagada");
					frameaux.setVisible(true);

					frame3.dispose();
				} else {

					float precio = Float.parseFloat(precioaux.getText())+ 3.65f;
					aux.setPago(precio);
					Container.Container.getTrayectos().add(aux);
					System.out.println(aux.toString());
					JOptionPane.showMessageDialog(null, "Cantidad Pagada");
					frameaux.setVisible(true);

					frame3.dispose();
				}
				
				
			}
		});
	}

	public JFrame getFrame3() {
		return frame3;
	}
}
