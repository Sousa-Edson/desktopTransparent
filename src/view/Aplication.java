package view;

import java.awt.EventQueue;

public class Aplication {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
