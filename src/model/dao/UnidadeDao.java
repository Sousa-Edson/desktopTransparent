package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Unidade;
import model.connection.ConectarBanco;

public class UnidadeDao {
	ConectarBanco conex = new ConectarBanco();

	public ArrayList<Unidade> PreencheTabelaB(String b) {
		ArrayList dados = new ArrayList();
		conex.conexao();
		conex.executaSql("SELECT pk_id_unidade, sigla_unidade, descricao_unidade, on_unidade FROM public.tbl_unidade order by pk_id_unidade desc;");
		try {
			conex.rs.first();
			do {
				String on;
				boolean o = conex.rs.getBoolean("on_unidade");
				if (o == true) {
					on = "O";
				} else {
					on = "X";
				}
				dados.add(new Object[] { on, conex.rs.getInt("pk_id_unidade"), conex.rs.getString("sigla_unidade"),
						conex.rs.getString("descricao_unidade") });
			} while (conex.rs.next());
		} catch (SQLException ex) {
//	            Logger.getLogger(UsuarioJIF.class.getName()).log(Level.SEVERE, null, ex);
		}
		conex.desconecta();
		return dados;
	}

	public void salvar(Unidade u) {
		conex.conexao();
		try {
			java.sql.PreparedStatement pst = conex.con.prepareStatement(
					"INSERT INTO public.tbl_unidade (sigla_unidade, descricao_unidade, on_unidade ) VALUES(?,?,true);");
			pst.setString(1, u.getUn());
			pst.setString(2, u.getDescricao());
			pst.execute();
		} catch (Exception ex) {
			System.out.println("erro no salvar\n " + ex);
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar . \nunidade\n" + ex);
		}
		conex.desconecta();
	}
	public void editar(Unidade u) {
		conex.conexao();
		try {
			java.sql.PreparedStatement pst = conex.con.prepareStatement(
					"UPDATE public.tbl_unidade SET sigla_unidade=?, descricao_unidade=?, on_unidade=true WHERE pk_id_unidade=?;\n"
					+ "");
			pst.setString(1, u.getUn());
			pst.setString(2, u.getDescricao());
			pst.setInt(3, u.getId());
			pst.execute();
		} catch (Exception ex) {
			System.out.println("erro no editar\n " + ex);
			JOptionPane.showMessageDialog(null, "Erro ao editar . \nunidade\n" + ex);
		}
		conex.desconecta();
	}
	public void onUnidade(String v, int id) {
		if (v.equals("O")) {
			v = "false";
		} else {
			v = "true";
		}
		conex.conexao();
		try {
			java.sql.PreparedStatement pst = conex.con.prepareStatement(
					"UPDATE public.tbl_unidade SET on_unidade=" + v + " WHERE pk_id_unidade= " + id + ";");
			pst.execute();
		} catch (Exception ex) {
			System.out.println("erro ao mudar estado\n " + ex);
			JOptionPane.showMessageDialog(null, "Erro ao mudar estado . \nunidade\n" + ex);
		}
		conex.desconecta();
	}
}
