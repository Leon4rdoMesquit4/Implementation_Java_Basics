public class Main {
    public static void main(String[] args) {
        Goleiro santos = new Goleiro("Santos", 1, "Flamengo", 0, 20);
        SegundoVolante gerson = new SegundoVolante("Gerson", 20, "Flamengo", 3);
        PrimeiroVolante thiago = new PrimeiroVolante("Thiago Maia", 8, "Flamengo", 3);

        System.out.println(santos.getDefesas());
        santos.agarrar();
        System.out.println(santos.getDefesas());
        gerson.subirProAtaque();
        gerson.chutar();
        santos.correr();
        thiago.correr();
        thiago.voltarParaDefesa();
    }
}
