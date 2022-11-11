package controller;

import java.awt.Color;

import model.TableModelProduto;
import view.HomeForm;

public class HomeController {
	private HomeForm view;
	int r = 0, g = 0, b = 0, a = 100;
	int rm = 153, gm = 193, bm = 241, am = 255;
	Color corPrincipal = new Color(r, g, b, a);
	Color corFundoMenu = new Color(rm, gm, bm, am);
	Color corFundoMenuFoco = new Color(100, 100, 100);
	TableModelProduto modelProduto;

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
		r = (( view.getSlider_Prin_verm().getValue()));
		g = (( view.getSlider_Prin_verd().getValue()));
		b = (( view.getSlider_prin_azul().getValue()));
		a = (( view.getSlider_prin_trans().getValue()));
		corPrincipal = new Color(r, g, b, a);
		view.setBackground(corPrincipal);
		System.out.println(a);
	}
    public void alteraCorMenu() {
		rm = (( view.getSlider_Prin_verm_1().getValue()));
		gm = (( view.getSlider_Prin_verd_1().getValue()));
		bm = (( view.getSlider_prin_azul_1().getValue()));

		corFundoMenu = new Color(rm, gm, bm, am);
		view.getPn_configuracao().setBackground(corFundoMenu);
		view.getPn_sidebar().setBackground(corFundoMenu);
		view.getPanel_config().setBackground(corFundoMenu);

		view.getPn_home().setBackground(corFundoMenu);
		view.getPn_produto().setBackground(corFundoMenu);
		view.getPn_relatorio().setBackground(corFundoMenu);
		view.getPn_cadastro().setBackground(corFundoMenu);
		view.getPn_configuracao().setBackground(corFundoMenu);

		view.getPanel_cor_principal_1().setBackground(corFundoMenu);
		view.getPanel_cor_principal().setBackground(corFundoMenu);

		view.getSlider_Prin_verm_1().setBackground(corFundoMenu);
		view.getSlider_Prin_verd_1().setBackground(corFundoMenu);
		view.getSlider_prin_azul_1().setBackground(corFundoMenu);

		view.getSlider_Prin_verm().setBackground(corFundoMenu);
		view.getSlider_Prin_verd().setBackground(corFundoMenu);
		view.getSlider_prin_azul().setBackground(corFundoMenu);
		view.getSlider_prin_trans().setBackground(corFundoMenu);

		view.getPanel_cadastro().setBackground(corFundoMenu);

		view.getPanel_conteiner_unidade().setBackground(corFundoMenu);
		view.getPanel_conteiner_cfop().setBackground(corFundoMenu);
		view.getPanel_conteiner_ncm().setBackground(corFundoMenu);
		view.getPanel_conteiner_empresa().setBackground(corFundoMenu);
	}
    
}
