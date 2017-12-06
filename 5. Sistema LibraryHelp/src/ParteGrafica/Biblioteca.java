package ParteGrafica;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *Classe que guarda todas as instânicas de Livros, Clientes e Empréstimos
 * fazendo o relacionamento principal do programa
 * @author Mathews
 */
public final class Biblioteca {
    public static Biblioteca instancia;
    private final String nome = "LibraryHelp";
    ArrayList<Livro> livros = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Emprestimo> emprestimos = new ArrayList();
    Funcionario funcionario;
    
     /**
     * Método que retorna a instância de uma biblioteca
     * @return Biblioteca
     */
    public static Biblioteca getInstancia(){
        if(instancia == null)
            instancia = new Biblioteca();
        
        return instancia;
    }
    
    /**
     * Método que valida o cadastro de um livro 
     * verificando se os dados estão corretos
     * @param titulo
     * @return boolean
     */
    
    public boolean validarCadastroLivro(String titulo){
        for (int i=0; i<livros.size(); i++){
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)){
		return true;
            }
	}
        return false;
    }
    
    /**
     * Método que valida o cadastro de um cliente 
     * verificando se os dados estão corretos.
     * @param cpf
     * @param login
     * @return boolean
     */
    public boolean validarCadastroCliente(String cpf ,String login){
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getAcesso().getLogin().equals(login)){
               return true;
            }
            if(clientes.get(i).getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
    
    public void addLivro(Livro livro){
        livros.add(livro);
    }
    
    public ArrayList getLivros(){
        return livros;
    }

    public ArrayList getClientes() {
        return clientes;
    }
    
    public int chegarUsuario(String login, String senha){
        if(funcionario.getAcesso().getLogin().equals(login) && funcionario.getAcesso().getSenha().equals(senha)){
            return 1;
        }
        
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getAcesso().getLogin().equals(login) && clientes.get(i).getAcesso().getSenha().equals(senha)){
                return 2;
            }
        }
        
        return 3;
    }
    
    
    public void salvarDadosLivro(String titulo, String autor, String edicao, String editora, int anoLancamento){
		try {
                    FileOutputStream fx = new FileOutputStream("ListaLivro.txt");
                    ObjectOutputStream sx = new ObjectOutputStream(fx);
                    Livro livro = new Livro(titulo, autor, edicao, editora, anoLancamento);
                    sx.writeObject(livro);
                    sx.close();
                    fx.close();	
		} 
                catch (Exception e) {
		// TODO Auto-generated catch block
                    e.printStackTrace();
		}
    }
    public void salvarDadosCliente(Acesso acesso, String nome, String sexo, String email, String telefone, String celular, Data dataNasc){
		try {
                    FileOutputStream fx = new FileOutputStream("ListaCliente.txt");
                    ObjectOutputStream sx = new ObjectOutputStream(fx);
                    Cliente cliente = new Cliente(acesso, nome, sexo, email, telefone, celular, dataNasc);
                    sx.writeObject(cliente);
                    sx.close();
                    fx.close();	
		} 
                catch (Exception e) {
                    e.printStackTrace();
		}
    }
    
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }
}
