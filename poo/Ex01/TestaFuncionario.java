package poo.Ex01;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jorge", "Seguranca", 35, 5);
        Funcionario f2 = new Funcionario("Samara", "Farmaceutica", 28, 3);
        f1.visualiza();
        f2.visualiza();
    }
}
