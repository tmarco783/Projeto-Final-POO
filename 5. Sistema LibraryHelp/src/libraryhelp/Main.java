package libraryhelp;
import pessoas.*;
public class Main {
    public static void main(String[] args) {
        Acesso ac = new Acesso();
        Administrador adm = new Administrador(1578, "Marco", 21, ac);
        adm.cadastrarAdministrador(1578, "Marco", 21, ac);
        
        adm.buscarAdministrador(157);
    }
    
}
