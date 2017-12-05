package ParteGrafica;

import java.util.ArrayList;

/**
 *
 * @author Mathews
 */
public class Emprestimo implements DevolucaoAtrasada{
    private int id;
    private Data dataEmprestimo;
    private Data dataDevolucao;
    private ArrayList<Livro> livros = new ArrayList();
    private Cliente responsavel;
    
    
    @Override
    public double calculoMulta(Data data){
        if(dataDevolucao.getMes() >= data.getMes()){
            if(dataDevolucao.getDia() < data.getDia()){
                int aux = data.getDia() - dataDevolucao.getDia();
                return aux * 1.50;
            }
            else{
                return 0.0;
            }
        }
        else if(dataDevolucao.getMes() < data.getMes()){
             int aux = data.getMes() - dataDevolucao.getMes() * 30;
             if(dataDevolucao.getDia() < data.getDia()){
                 aux += data.getDia() - dataDevolucao.getDia();
             }
             return aux * 1.50;
        }
        
        return 0.0;
    }
    
}
