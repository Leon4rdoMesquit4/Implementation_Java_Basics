public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Leonardo", 20, "Masculino",
                3250.0, "Uc20982932", "Academia da maça");
        Vendedor vendedor = new Vendedor("Maria", 21, "Feminino",
                4503.23, "Uc39023990", 40_234.43, 45);
        Cliente cliente = new Cliente("Mario", 33, "Masculino",
                8723.90, 1980);

        System.out.println(gerente.toString());
        System.out.println(vendedor.toString());
        System.out.println(cliente.toString());
        System.out.println(vendedor.valorInss());
        System.out.println(gerente.valorInss());
    }
}
