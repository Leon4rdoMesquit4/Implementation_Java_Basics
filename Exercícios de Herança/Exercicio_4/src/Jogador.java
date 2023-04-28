public class Jogador {
    protected String nome;
    protected int numeroCamisa;
    protected String clube;
    protected int numGol;

    public Jogador(String nome, int numeroCamisa, String clube, int numGol) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.clube = clube;
        this.numGol = numGol;
    }

    public void correr(){
        System.out.println("Seu jogador esta correndo!");
    }

    public void darPasses(){
        System.out.println("Ele deu um passe!");
    }
    public void chutar(){
        System.out.println("Agora chutou!");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public int getNumGol() {
        return numGol;
    }

    public void setNumGol(int numGol) {
        this.numGol = numGol;
    }

    @Override
    public String toString() {
        return "Jogador{ " +
                "nome = '" + nome + '\'' +
                ", numeroCamisa = " + numeroCamisa +
                ", clube = '" + clube + '\'' +
                ", numGol = " + numGol +
                '}';
    }
}
