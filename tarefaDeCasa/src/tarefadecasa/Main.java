package tarefadecasa;

import classes.Fatura;

public class Main {

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
    
    public static void main(String[] args) {
        
        Fatura faturaTeste = new Fatura("6544", "Venda de um porco de pelúcia", 
                12, 43.55);
            
        System.out.println(faturaTeste.getTotalFatura());
        faturaTeste.setPrecoPorItem(-450);
        System.out.println(faturaTeste.getPrecoPorItem());
        faturaTeste.setDescricao("Venda de uma lâmpada");
        System.out.println(faturaTeste.getDescricao());
        faturaTeste.setNumero("8955f");
        System.out.println(faturaTeste.getNumero());
        faturaTeste.setQntItens(43);
        faturaTeste.setPrecoPorItem(54);
        System.out.println(faturaTeste.getQntItens());
        System.out.println(faturaTeste.getPrecoPorItem());
        System.out.println(faturaTeste.getTotalFatura());
    }
    
}
