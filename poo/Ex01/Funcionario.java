package poo.Ex01;

public class Funcionario {
    private String nome;
    private String cargo;
    private int idade;
    private int tempoDeContribuicao;

    public void visualiza() {
        System.out.println("Nome: " + getNome() + " Cargo: " +  getCargo()  + " Idade: " +  getIdade() +  " Tempo de contribuicao: " + getTempoDeContribuicao());
    }

    public Funcionario(String nome, String cargo, int idade, int tempoDeContribuicao) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.tempoDeContribuicao = tempoDeContribuicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoDeContribuicao() {
        return tempoDeContribuicao;
    }

    public void setTempoDeContribuicao(int tempoDeContribuicao) {
        this.tempoDeContribuicao = tempoDeContribuicao;
    }
}