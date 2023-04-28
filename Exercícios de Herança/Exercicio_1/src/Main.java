public class Main {
    /*
    a. Crie as classes solicitadas. (Animal, Peixe e Cachorro)
    b. Faça o relacionamento (herança) entre as classes.
    c. Defina a saída dos dados (toString()) nas classes indicadas. A classe onde tem a indicação
    é onde estará a saída – toString().
    d. Faça a classe de teste e execute.
    */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("leoa",90.44,"seila");
        Peixe peixe = new Peixe("Carpa", 20.3, "Marinho");

        System.out.println(cachorro.toString());
        System.out.println(peixe.toString());
        peixe.setNome("Sardinha");
        System.out.println(peixe.getNome());
        peixe.setPeso(15.3);
        System.out.println(peixe.getPeso());
        peixe.setTipoHabitat("Agua doce");
        System.out.println(peixe.getTipoHabitat());
        cachorro.setNome("Geleia");
        System.out.println(cachorro.getNome());
        cachorro.setPeso(18.4);
        System.out.println(cachorro.getPeso());
        cachorro.setRaca("Vira-Lata");
        System.out.println(cachorro.getRaca());
    }
}
