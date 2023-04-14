package classes;

/*
    Crie uma classe em Java chamada fatura para uma loja de suprimentos de 
    informática. A classe deve conter quatro variáveis – o número (String), 
    a descrição (String), a quantidade comprada de um item (int) e o preço 
    por item (double). A classe deve ter um construtor e um método get e set 
    para cada variável de instância. Além disso, forneça um método chamado 
    getTotalFatura que calcula o valor da fatura e depois retorna o valor 
    como um double. Se o valor não for positivo, ele deve ser configurado 
    como 0. Se o preço por item não for positivo, ele deve ser configurado 
    como 0.0. Escreva um aplicativo de teste chamado FaturaTeste (em outro 
    arquivo) que demonstra as capacidades da classe Fatura.
*/

public class Fatura {
    private String numero;
    private String descricao;
    private int qntItens;
    private double precoPorItem;
    
    public Fatura(String numero, String descricao, 
                int qntItens, double precoPorItem){
        this.numero = numero;
        this.descricao = descricao;
        if (qntItens < 0){
            this.qntItens = 0;
        } else{
            this.qntItens = qntItens;
        }
        
        
        if (precoPorItem < 0){
            this.precoPorItem = 0.0;
        } else{
            this.precoPorItem = precoPorItem;
        }
    }
    
    
    
    public double getTotalFatura(){
        double faturaTotal = qntItens * precoPorItem;
        if (faturaTotal <0){
            return 0;
        } else{
            return faturaTotal;
        }
        
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQntItens() {
        return qntItens;
    }

    public void setQntItens(int qntItens) {
        if (qntItens < 0){
            this.qntItens = 0;
        } else{
            this.qntItens = qntItens;
        }
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem < 0){
            this.precoPorItem = 0.0;
        } else{
            this.precoPorItem = precoPorItem;
        }
    }
    
}
