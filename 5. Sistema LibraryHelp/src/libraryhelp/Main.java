package libraryhelp;
import pessoas.*;
public class Main {
    public static void main(String[] args) {
        
        /*Alguns testes de administrador na classe principal*/
        Acesso ac = new Acesso();
        Administrador adm1 = new Administrador(1578, "Marco", 21, ac);
        adm1.cadastrarAdministrador(adm1);
        
        Administrador adm2 = new Administrador(1579, "Mathews", 22, ac);
        adm2.cadastrarAdministrador(adm2);
        
        Administrador adm3 = new Administrador(1580, "Aline", 25, ac);
        adm3.cadastrarAdministrador(adm3);
        
        adm1.buscarAdministrador(1578);
        adm2.buscarAdministrador(1579);
        adm3.buscarAdministrador(1580);
        
        adm1.excluirAdministrador(adm1.getId());
        adm1.buscarAdministrador(adm1.getId());
        
    }
    
}
