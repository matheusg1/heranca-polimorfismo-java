

# Heranca e polimorfismo - Java

Exercício do curso "**Java COMPLETO Programação Orientada a Objetos + Projetos**" pela Udemy, com o professor **Nélio Alves**:


>Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado. Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as seguintes: 
>
>**Pessoa física**: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto. 
>**Exemplo**: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: (50000 * 25%) - (2000 * 50%) = **11500.00** 
>
>**Pessoa jurídica**: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto. 
>**Exemplo**: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 400000 * 14% = **56000.00**


### O programa deveria ter o resultado similar ao abaixo:


    Enter the number of tax payers: 3 
    Tax payer #1 data: 
    Individual or company (i/c)? i
    Name: Alex 
    Anual income: 50000.00 
    Health expenditures: 2000.00 
    **Tax payer #2 data: 
    Individual or company (i/c)? c 
    Name: SoftTech
    Anual income: 400000.00 
    Number of employees: 25 
    **Tax payer #3 data: 
    Individual or company (i/c)? i
    Name: Bob 
    Anual income: 120000.00 
    Health expenditures: 1000.00 
    
    TAXES PAID: 
    Alex: $ 11500.00 
    SoftTech: $ 56000.00 
    Bob: $ 29500.00 
    TOTAL TAXES: $ 97000.00

### A partir disso criei as seguintes classes e atributos:

 - Contribuinte:
	 - nome
	 - rendaAnual

 - PessoaFisica:
	 - gastosSaude

 - PessoaJuridica:
	 - quantidadeFuncionarios

   
### Resultado do programa criado, usando as entradas do exemplo acima:

    Entre com o número de contribuintes: 3
    Digite os dados do contribuinte #1
    Pessoa física ou jurídica? [f/j] f
    Nome: Alex
    Renda anual: 50000
    Gastos com saúde: 2000
    Digite os dados do contribuinte #2
    Pessoa física ou jurídica? [f/j] j
    Nome: SoftTech
    Renda anual: 400000
    Número de empregados: 25
    Digite os dados do contribuinte #3
    Pessoa física ou jurídica? [f/j] f
    Nome: Bob
    Renda anual: 120000
    Gastos com saúde: 1000
    
    IMPOSTOS PAGOS:
    Alex $11500,00
    SoftTech $56000,00
    Bob $29500,00
    
    TOTAL EM IMPOSTOS: 97000,00

---
Ferramentas utilizadas: 
<p align="left">
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
<a href="https://www.w3.org/html/" target="_blank" rel="noreferrer"> 
 <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> 
