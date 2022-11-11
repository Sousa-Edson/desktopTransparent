package controller;

import java.awt.Color;

import view.HomeForm;

public class HomeController {
	private HomeForm view;
	int r = 0, g = 0, b = 0, a = 100;
	int rm = 153, gm = 193, bm = 241, am = 255;
	Color corPrincipal = new Color(r, g, b, a);

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
    
    public void alteraCorPrincipal() {
		r = ((view.getSlider_Prin_verm().getValue()));
		g = ((view.getSlider_Prin_verd().getValue()));
		b = ((view.getSlider_prin_azul().getValue()));
		a = ((view.getSlider_prin_trans().getValue()));
		corPrincipal = new Color(r, g, b, a);
		//setBackground(corPrincipal);
		System.out.println(a);
	}
}
