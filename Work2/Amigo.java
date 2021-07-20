/*
Leonardo de Oliveira Silva Vaz
Joao Pedro Monteiro
Davi Alves da Conceicao
Gabriel Leonardo Goncalves dos Santos 
*/

public class Amigo extends Pessoa {
    private int diaAniversario;
    private int mesAniversario;
    private Endereco enderecoResidencial;

    //construtor(es)

    Amigo(String nome, int ddd, int telefone, int diaAniversario, int mesAniversario, Endereco endereco){
        super(nome, ddd, telefone);
        this.diaAniversario = diaAniversario;
        this.mesAniversario = mesAniversario;
        this.enderecoResidencial = endereco;
    }

    //getters & setters

    public int getDiaAniversario() {
        return this.diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getMesAniversario() {
        return this.mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    public Endereco getEndereco() {
        return this.enderecoResidencial;
    }

    public void setEndereco(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    //metodos

    void exibirDados(){
        super.exibirDados();
        System.out.println("Data de Aniversario: " + getDiaAniversario() + "/" + getMesAniversario());
        System.out.println("\nEndereco Residencial: ");
        enderecoResidencial.exibirDados();
    }
}