/*
Leonardo de Oliveira Silva Vaz
Joao Pedro Monteiro
Davi Alves da Conceicao
Gabriel Leonardo Goncalves dos Santos 
*/

import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args){
        Agenda agenda = new Agenda();
        Scanner in = new Scanner(System.in);
        int entrada;

        do{
            //menu
            System.out.println("\t\t\t AGENDA \n\n");
            System.out.println("1 - Adicionar Contato \n");
            System.out.println("2 - Excluir Contato \n");
            System.out.println("3 - Alterar Contato \n");
            System.out.println("4 - Mostrar Contato \n");
            System.out.println("5 - Listar Contatos \n");
            System.out.println("0 - Fechar \n");
            
            entrada = in.nextInt();
            Endereco endereco;
            boolean apartamento = false;
            boolean complemento = false;
            Empresa empresa;

            switch(entrada){
                case 1:                 //adicionar contato

                    System.out.println("\n\nAdicionar Contato: \n\n");
                    System.out.println("Escolha o tipo de contato:");
                    System.out.println("1- Pessoa");
                    System.out.println("2- Amigo");
                    System.out.println("3- Contato Profissional");

                    int tipoContato = in.nextInt();
                    
                    switch(tipoContato){

                        case 1:                 //Pessoa

                            System.out.println("Entre com o nome: \n");
                            String nome = in.next();
        
                            System.out.println("Entre com o DDD do telefone: \n");
                            int ddd = in.nextInt();
        
                            System.out.println("Entre com o telefone: \n");
                            int telefone = in.nextInt();
        
                            System.out.println(agenda.incluirPessoa(nome, ddd, telefone) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                            break;

                        case 2:                 //Amigo

                            System.out.println("Entre com o nome: \n");
                            nome = in.next();
        
                            System.out.println("Entre com o DDD do telefone: \n");
                            ddd = in.nextInt();
        
                            System.out.println("Entre com o telefone: \n");
                            telefone = in.nextInt();

                            System.out.println("Entre com o dia do aniversario: \n");
                            int diaAniversario = in.nextInt();

                            System.out.println("Entre com o mes do aniversario: \n");
                            int mesAniversario = in.nextInt();

                            endereco = new Endereco();

                            System.out.println("Entre com o endereco: \n");
                            System.out.println("Tipo do Logradouro:");
                            endereco.setTipoLogradouro(in.next());

                            System.out.println("Entre com o nome do Logradouro:");
                            endereco.setNomeLogradouro(in.next());

                            System.out.println("Entre com o numero do endereco:");
                            endereco.setNumero(in.nextInt());

                            System.out.println("Deseja adicionar apartamento? (1 / 0)");
                            if(in.nextInt() == 1){

                                System.out.println("Entre com o numero do apartamento: \n");
                                endereco.setApartamento(in.nextInt());

                                System.out.println("Deseja adicionar complemento? (1 / 0)");

                                if(in.nextInt() == 1){
                                    System.out.println("Entre com o numero do complemento: \n");
                                    endereco.setComplemento(in.next());
                                    endereco.setCaso(5);                                                       //com apartamento e com complemento (CAS0 5)
                                    System.out.println(agenda.incluirPessoa(nome, ddd, telefone, diaAniversario, mesAniversario, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                                    break;
                                }
                                endereco.setCaso(4);                                                           //com apartamento e sem complemento
                                System.out.println(agenda.incluirPessoa(nome, ddd, telefone, diaAniversario, mesAniversario, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                                break;
                            }
                           
                            System.out.println("Deseja adicionar complemento? (1 / 0)");

                            if(in.nextInt() == 1){
                                System.out.println("Entre com o numero do complemento: \n");
                                endereco.setComplemento(in.next());
                                endereco.setCaso(3);                                                           //sem apartamento e com complemento
                                System.out.println(agenda.incluirPessoa(nome, ddd, telefone, diaAniversario, mesAniversario, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                                break;
                            }
                            
                            endereco.setCaso(2);                                                               //sem apartamento  e sem complemento
                            System.out.println(agenda.incluirPessoa(nome, ddd, telefone, diaAniversario, mesAniversario, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                            break;
                        
                        case 3:                 //Contato Profissional

                            System.out.println("Entre com o nome: \n");
                            nome = in.next();
        
                            System.out.println("Entre com o DDD do telefone: \n");
                            ddd = in.nextInt();
        
                            System.out.println("Entre com o telefone: \n");
                            telefone = in.nextInt();

                            System.out.println("Entre com o email: \n");
                            String email = in.next();

                            System.out.println("Entre com o nome da empresa: \n");
                            String nomeEmpresa = in.next();

                            System.out.println("Entre com o DDD do telefone comercial: \n");
                            int dddComercial = in.nextInt();

                            System.out.println("Entre com o telefone comercial: \n");
                            int telefoneComercial = in.nextInt();

                            System.out.println("Entre com o endereco: \n");
                            System.out.println("Tipo do Logradouro:");
                            
                            endereco = new Endereco();
                            endereco.setTipoLogradouro(in.next());

                            System.out.println("Entre com o nome do Logradouro:");
                            endereco.setNomeLogradouro(in.next());

                            System.out.println("Entre com o numero do endereco:");
                            endereco.setNumero(in.nextInt());;

                            System.out.println("Deseja adicionar apartamento? (1 / 0)");
                            if(in.nextInt() == 1){

                                System.out.println("Entre com o numero do apartamento: \n");
                                endereco.setApartamento(in.nextInt());

                                System.out.println("Deseja adicionar complemento? (1 / 0)");

                                if(in.nextInt() == 1){
                                    System.out.println("Entre com o numero do complemento: \n");
                                    endereco.setComplemento(in.next());
                                    endereco.setCaso(5);                                                       //com apartamento e com complemento (CAS0 5)
                                    System.out.println(agenda.incluirPessoa(nome, ddd, telefone, email, nomeEmpresa, dddComercial, telefoneComercial, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                                    break;
                                }
                                endereco.setCaso(4);                                                           //com apartamento e sem complemento
                                System.out.println(agenda.incluirPessoa(nome, ddd, telefone, email, nomeEmpresa, dddComercial, telefoneComercial, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                                break;
                            }
                           
                            System.out.println("Deseja adicionar complemento? (1 / 0)");

                            if(in.nextInt() == 1){
                                System.out.println("Entre com o numero do complemento: \n");
                                endereco.setComplemento(in.next());
                                endereco.setCaso(3);                                                           //sem apartamento e com complemento
                                System.out.println(agenda.incluirPessoa(nome, ddd, telefone, email, nomeEmpresa, dddComercial, telefoneComercial, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                                break;
                            }
                            
                            endereco.setCaso(2);                                                               //sem apartamento  e sem complemento
                            System.out.println(agenda.incluirPessoa(nome, ddd, telefone, email, nomeEmpresa, dddComercial, telefoneComercial, endereco) ? "Contato adicionado!" : "Contato com o mesmo nome ja adicionado!");
                            break;
                    }
                    
                    break;

                case 2:                 //excluir contato
                    System.out.println("Excluir Contato: \n\n");

                    System.out.println("Entre com o nome: \n");
                    String nome = in.next();

                    System.out.println(agenda.excluirPessoa(nome) ? "Contato excluido!" : "Contato com esse nome nao achado!");
        
                    break;

                case 3:                 //alterar contato
                    System.out.println("Alterar Contato: \n\n");

                    System.out.println("Entre com o nome: \n");
                    nome = in.next();
                    int tipoPessoa;

                    // Amigo, Pessoa ou Contato Profissional?

                    if(agenda.getContatos()[agenda.acharPessoa(nome)] instanceof ContatoProfissional){
                        tipoPessoa = 3;
                    }
                    else if(agenda.getContatos()[agenda.acharPessoa(nome)] instanceof Amigo){
                        tipoPessoa = 2;
                    }
                    else{
                        tipoPessoa = 1;
                    }

                    System.out.println("\n\n Selecione o dado a ser alterado: \n\n");

                    switch(tipoPessoa){
                        case 1:
                            System.out.println("1 - Nome\n");
                            System.out.println("2 - DDD\n");
                            System.out.println("3 - Telefone\n\n");
        
                            int dado = in.nextInt();
                            
                            switch(dado){
                                case 1:
                                    System.out.println("\n\n Insira o novo nome:\n");
                                    String novoNome = in.next();
                                    agenda.alterarDadosPessoa(nome, novoNome);
                                    break;
                                case 2:
                                    System.out.println("\n\nInsira o novo DDD:\n");
                                    int novoDdd = in.nextInt();
                                    agenda.alterarDadosPessoa(nome, novoDdd);
                                    break;
                                case 3:
                                    System.out.println("\n\nInsira o novo Telefone:\n");
                                    int novoTelefone = in.nextInt();
                                    agenda.alterarDadosPessoa(novoTelefone, nome);
                                    break;
                            }   

                            break;

                        case 2:
                            System.out.println("1 - Nome\n");
                            System.out.println("2 - DDD\n");
                            System.out.println("3 - Telefone\n\n"); 
                            System.out.println("4 - Dia do Aniversario\n");
                            System.out.println("5 - Mes do Aniversario\n");
                            System.out.println("6 - Endereco\n");

                            dado = in.nextInt();

                            switch(dado){
                                case 1:
                                    System.out.println("\n\n Insira o novo nome:\n");
                                    String novoNome = in.next();
                                    agenda.alterarDadosPessoa(nome, novoNome);
                                    break;
                                case 2:
                                    System.out.println("\n\nInsira o novo DDD:\n");
                                    int novoDdd = in.nextInt();
                                    agenda.alterarDadosPessoa(nome, novoDdd);
                                    break;
                                case 3:
                                    System.out.println("\n\nInsira o novo Telefone:\n");
                                    int novoTelefone = in.nextInt();
                                    agenda.alterarDadosPessoa(novoTelefone, nome);
                                    break;
                                case 4: 
                                    System.out.println("\n\nInsira o novo dia:\n");
                                    int novoDia = in.nextInt();
                                    agenda.alterarDadosPessoa(nome, novoDia, ((Amigo) agenda.getContatos()[agenda.acharPessoa(nome)]).getMesAniversario());
                                    break;
                                case 5:
                                    System.out.println("\n\nInsira o novo mes:\n");
                                    int novoMes = in.nextInt();
                                    agenda.alterarDadosPessoa(nome, ((Amigo) agenda.getContatos()[agenda.acharPessoa(nome)]).getDiaAniversario(), novoMes);
                                    break;
                                case 6: 
                                    System.out.println("\n\nInsira o novo endereco:\n");
                                    
                                    endereco = ((Amigo) agenda.getContatos()[agenda.acharPessoa(nome)]).getEndereco();
                                    System.out.println("Tipo do Logradouro:");
                                    endereco.setTipoLogradouro(in.next());

                                    System.out.println("Entre com o nome do Logradouro:");
                                    endereco.setNomeLogradouro(in.next());

                                    System.out.println("Entre com o numero do endereco:");
                                    endereco.setNumero(in.nextInt());

                                    System.out.println("Deseja adicionar apartamento? (1 / 0)");
                                    
                                    if(in.nextInt() == 1){
                                        System.out.println("Entre com o numero do apartamento: \n");
                                        endereco.setApartamento(in.nextInt());
                                        apartamento = true;
                                    }

                                    System.out.println("Deseja adicionar complemento? (1 / 0)");
                                    if(in.nextInt() == 1){
                                        System.out.println("Entre com o numero do apartamento: \n");
                                        endereco.setComplemento(in.next());
                                        complemento = true;
                                    }

                                    if(complemento)
                                        if(apartamento)
                                            endereco.setCaso(5);
                                        else
                                            endereco.setCaso(3);
                                    else
                                        if(apartamento)
                                            endereco.setCaso(4);
                                        else
                                            endereco.setCaso(2);
                                    
                                    agenda.alterarDadosPessoa(nome, endereco);        
                                break;
                            }  
                            break;

                        case 3: 
                            System.out.println("1 - Nome\n");
                            System.out.println("2 - DDD\n");
                            System.out.println("3 - Telefone\n\n"); 
                            System.out.println("4 - Email\n");
                            System.out.println("5 - Nome da empresa\n");
                            System.out.println("6 - DDD (Comercial)\n");
                            System.out.println("7 - Telefone (Comercial)\n");
                            System.out.println("8 - Endereco\n");

                            dado = in.nextInt();

                            switch(dado){
                                case 1:
                                    System.out.println("\n\n Insira o novo nome:\n");
                                    String novoNome = in.next();
                                    agenda.alterarDadosPessoa(nome, novoNome);
                                    break;
                                case 2:
                                    System.out.println("\n\nInsira o novo DDD:\n");
                                    int novoDdd = in.nextInt();
                                    agenda.alterarDadosPessoa(nome, novoDdd);
                                    break;
                                case 3:
                                    System.out.println("\n\nInsira o novo Telefone:\n");
                                    int novoTelefone = in.nextInt();
                                    agenda.alterarDadosPessoa(novoTelefone, nome);
                                    break;
                                case 4: 
                                    System.out.println("\n\nInsira o novo Email:\n");
                                    String email = in.next();
                                    boolean coe = false;
                                    agenda.alterarDadosPessoa(nome, email, coe);
                                    break;
                                case 5:
                                    System.out.println("\n\nInsira o nome da Empresa:\n");
                                    String nomeEmpresa = in.next();
                                    empresa = ((ContatoProfissional) agenda.getContatos()[agenda.acharPessoa(nome)]).getEmpresa();
                                    empresa.setNomeEmpresa(nomeEmpresa);
                                    agenda.alterarDadosPessoa(nome, empresa);
                                    break;
                                case 6:
                                    System.out.println("\n\nInsira o ddd comercial:\n");
                                    int dddComercial  = in.nextInt();
                                    empresa = ((ContatoProfissional) agenda.getContatos()[agenda.acharPessoa(nome)]).getEmpresa();
                                    empresa.setDddComercial(dddComercial);
                                    agenda.alterarDadosPessoa(nome, empresa);
                                    break;
                                case 7:
                                    System.out.println("\n\nInsira o telefone comercial:\n");
                                    int telefoneComercial = in.nextInt();
                                    empresa = ((ContatoProfissional) agenda.getContatos()[agenda.acharPessoa(nome)]).getEmpresa();
                                    empresa.setTelefoneComercial(telefoneComercial);
                                    agenda.alterarDadosPessoa(nome, empresa);
                                    break;
                                case 8: 
                                    System.out.println("\n\nInsira o novo endereco:\n");
                                    
                                    endereco = ((ContatoProfissional) agenda.getContatos()[agenda.acharPessoa(nome)]).getEmpresa().getEnderecoComercial();

                                    System.out.println("Tipo do Logradouro:");
                                    endereco.setTipoLogradouro(in.next());

                                    System.out.println("Entre com o nome do Logradouro:");
                                    endereco.setNomeLogradouro(in.next());

                                    System.out.println("Entre com o numero do endereco:");
                                    endereco.setNumero(in.nextInt());

                                    System.out.println("Deseja adicionar apartamento? (1 / 0)");
                                    
                                    if(in.nextInt() == 1){
                                        System.out.println("Entre com o numero do apartamento: \n");
                                        endereco.setApartamento(in.nextInt());
                                        apartamento = true;
                                    }

                                    System.out.println("Deseja adicionar complemento? (1 / 0)");
                                    if(in.nextInt() == 1){
                                        System.out.println("Entre com o numero do apartamento: \n");
                                        endereco.setComplemento(in.next());
                                        complemento = true;
                                    }

                                    if(complemento)
                                        if(apartamento)
                                            endereco.setCaso(5);
                                        else
                                            endereco.setCaso(3);
                                    else
                                        if(apartamento)
                                            endereco.setCaso(4);
                                        else
                                            endereco.setCaso(2);
                                    
                                    empresa = ((ContatoProfissional) agenda.getContatos()[agenda.acharPessoa(nome)]).getEmpresa();
                                    empresa.setEnderecoComercial(endereco);
                                    
                                    agenda.alterarDadosPessoa(nome, empresa);
                                    break;
                            }
                            break;
                    }
                case 4:                 //exibir contato
                    System.out.println("Exibir Contato: \n\n");

                    System.out.println("Entre com o nome: \n");
                    nome = in.next();
                    agenda.getContatos()[agenda.acharPessoa(nome)].exibirDados();
                    break;

                case 5:                 //listar contatos
                    System.out.println("Contatos:\n\n");
                    agenda.listarAgenda();
                    break;  

                case 0:
                    break;

                default:
                    System.out.println("Operacao invalida!");

            }
        }while(entrada != 0);
    }
}