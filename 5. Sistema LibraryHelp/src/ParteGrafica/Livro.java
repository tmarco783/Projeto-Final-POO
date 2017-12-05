package ParteGrafica;

import pessoas.*;
/**
 *
 * @author Mathews
 */
public class Livro {
    private String titulo;
    private String autor;
    private String edicao;
    private String editora;
    private int anoLancamento;
    private boolean disponivel;
    
    public Livro(String titulo, String autor, String edicao, String editora, int anoLancamento){
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.editora = editora;
        this.anoLancamento = anoLancamento;
        disponivel = true;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    
    public void setEditora(String editora){
        this.editora = editora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    
    public String dadosLivro(){
        return("ID: "+
               "\nTitulo: "+titulo+
               "\nAutor: "+autor+
               "\nEdicao: "+edicao+
               "\nEditora: "+editora+
               "\nAno de Lancamento: "+anoLancamento);
    }
    
    
}
