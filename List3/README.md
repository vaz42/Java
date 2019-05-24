Laboratório 03 – 2019
======================

1. Tendo como base o exercício da aula passada, faça:

  - a) Descreva o método depositar. Este método deve receber como parâmetro o valor a ser
  depositado. O método deve verificar se o valor passado para depósito não é negativo.

  - b) Descreva o método transferir. Este método deve receber 2 parâmetros: a conta destino e a valor a
  ser transferido. Este método deve verificar se existe o montante disponível na conta. Use os
  métodos já implementados sacar e depositar.

  - c) Modifique o método main para testar os 2 novos métodos. Você deve instanciar um outro objeto
  da classe Conta.
  
2. Descreva a classe Funcionario que possui os seguintes atributos: matrícula, nome, salário base,
quantidade de dependentes e tempo de serviço (inteiro – em anos). Esta classe possui os seguintes
métodos:

  - a) Para calcular e retornar o bônus por tempo de serviço. O bônus é de 2% do salário base por ano de
  serviço.

  - b) Para calcular e retornar o auxílio creche. O auxílio creche é de R$21,00 por dependente.

  - c) Para calcular e retornar o desconto do INSS. O desconto do INSS é calculado de acordo com as
  regras abaixo, não podendo ultrapassar o valor R$642,34.

  - Salário base até R$ 1.751,81: desconto é de 8% do salário
  - Salário base de 1.751,82 até 2.919,72: desconto é de 9% do salário
  - Salário base acima de R$ 2.919,72: desconto é de 11% do salário

  - d) Para calcular e retornar o desconto do imposto de renda. O desconto do imposto de renda é
  calculado da seguinte forma:
  - salário base até 1800,00 → isento (desconto = 0)
  - salário base acima de 1800,00 até 2900,00 → desconto é de 15% do salário base
  - salário base acima de 2900,00 → desconto é de 27,5% do salário base

3. Descreva uma classe para testar a classe Funcionario. Instancie um objeto da classe Funcionário, leia
os dados necessários e exiba o nome, o salário, o bônus, auxílio creche, desconto do INSS e desconto
do IR.

4. Recomenda-se estudante para bolsa de estudo em função de seu desempenho anterior. A natureza da
recomendação é baseada na seguinte tabela:


  - a) Descreva a classe Aluno que possui os seguintes atributos: nome, matrícula, nota da primeira
  prova, nota da segunda prova e média.

  - b) Descreva os métodos da classe Aluno:
  - Para calcular a média do aluno.
  - Para exibir a situação do aluno. A situação pode ser “aprovado”, caso a média seja >= 5,0 ou
    “reprovado”, caso a média seja < 5,0. Este método deverá exibir também a mensagem
    “parabéns”, caso a média do aluno seja acima de 9,0.
  - Para determinar a recomendação. Esta função exibe a recomendação de acordo com a tabela
  acima.

  - c) Descreva uma classe para testar a classe Aluno. Instancie pelo menos 3 objetos da classe aluno.
  Leia os dados necessários, calcule a média e exiba o nome, a matrícula, a média, a situação (e caso
  a média do aluno seja acima de 9,0 exiba, também, a mensagem “parabéns”) e a recomendação.


5. Sabe-se que o volume de uma caixa de lados a, b e c é dado por Vcaixa = a x b x c e que o volume de
um cilindro de raio r e altura h é dado por Vcilindro = πhr2
- Pede-se:
  - a) Descreva a classe Caixa que possui 3 atributos: os lados da caixa.

  - b) A classe Caixa possui um método que calcula e retorna o volume da caixa.

c) Descreva a classe Cilindro que possui 2 atributos: raio e altura.

d) A classe Cilindro possui um método que calcula e retorna o volume do cilindro.

e) Descreva uma classe para calcular e exibir o volume de uma caixa com um furo cilíndrico, com as
dimensões ilustradas na figura abaixo. Instancie um objeto da classe Caixa e um objeto da classe
Cilindro, leia os dados necessários.
