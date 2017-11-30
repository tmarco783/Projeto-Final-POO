package pessoas;

import java.io.*;

/*Serializable permite gravar aquivos utilizando o pacote 'java.io'*/
public abstract class Pessoa implements Serializable{
    private int id;
    private String nome;
    int idade;
    private Endereco endereco;
    private String email;
    
    /*Construtor com menos informações*/
    public Pessoa(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    
    /*Construtor com todas as informações*/
    public Pessoa(int id, String nome, int idade, Endereco endereco, String email){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
