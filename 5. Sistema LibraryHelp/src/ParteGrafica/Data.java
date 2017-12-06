package ParteGrafica;

import java.io.Serializable;

/**
 *
 * @author Mathews
 */
public class Data implements Serializable{
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    } 
}
