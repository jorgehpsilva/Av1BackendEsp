# Av1BackendEsp

# Especialização Back End I
# Avaliação parcial - Checkpoint 1

# Chegamos à avaliação parcial, onde colocaremos em prática todos os conhecimentos vistos até agora, tanto nas aulas como no Playground.
# Como você pôde verificar nos critérios de avaliação, você terá o tempo da aula para fazer a tarefa e em uma semana receberá o aviso por e-mail.
# Bons estudos!

# Exercício
# A partir da seguinte arquitetura de microsserviços, pedimos que você a implemente usando Spring Cloud.

 

# Você terá os microsserviços Movie e Catalog.
#Configure o Eureka server para reconhecer os microsserviços, usando os nomes:
# ● movie-service
# ● catalog-service

# Por sua vez, pedimos que você crie o projeto gateway e configure o roteamento para ambos os microsserviços. Adicione e configure o server config #para obter a configuração a partir de um repositório git.

# Configuração:

# Configure  a porta de cada microsserviço a partir de um repositório git.
#Propriedade:
# server.port=

# movie-service
# É uma API REST que nos permite trazer filmes por gênero. O endpoint deverá ser: /movies/{genre} 

# Cada filme tem como atributo:
# ●	id
# ●	name
# ●	genre
# ●	urlStream

# catalog-service

# API REST que nos permite pesquisar o catálogo por gênero. No momento, pesquisaremos apenas por filmes.
# O endpoint deverá ser: /catalog/{genre} 
# ●	Utilizar Feign para se comunicar com o microsserviço movie-service e obter os filmes.



# A resposta tem a seguinte estrutura:

# ●	genre
# ○	movies
# ■	id
# ■	name
# ■	genre
# ■	urlStream


# Test 
#Adicione um filme do gênero "Ação" no microsserviço movie e consulte o catálogo solicitando (request) o endpoint /catalog /{genre} (catalog-service).









