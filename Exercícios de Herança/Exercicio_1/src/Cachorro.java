public class Cachorro extends Animal{
    protected String raca;

    public Cachorro(String nome, Double peso,String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + " raça = " + raca;
    }
}
