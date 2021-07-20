/*
Leonardo de Oliveira Silva Vaz
Joao Pedro Monteiro
Davi Alves da Conceicao
Gabriel Leonardo Goncalves dos Santos 
*/

public class Pessoa {
    private String nome;
    private int dddCelular;
    private int telefoneCelular;

    //construtor(es)

    Pessoa(String nome, int dddCelular, int telefoneCelular) {          //construtor teste
        this.nome = nome;
        this.dddCelular = dddCelular;
        this.telefoneCelular = telefoneCelular;
    }

    //getters & setters 

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDddCelular() {
        return this.dddCelular;
    }

    public void setDddCelular(int dddCelular) {
        this.dddCelular = dddCelular;
    }

    public int getTelefoneCelular() {
        return this.telefoneCelular;
    }

    public void setTelefoneCelular(int telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    //metodos
    
    void exibirDados(){
        System.out.println("\nNome: " + this.getNome());
        System.out.println("\nDDD: " + this.getDddCelular());
        System.out.println("\nTelefone: " + this.getTelefoneCelular());
    }
}
