package heranca_ex01;

public class Gerente extends Funcionario {
    private String departamento;


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Gerente(String nome, String cargo, int idade, int tempoDeContribuicao, String departamento) {
        super(nome, cargo, idade, tempoDeContribuicao);
        this.departamento = departamento;
    }
    public void visualizar() {
        System.out.println("Nome: " + getNome() + " Cargo: " +  getCargo()  + " Idade: " +  getIdade() +  " Tempo de contribuicao: " + getTempoDeContribuicao() + " Departamento: " + getDepartamento());
    }
}
