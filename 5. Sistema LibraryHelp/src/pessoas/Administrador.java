package pessoas;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador extends Pessoa {
    private Acesso acesso;
    private ArrayList <Administrador> listaAdm = new ArrayList <>();
    
    /*Construtor com menos informações*/
    public Administrador(int id, String nome, int idade, Acesso acesso) {
        super(id, nome, idade);
        this.acesso = acesso;
    }
    
    /*Construtor com todas as informações*/
    public Administrador(int id, String nome, int idade, Endereco endereco, String email, Acesso acesso) {
        super(id, nome, idade, endereco, email);
        this.acesso = acesso;
    }

    public Acesso getAcesso() {
        return acesso;
    }
    
    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }
    
    /*Método que cadastra um administrador (esboço inicial)*/
    public void cadastrarAdministrador(Administrador adm) {
        listaAdm.add(adm); /*Adicionando o administrador ao ArrayList*/
    }
    
    public void alterarCadastroAdministrador(int id) {
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
        System.out.print("Entre com o novo ID do administrador: " );
        novoId = in.nextInt();
        in.nextLine();
        listaAdm.get(posicao).setId(novoId);
        System.out.print("Entre com o novo nome do administrador: ");
        novoNome = in.nextLine();
        listaAdm.get(posicao).setNome(novoNome);
        System.out.print("Entre com a nova idade do administrador: ");
        novaIdade = in.nextInt();
        listaAdm.get(posicao).setIdade(novaIdade); 
        System.out.println("O administrador foi atualizado com sucesso!");
        
    }
    
    /*Método que busca um administrador no Array e exibe suas informações*/
    public void buscarAdministrador(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           System.out.println("===========================");
           return;
        }
        int posicao = obterPosicaoArray(id);
        System.out.println("Administrador encontrado.");
        System.out.println("== Informações do Administrador ==");
        System.out.println(listaAdm.get(posicao).toString()); 
        System.out.println("==============================");
    }
    
    
    public void excluirAdministrador(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           System.out.println("===========================");
           return;
        }
        int posicao = obterPosicaoArray(id);
        
        listaAdm.remove(posicao);
        System.out.println("Administrador removido com sucesso!");
    }
    
    public boolean existe(int id){
        boolean existe = false;
        
        for(int i = 0; i < listaAdm.size(); i++){
            if(listaAdm.get(i).getId() == id){
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
        for(int i = 0; i < listaAdm.size(); i++){
            if(listaAdm.get(i).getId() == id){
                indice = i;
                break;
            }
        }
        return indice;
    }
    
    @Override
    public String toString() {
        return "ID: " + this.getId() + " | Nome: " + this.getNome() + 
               " | Idade: " + this.getIdade() + "\n Endereço: " + this.getEndereco() +
               " | E-mail: " + this.getEmail();
    }
}
