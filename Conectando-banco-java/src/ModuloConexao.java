import java.sql.*;

public class ModuloConexao {

<<<<<<< HEAD
    public static Connection conector() {

=======
 
    public static Connection conector(){
       
>>>>>>> refs/remotes/origin/main
        Connection conexao = null;

        try {
            Class.forName("org.postgresql.Driver");

            try {
                String url = "jdbc:postgresql://localhost/Java";
                String user = "postgres";
                String password = "Info@3004";
                conexao = DriverManager.getConnection(url, user, password);
                return conexao;
            } 
            catch (SQLException e) {
                System.out.println("Erro ao conectar ao banco:" + e);
                return null;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao identficar drive" + e);
        }

        return conexao;
    }

    
    
    public static void main(String[] args) throws SQLException {

        Connection conexao = ModuloConexao.conector();

        if (conexao != null) {
            System.out.println("Conectado\n" + conexao);

            try {
                Statement PreparedStatement = conexao.createStatement();
                String sql = "SELECT * FROM usuario";

                ResultSet rst = PreparedStatement.executeQuery(sql);

                while (rst.next()) {
                    System.out.printf(rst.getInt(1) + " " + rst.getString(2) + " " + rst.getString(3) + "\n");
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao manipular Query" + ex);
            }
                conexao.close();
                
        } else {
            System.out.println("Desconectado");
        }
    }
}
