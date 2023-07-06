package polimorfismo2;

public class Carro extends Veiculos{
    private double km;

    public  Carro(){

    }

    public Carro(double km, String modelo, double preco) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    public double getPreco(){
        if(km > 100000){
            return preco * 0.92;
        } else {
            return preco;
        }
    }

    public void insertData(int ano, String modelo, double km){
        setModelo(modelo);
        setPreco(preco);
        this.km = km;
    }

    public void printDados(){
        System.out.println(getModelo() + ", " + getPreco() + ", " + getKm());
    }
}
