package ParteGrafica;

import pessoas.*;
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
    
    /**
     * Método que adiciona um livro ao ArrayList
     * @param livro
     */
    public void addLivro(Livro livro){
        livros.add(livro);
    }
    
    /**
     * Método que retorna o ArrayList de livros
     * cadastrados.
     * @return ArrayList
     */
    public ArrayList getLivros(){
        return livros;
    }
    
    
}
