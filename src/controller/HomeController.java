package controller;

import view.HomeForm;

public class HomeController {
	private HomeForm view;

    public HomeController(HomeForm view) {
        this.view = view;
         
    }
    public void executa() {
    	System.out.println("funcionou!");

    }
    public void desativaPainel() {
    	view.getPanel_0().setVisible(!true);
    	view.getPanel_1().setVisible(!true);
    	view.getPanel_2().setVisible(!true);
    	view.getPanel_cadastro().setVisible(!true);
    	view.getPanel_config().setVisible(!true);

	}
}
