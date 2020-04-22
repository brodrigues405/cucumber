Feature: alugar filme
	Como um usuário
	Eu quero cadastrar aluguéis de filmes
	Para controlar preços e datas de entrega
	
Scenario: Deve alugar um filme com sucesso
	Given um filme com estoque de 2 unidades
	And que o preco de aluguel seja R$ 3
	When alugar
	Then o preco do aluguel sera R$ 3
	And a data de entrega sera no dia seguinte
	And o estoque do filme sera 1 unidade
	
#Scenario: Não deve alugar filme sem estoque
	#Given um filme com estoque de 0 unidades
	#When alugar
	#Then nao sera possivel por falta de estoque
	
#Scenario: Deve dar condições especiais para categoria extendida
	#Given um filme com estoque de 2 unidades
	#And que o preco de aluguel seja R$ 4
	#And que o tipo do aluguel seja extendido
	#When alugar
	#Then o preço do aluguel sera R$ 8
	#And a data de entrega sera em 3 dias
	#And a pontuacao recebida sera de 2 pontos
