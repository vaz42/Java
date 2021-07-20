/*
Leonardo de Oliveira Silva Vaz
Joao Pedro Monteiro
Davi Alves da Conceicao
Gabriel Leonardo Goncalves dos Santos 
*/

public class Agenda {
    private Pessoa[] contatos;
    private int countContatos;

    //construtor(es)

    Agenda(){
        this.contatos = new Pessoa[10];
        this.countContatos = 0;
    }

    //getters & setters

    public Pessoa[] getContatos() {
        return this.contatos;
    }

    public void setContatos(Pessoa[] contatos) {
        this.contatos = contatos;
    }

    public int getCountContatos() {
        return this.countContatos;
    }

    public void setCountContatos(int countContatos) {
        this.countContatos = countContatos;
    }

    //metodos

    boolean incluirPessoa(String nome, int ddd, int telefone){              //Pessoa

        for(Pessoa i : getContatos())
            if(i != null)
                if(nome.equals(i.getNome()))
                    return false;

        getContatos()[getCountContatos()] = new Pessoa(nome, ddd, telefone);
        setCountContatos(getCountContatos() + 1);
        return true;
          
    }

    boolean incluirPessoa(String nome, int ddd, int telefone, int diaAniversario, int mesAniversario, Endereco endereco){              //Amigo

        for(Pessoa i : getContatos())
            if(i != null)
                if(nome.equals(i.getNome()))
                    return false;
            

        getContatos()[getCountContatos()] = new Amigo(nome, ddd, telefone, diaAniversario, mesAniversario, endereco);
        setCountContatos(getCountContatos() + 1);
        return true;
    }

    boolean incluirPessoa(String nome, int ddd, int telefone, String email, String empresa, int dddComercial, int telefoneComercial, Endereco endereco){              //Contato Profissional

        for(Pessoa i : getContatos())
            if(i != null)
                if(nome.equals(i.getNome()))
                    return false;
            

        getContatos()[getCountContatos()] = new ContatoProfissional(nome, ddd, telefone, email, empresa, dddComercial, telefoneComercial, endereco);
        setCountContatos(getCountContatos() + 1);
        return true;
    }

    boolean excluirPessoa(String nome){
        int pessoaIndex = acharPessoa(nome);
        if(pessoaIndex == -1)
            return false;
        getContatos()[pessoaIndex] = null;
        Pessoa aux[] = getContatos();
        int countAux = 0;
        for(Pessoa j : getContatos())
            if(j != null)
                aux[countAux++] = j;
        setContatos(aux);
        return true;
    }

    void alterarDadosPessoa(String nome, String novoNome){        //a partir do nome, permitindo escolher o dado a ser alterado
        getContatos()[acharPessoa(nome)].setNome(novoNome);   
    }

    void alterarDadosPessoa(String nome, int novoDdd){
        getContatos()[acharPessoa(nome)].setDddCelular(novoDdd);
    }

    void alterarDadosPessoa(String nome, String email, boolean isEmail){
        ((ContatoProfissional)getContatos()[acharPessoa(nome)]).setEmail(email);
    }

    void alterarDadosPessoa(int novoTelefone, String nome){
        getContatos()[acharPessoa(nome)].setTelefoneCelular(novoTelefone);
    }

    void alterarDadosPessoa(String nome, Empresa empresa){
        ((ContatoProfissional)getContatos()[acharPessoa(nome)]).setEmpresa(empresa);
    }

    void alterarDadosPessoa(String nome, Endereco endereco){
        Pessoa p = getContatos()[acharPessoa(nome)];
        if(p instanceof Amigo)
            ((Amigo) p).setEndereco(endereco);
        else 
            ((ContatoProfissional) p).getEmpresa().setEnderecoComercial(endereco);
    }

    void alterarDadosPessoa(String nome, int diaAniversario, int mesAniversario){
        ((Amigo)getContatos()[acharPessoa(nome)]).setDiaAniversario(diaAniversario);
        ((Amigo)getContatos()[acharPessoa(nome)]).setMesAniversario(mesAniversario);
    }

    void listarAgenda(){        //em ordem alfabetica
        Pessoa aux[] = getContatos();
        ordenarContatos(aux);
        for(Pessoa i : aux){
            if(i != null){
                System.out.println("\n\n-----------------------------\n\n");
                i.exibirDados();
            }
        }
    }

    int acharPessoa(String nome){       //retorna o indice do vetor o qual a pessoa esta referenciada
        int index = 0;
        for(Pessoa i : getContatos()) {
            if(i != null)
                if(nome.equals(i.getNome()))
                    return index;
            index++;
        }
        return -1;
    }

    void ordenarContatos(Pessoa contatos[]){
        for(int i = 0; i < contatos.length - 1 && contatos[i] != null; i++)
            for(int j = i + 1; j < contatos.length && contatos[j] != null; j++)
                if(contatos[i].getNome().compareTo(contatos[j].getNome()) > 0){
                    Pessoa aux = contatos[i];
                    contatos[i] = contatos[j];
                    contatos[j] = aux;
                }
    }
}

