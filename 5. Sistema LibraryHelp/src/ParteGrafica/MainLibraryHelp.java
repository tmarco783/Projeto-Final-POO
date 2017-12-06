package ParteGrafica;
/**
 *
 * @author Mathews
 */
public class MainLibraryHelp {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario =  new Funcionario();
        Acesso acesso = new Acesso();
        acesso.setLogin("admin");
        acesso.setSenha("admin123");
        
        funcionario.setAcesso(acesso);
        
        Biblioteca biblioteca = Biblioteca.getInstancia();
        biblioteca.setFuncionario(funcionario);
        
        TelaLogin telaLogin = new TelaLogin();
        
        telaLogin.setVisible(true);  
    }
    
}
