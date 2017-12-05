package pessoas;

import java.util.ArrayList;
/**
 *
 * @author Mathews
 */
public class Biblioteca {
    private String nome;
    private Endereco endereco;
    private ArrayList<Livro> livros = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Emprestimo> emprestimos = new ArrayList();
    private Funcionario funcionario;
}
