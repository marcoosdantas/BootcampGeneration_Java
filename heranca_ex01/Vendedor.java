package heranca_ex01;

public class Vendedor extends Funcionario {
    private String numeroDeVendas;

    public String getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(String numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public Vendedor(String nome, String cargo, int idade, int tempoDeContribuicao , int numeroDeVendas) {
        super(nome, cargo, idade, tempoDeContribuicao);
        this.numeroDeVendas = numeroDeVendas;
    }
    public void visualizar() {
        System.out.println("Nome: " + getNome() + " Cargo: " +  getCargo()  + " Idade: " +  getIdade() +  " Tempo de contribuicao: " + getTempoDeContribuicao() + " Departamento: " + getNumeroDeVendas());
    }
}
