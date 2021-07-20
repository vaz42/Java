/*
Leonardo de Oliveira Silva Vaz
Joao Pedro Monteiro
Davi Alves da Conceicao
Gabriel Leonardo Goncalves dos Santos 
*/

public class Empresa{
    private String nomeEmpresa;
    private int dddComercial;
    private int telefoneComercial;
    private Endereco enderecoComercial;

    Empresa(String nomeEmpresa, int dddComercial, int telefoneComercial, Endereco enderecoComercial){
        this.nomeEmpresa = nomeEmpresa;
        this.dddComercial = dddComercial;
        this.telefoneComercial = telefoneComercial;
        this.enderecoComercial = enderecoComercial;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getDddComercial() {
        return this.dddComercial;
    }

    public void setDddComercial(int dddComercial) {
        this.dddComercial = dddComercial;
    }

    public int getTelefoneComercial() {
        return this.telefoneComercial;
    }

    public void setTelefoneComercial(int telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public Endereco getEnderecoComercial() {
        return this.enderecoComercial;
    }

    public void setEnderecoComercial(Endereco enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }
    
    void exibirDados(){
        System.out.println("Empresa: " + getNomeEmpresa());
        System.out.println("DDD Comercial: " + getDddComercial());
        System.out.println("Telefone Comercial: " + getTelefoneComercial());
        System.out.println("Endereco Comercial: ");
        getEnderecoComercial().exibirDados();
    }
}