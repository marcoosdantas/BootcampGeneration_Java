package poo.Ex01;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jorge", "Seguranca", 35, 5);
        Funcionario f2 = new Funcionario("Samara", "Farmaceutica", 28, 3);
        System.out.println("Nome: " + f1.getNome() + " Cargo: " +  f1.getCargo()  + " Idade: " +  f1.getIdade() +  " Tempo de contribuicao: " + f1.getTempoDeContribuicao());
        System.out.println("Nome: " + f2.getNome() + " Cargo: " +  f2.getCargo()  + " Idade: " +  f2.getIdade() +  " Tempo de contribuicao: " + f2.getTempoDeContribuicao());
    }
}
