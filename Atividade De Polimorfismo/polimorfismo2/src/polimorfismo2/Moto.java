package polimorfismo2;

import java.util.Scanner;

public class Moto extends Veiculos{
    private int ano;

    public Moto(){

    }

    public Moto(int ano, String modelo, double preco) {
        super(modelo, preco);
        this.ano = ano;
    }

    @Override
    public double getPreco(){
        if (ano >= 2008){
            return preco * 1.1;
        } else {
            return preco;
        }
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData(int ano, String modelo, double preco){
        setModelo(modelo);
        setPreco(preco);
        this.ano = ano;
    }

    public void printDados(){
        System.out.println(getModelo() + ", " + getPreco() + ", " + getAno());
    }
    
}
