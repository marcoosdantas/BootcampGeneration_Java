package heranca_ex01;

public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Jorge", "Gerente", 35, 5 , "farmacia");
        Gerente g2 = new Gerente("Lucas", "Gerente", 30, 2 , "farmacia");

        g1.visualizar();
        g2.visualizar();

        Vendedor v1 = new Vendedor ("Gabriel" , "Vendedor" , 23 , 1 , 200);
        Vendedor v2 = new Vendedor ("Marcos" , "Vendedor" , 27 , 3 , 1000);

        v1.visualizar();
        v2.visualizar();
    }
}
