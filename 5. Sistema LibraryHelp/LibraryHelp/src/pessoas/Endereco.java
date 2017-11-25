package pessoas;
public class Endereco {
    private String logradouro;
    private int numero;
    private String quadra;
    private String lote;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Logradouro: " + logradouro + " | Número: " + numero + " | Quadra: " + quadra + 
               " | Lote: " + lote + " | Bairro: " + bairro + " | Cidade: " + cidade + 
               " | Estado: " + estado + " | País: " + pais;
    }
    
    
}
