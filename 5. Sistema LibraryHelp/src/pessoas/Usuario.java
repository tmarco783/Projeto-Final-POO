package pessoas;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Pessoa{
    private int id;
    private int matricula;
    private String login;
    private int senha;
    private ArrayList <Usuario> listaUser = new ArrayList <>();

    /*public Usuario(int id, String nome, int idade, Acesso acesso) {
        super(id, nome, idade);
    }*/
    
    /*public Usuario(int id, String nome, int idade, Endereco endereco, String email, Acesso acesso) {
        super(id, nome, idade, endereco, email);
    }*/
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void cadastrarUsuario(Usuario user) {
        listaUser.add(user);
    }
    
    public void alterarRegistroUsuario(int id) {
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
        System.out.print("Entre com o novo ID do usuário: " );
        novoId = in.nextInt();
        in.nextLine();
        /*listaUser.get(posicao).setId(novoId);*/
        System.out.print("Entre com o novo nome do usuário: ");
        novoNome = in.nextLine();
        /*listaUser.get(posicao).setNome(novoNome);*/
        System.out.print("Entre com a nova idade do usuário: ");
        novaIdade = in.nextInt();
        /*listaUser.get(posicao).setIdade(novaIdade);*/ 
        System.out.println("O usuário foi atualizado com sucesso!");
    }
    
    public void buscarUsuario(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           System.out.println("===========================");
           return;
        }
        int posicao = obterPosicaoArray(id);
        System.out.println("Usuário encontrado!");
        System.out.println("== Informações do Usuário ==");
        System.out.println(listaUser.get(posicao).toString()); 
        System.out.println("==============================");
    }
    
    public void exlcuirUsuario(int id) {
        if(!existe(id)){
           System.out.println("O ID informado não existe.");
           System.out.println("===========================");
           return;
        }
        int posicao = obterPosicaoArray(id);
        
        listaUser.remove(posicao);
        System.out.println("Usuário removido com sucesso!");
    }
    
    public boolean existe(int id){
        boolean existe = false;
        
        for(int i = 0; i < listaUser.size(); i++){
            if(listaUser.get(i).getId() == id){
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
        for(int i = 0; i < listaUser.size(); i++){
            if(listaUser.get(i).getId() == id){
                indice = i;
                break;
            }
        }
        return indice;
    }
    
    
}
