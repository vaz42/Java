Trabalho do Quarto Bimestre - 2019
=========================================

Faça um programa, usando tratamento de exceção, para gerenciar uma agenda telefônica. Seu programa
irá gerenciar uma agenda com no mínimo 10 pessoas. As operações permitidas são:
a) Incluir uma pessoa na agenda.
b) Excluir uma pessoa da agenda.
c) Alterar os dados de uma pessoa, a partir do nome, permitindo escolher o dado a ser alterado.
d) Exibir os dados de uma pessoa (a partir do nome).
e) Listar toda a agenda em ordem alfabética
f) Fim (encerrar o programa)

Classes:

1. Agenda:
  a. Propriedades: array de pessoas, quantidade de elementos no array.
  b. Construtor: instanciar o array e inicializar a quantidade de elementos no array.
  c. Métodos: incluir uma pessoa, excluir uma pessoa, alterar os dados de uma pessoa a partir
  do nome, permitindo escolher o dado a ser alterado, exibir os dados de uma pessoa, listar
  toda a agenda em ordem alfabética.

2. Endereço:
  a. sobrecarga de construtores:
    i. default;
    ii. tipo de logradouro, nome do logradouro, número;
    iii. tipo de logradouro, nome do logradouro, número, complemento;
    iv. tipo de logradouro, nome do logradouro, número, apartamento;
    v. tipo de logradouro, nome do logradouro, número, apartamento, complemento.
  b. Método para exibir os dados do endereço.

3. Pessoa:
  a. Propriedades: nome e telefone celular (DDD e número).
  b. Método: para exibir os dados.

4. Amigo, herda da classe Pessoa.
  a. Propriedades: data do aniversário (dia e mês do aniversário) e Endereço residencial.
  b. Método: para exibir os dados.

5. Contato Profissional, herda da classe Pessoa.
  a. Propriedades: email, nome da empresa, telefone comercial (DDD e número do telefone) e
  Endereço comercial.
  b. Método: para exibir os dados.

6. Classe principal. Para testar a agenda.

Observações:

1. Inclua outros métodos que achar necessário.
2. Não permitir a inclusão de 2 pessoas com o mesmo nome.
3. Validar a data do aniversário. Não permitir data inválida.
4. Não serão aceitos trabalhos fora do prazo.
