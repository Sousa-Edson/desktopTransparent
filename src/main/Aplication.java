package main;

import java.awt.EventQueue;

import view.HomeForm;

public class Aplication {

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeForm frame = new HomeForm();
					frame.setLocationRelativeTo(null);
//					frame.chamaProduto();
					frame.setVisible(true);
					System.out.println("ola");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
