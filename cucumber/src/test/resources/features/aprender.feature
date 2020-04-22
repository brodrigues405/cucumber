
Feature: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar crit�rios de aceitacao

Scenario: Deve executar especificacao
	Given que criei o arquivo correntamente
	When  executa-lo
	Then  a especificacao deve finalizar com sucesso
	Then outro passo

Scenario: Deve incrementar contador
	Given que o valor do contador e 15
	When eu incrementar em 5
	Then o valor do contador e 20
	
Scenario: Deve incrementar contador
	Given que o valor do contador e 2
	When eu incrementar em 1
	Then o valor do contador e 3	

Scenario: Deve calcular atraso na entrega
	Given que a entrega e dia 05/04/2018
	When a entrega atrasar em 2 dias
	Then a entrega sera efetuada em 07/04/2018
	
Scenario: Deve calcular atraso na entrega da China
	Given que a entrega e dia 05/04/2018
	When a entrega atrasar em 2 meses
	Then a entrega sera efetuada em 05/06/2018
	
	
Scenario: Deve criar steps genericos para estes passos
  Given que o ticket e AF345
  Given que o valor da passagem e R$ 230,45
  Given que o nome do passageiro e "Fulano da Silva"
  Given que o telefone do passageiro e 9999-9999
  When criar os steps
  Then o teste vai funcionar
  
Scenario: Deve reaproveitar os steps "Dado" do cen�rio anterior
  Given que o ticket e AB167
  Given que o ticket especial e AB167
  Given que o valor da passagem e R$ 1120,23
  Given que o nome do passageiro e "Cicrano de Oliveira"
  Given que o telefone do passageiro e 9888-8888
  
  
#Cen�rio: Deve negar todos os steps "Dado" dos cen�rios anteriores
    #Dado que o ticket � CD123
    #Dado que o ticket � AG1234
    #Dado que o valor da passagem � R$ 1.1345,56
    #Dado que o nome do passageiro � "Beltrano Souza Matos de 	
	
	
	
	
	