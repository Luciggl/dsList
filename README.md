Projeto Do dsList projeto feito no intensivão Java Spring Dev Superior:
anotações importantes:

Aula-1 Intensivão DEV SUPERIOR:

API:
APi é tudo que ta exposto para a WEB
a API é tudo aquilo que da acesso a interface do back-end;

REST:
É um padrão:

Cliente/servidor com http

Comunicação stateless(*)

Interface uniforme, formato padronizado(*)

Cache

Sistema De Camadas

Código sob demanda(opcional)

[stateless =  é um protocolo de comunicação que considera cada requisição como uma transação independente que não está relacionada a qualquer requisição anterior, de forma que a comunicação consista de pares de requisição e resposta independentes]


Padrão de camadas

			FRONT 
	<-JSON(requisições HTTPS/REST>->
		Controladores REST 
	<-Data Transfer Objects (DTO)-> 
		Camada de serviço
	<-Entities/ORM-> 
	Camada de acesso a Dados 


Anotações importantes:

@Entity
para definir uma entidade no banco de dados

@Table(name = "NomeTabela")
para definir a tabela no bando de dados

@Id
para definir o indentidicador PK

@GeneratedValue(Strategy = GenerationType.IDENTITY)
para gerar o Id automaticamente

@Column(name = "nomeParaColuna")
definir nome na coluna;

@Column(columnDefinition = "TEXT)
definir o tipo de dado ta coluna

@Component
define um componente da aplicação

@RestController
define um controlador do tipo rest

@RequestMapping("Rota")
Aqui é onde definimos as rotas

@GetMapping("rotaRequisição")
para definir a rota com o metodo get

@PostMapping("rota")
tipo Post

@DeleteMapping("rota")
tipo Delete

@PutMapping("rota")
Tipo Put para atualizar os dados