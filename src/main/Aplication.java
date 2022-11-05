package main;

import java.awt.EventQueue;

import view.Home;

public class Aplication {

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					System.out.println("ola");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
