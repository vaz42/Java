/*
Leonardo de Oliveira Silva Vaz
Joao Pedro Monteiro
Davi Alves da Conceicao
Gabriel Leonardo Goncalves dos Santos 
*/

public class Endereco {
    private String tipoLogradouro;
    private String nomeLogradouro;
    private int numero;
    private int apartamento;
    private String complemento;
    private int caso;

    //construtor(es)

    Endereco(){  // i
    }

    Endereco(String tipoLogradouro, String nomeLogradouro, int numero){  // ii
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.caso = 2;
    }

    Endereco(String tipoLogradouro, String nomeLogradouro, int numero, String complemento){  // iii
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.caso = 3;
    }

    Endereco(String tipoLogradouro, String nomeLogradouro, int numero, int apartamento){  // iv
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.apartamento = apartamento;
        this.caso = 4;
    }

    Endereco(String tipoLogradouro, String nomeLogradouro, int numero, int apartamento, String complemento){  // v
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.apartamento = apartamento;
        this.complemento = complemento;
        this.caso = 5;
    }


    //getters & setters

	public String getTipoLogradouro() {
		return this.tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getNomeLogradouro() {
		return this.nomeLogradouro;
	}

	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getApartamento() {
		return this.apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCaso() {
		return this.caso;
	}

	public void setCaso(int caso) {
		this.caso = caso;
	}

    //metodos 

    void exibirDados(){
        switch(this.caso){
            case 2:
                System.out.println(getTipoLogradouro() + " " + getNomeLogradouro() + ", " + getNumero() + "\n");
                break;
            case 3:
                System.out.println(getTipoLogradouro() + " " + getNomeLogradouro() + ", " + getNumero() + ", complemento: " + getComplemento() + "\n");
                break;
            case 4:
                System.out.println(getTipoLogradouro() + " " + getNomeLogradouro() + ", " + getNumero() + ", apto.: " + getApartamento() + "\n");
                break;
            case 5:
                System.out.println(getTipoLogradouro() + " " + getNomeLogradouro() + ", " + getNumero() + ", apto.: " + getApartamento() + ", complemento: " + getComplemento() + "\n");
                break;
            default:
                break;
        }
    }
}

