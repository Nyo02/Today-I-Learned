import java.sql.Connection;

public class Main {
    
    public static void main(String[] args) {
        
        Connection conexao = ModuloConexao.conector();
        
        if(conexao!=null){
            System.out.println(conexao);
        }
        else System.out.println("Desconectado");
    }
}
