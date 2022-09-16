import java.sql.*;

public class ModuloConexao {
// 1 registrar o drive
// 2 criar conexao
 
    public static Connection conector(){
       
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
             
             catch(SQLException e) {
                  System.out.println(e);
                  return null;
                  }
    
            }
        
        catch (ClassNotFoundException e) {
            System.out.println("Erro ao identficar drive");
        }
        
        
         
  return conexao; }

   
    
}       
    
    

