/*
Leonardo de Oliveira Silva Vaz
Joao Pedro Monteiro
Davi Alves da Conceicao
Gabriel Leonardo Goncalves dos Santos 
*/

public class ContatoProfissional extends Pessoa {
    private String email;
    private Empresa empresa;


    //construtor(es)
    
    ContatoProfissional(String nome, int ddd, int telefone, String email, String empresa, int dddComercial, int telefoneComercial, Endereco endereco){
        super(nome, ddd, telefone);
        this.email = email;
        this.empresa = new Empresa(empresa, dddComercial, telefoneComercial, endereco);
    }

    //getters & setters
  
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    //metodos 

    void exibirDados(){
        super.exibirDados();
        System.out.println("Email: " + getEmail());
        getEmpresa().exibirDados();
    }
}