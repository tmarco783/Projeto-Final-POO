package pessoas;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa{
    private int matricula;
    private String login;
    private int senha;
    private ArrayList <Funcionario> listaFunc = new ArrayList <>();
    
    public Funcionario(int id, String nome, int idade) {
        super(id, nome, idade);
    }
    
    public Funcionario(int id, String nome, int idade, Endereco endereco, String email){
        super(id, nome, idade, endereco, email);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void cadastrarFuncionario(Funcionario func) {
        listaFunc.add(func);
        gravaDados(func);
    }
    
    public void alterarRegistroFuncionario(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           return;
        }
        
        /*Alteração de cadastro inicial*/
        int posicao = obterPosicaoArray(id);
        Scanner in = new Scanner(System.in);
        int novoId;
        String novoNome;
        int novaIdade;
        System.out.print("Entre com o novo ID do funcionário: " );
        novoId = in.nextInt();
        in.nextLine();
        listaFunc.get(posicao).setId(novoId);
        System.out.print("Entre com o novo nome do funcionário: ");
        novoNome = in.nextLine();
        listaFunc.get(posicao).setNome(novoNome);
        System.out.print("Entre com a nova idade do funcionário: ");
        novaIdade = in.nextInt();
        listaFunc.get(posicao).setIdade(novaIdade); 
        System.out.println("O funcionário foi atualizado com sucesso!");
    }
    
    public void buscarFuncionario(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           System.out.println("===========================");
           return;
        }
        int posicao = obterPosicaoArray(id);
        System.out.println("Funcionário encontrado!");
        System.out.println("== Informações do Funcionário ==");
        System.out.println(listaFunc.get(posicao).toString()); 
        System.out.println("==============================");
    }
    
    public void exlcuirFuncionario(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           System.out.println("===========================");
           return;
        }
        int posicao = obterPosicaoArray(id);
        
        listaFunc.remove(posicao);
        System.out.println("Funcionário removido com sucesso!");
    }
    
    public boolean existe(int id){
        boolean existe = false;
        
        for(int i = 0; i < listaFunc.size(); i++){
            if(listaFunc.get(i).getId() == id){
                existe = true;
                break;
            }
        }
        
        if(existe){
            return true;
        }else{
            return false;
        }
    }
    
    public int obterPosicaoArray(int id) {
        int indice = 0;
        for(int i = 0; i < listaFunc.size(); i++){
            if(listaFunc.get(i).getId() == id){
                indice = i;
                break;
            }
        }
        return indice;
    }
    
    public void gravaDados(Funcionario func) {
        try{
            FileOutputStream fx = new FileOutputStream("dados_func.txt");
            ObjectOutputStream dadosFunc = new ObjectOutputStream(fx);
            dadosFunc.writeObject(func);
            if(dadosFunc != null){
                System.out.println("Dados salvos com sucesso!");
            }
            
            fx.close();
            dadosFunc.close();
            
        }catch(IOException e){
        }
    }
    
    @Override
    public String toString() {
        return "ID: " + this.getId() + "Matrícula: " + this.getMatricula() + " | Nome: " + this.getNome() + 
               " | Idade: " + this.getIdade() + "\n Endereço: " + this.getEndereco() +
               " | E-mail: " + this.getEmail();
    }
}
