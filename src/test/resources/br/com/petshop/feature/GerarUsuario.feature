#language: pt
#enconding: utf-8

@geral
Funcionalidade: Cadastro de Usuario de petshop
								Eu gostaria de gerar
								um usuario

@gerarusuariopetshop @post
Esquema do Cenario: Cadastro de Usuario de petshop com Sucesso
			Dado que eu realize uma requisicao na API para criar um usuario do petshop  "<id>"  "<username>"  "<firstname>"  "<lastname>"  "<email>" "<password>" "<phone>" "<userStatus>"
			Entao a API me retorna o status code 200   


Exemplos:
| id          | username         | firstname   | lastname    | email                     | password  | phone         |  userStatus |
| 0           | Maria Assuncao   |  Maria      |  Assuncao   |  mariaassuncao@teste.com  |  147258   |  11965655858  |    0        |