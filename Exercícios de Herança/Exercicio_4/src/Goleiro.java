public class Goleiro extends Jogador{
    private int defesas;

    public Goleiro(String nome, int numeroCamisa, String clube, int numGol, int defesas) {
        super(nome, numeroCamisa, clube, numGol);
        this.defesas = defesas;
    }

    public void agarrar(){
        System.out.println("Defendeu a bola!");
        defesas++;
    }

    public int getDefesas() {
        return defesas;
    }

    public void setDefesas(int defesas) {
        this.defesas = defesas;
    }

    @Override
    public String toString() {
        return "Goleiro{" +
                "defesas=" + defesas +
                ", nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                ", clube='" + clube + '\'' +
                ", numGol=" + numGol +
                '}';
    }
}
