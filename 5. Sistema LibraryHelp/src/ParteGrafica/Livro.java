package ParteGrafica;

import pessoas.*;
/**
 *Classe que representa um livro no sistema
 * e faz todos os relacionamentos necessários.
 * @author Mathews
 */
public class Livro {
    private String titulo;
    private String autor;
    private String edicao;
    private String editora;
    private int anoLancamento;
    private boolean disponivel;
    
    /**
     * Construtor para instâncias da classe Livro.
     * @param titulo
     * @param autor
     * @param edicao
     * @param editora
     * @param anoLancamento 
     */
    public Livro(String titulo, String autor, String edicao, String editora, int anoLancamento){
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.anoLancamento = anoLancamento;
        disponivel = true;
    }
    
    /**
     * Método que retorna o título de um livro.
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que retorna o(s) autor(es) de um livro.
     * @return String
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Método que retorna a edição de um livro.
     * @return String
     */
    public String getEdicao() {
        return edicao;
    }

    /**
     * Método que retorna a editora de um livro.
     * @return String
     */
    public String getEditora() {
        return editora;
    }
    
    /**
     * Método que retorna o ano de lançamento de um livro.
     * @return int
     */
    public int getAnoLancamento() {
        return anoLancamento;
    }
    
    /**
     * Método que configura a editora de um livro.
     * @param editora 
     */
    public void setEditora(String editora){
        this.editora = editora;
    }

    /**
     * Método que retorna verdadeiro se um livro 
     * está disponível ou falso em caso contrário.
     * @return boolean
     */
    public boolean isDisponivel() {
        return disponivel;
    }
    
    /**
     * Método que retorna os dados de um livro.
     * @return String
     */
    public String dadosLivro(){
        return("ID: "+
               "\nTitulo: "+titulo+
               "\nAutor: "+autor+
               "\nEdicao: "+edicao+
               "\nEditora: "+editora+
               "\nAno de Lancamento: "+anoLancamento);
    }
    
    
}
