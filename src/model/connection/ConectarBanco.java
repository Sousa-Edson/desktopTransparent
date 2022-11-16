package model.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConectarBanco {

    public Statement stm;
    public ResultSet rs;
    public Connection con;

    private final String caminho = "jdbc:postgresql://localhost:5432/estoquedesktop";
    private final String driver = "org.postgresql.Driver";
    private final String usuario = "edson";
    private final String senha = "edson";  

    public void conexao() {
        System.setProperty("jdbc.Drivers", driver);
        try {
            con = DriverManager.getConnection(caminho, usuario, senha); 
//             System.out.println("Conectado ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com BD\n" + ex.getMessage());
        }
    }

    public void executaSql(String sql) {
        try {
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            System.err.println("Erro - executaSql \n\n "+ex);
        }
    }

    public void desconecta() {
        System.setProperty("jdbc.Driver", driver);
        try {
            con.close();
//            System.out.println("Desconectado ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com BD:\n" + ex.getMessage());
        }
    }
}


