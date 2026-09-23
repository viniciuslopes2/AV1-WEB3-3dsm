# AutoBots

Este projeto é a atividade prática (ATVI) da disciplina de Desenvolvimento Web III, da FATEC São José dos Campos, sob orientação do Prof. Gerson Penha. A proposta simula o backend de um sistema de gestão para lojas de manutenção veicular e venda de autopeças, chamado AutoBots, construído em arquitetura de microsserviços com Java e Spring Boot.

O sistema oferece o cadastro completo de clientes, incluindo seus documentos, endereços e telefones. Cada entidade possui seu próprio CRUD (criar, consultar, atualizar e excluir), acessível via API REST.

## Versões utilizadas

- Java 17
- Spring Boot 2.6.3
- Maven (gerenciador de dependências e build)

## Como rodar o projeto

Existem duas formas de iniciar a aplicação: pelo terminal ou pela extensão Spring Boot Dashboard no VS Code.

### Opção 1: Spring Boot Dashboard (VS Code)

1. Instale a extensão **Spring Boot Dashboard** na aba de extensões do VS Code.
2. Abra a pasta `automanager` no VS Code.
3. Clique no ícone da folha do Spring Boot na barra lateral esquerda.
4. Localize o projeto `automanager` na lista e clique no botão de play ao lado dele.
5. Aguarde o log mostrar que a aplicação subiu na porta `8080`.

### Opção 2: Terminal

1. Abra o terminal na pasta `automanager`.
2. Rode o comando abaixo:

```bash
./mvnw spring-boot:run
```

No Windows, use:

```bash
mvnw.cmd spring-boot:run
```

3. Aguarde o log mostrar que a aplicação subiu na porta `8080`.

## Testando a API

Com o projeto rodando, use o Insomnia, Postman ou outra ferramenta de sua preferência para testar os endpoints em `http://localhost:8080`. Cada entidade (`cliente`, `telefone`, `documento`, `endereco`) possui rotas de cadastro, consulta, atualização e exclusão.

## Rotas disponíveis

### Cliente

| Método | Rota |
|---|---|
| GET | `/cliente/cliente/{id}` |
| GET | `/cliente/clientes` |
| POST | `/cliente/cadastro` |
| PUT | `/cliente/atualizar` |
| DELETE | `/cliente/excluir` |

### Telefone

| Método | Rota |
|---|---|
| GET | `/telefone/telefone/{id}` |
| GET | `/telefone/telefones` |
| POST | `/telefone/cadastro` |
| PUT | `/telefone/atualizar` |
| DELETE | `/telefone/excluir` |

### Documento

| Método | Rota |
|---|---|
| GET | `/documento/documento/{id}` |
| GET | `/documento/documentos` |
| POST | `/documento/cadastro` |
| PUT | `/documento/atualizar` |
| DELETE | `/documento/excluir` |

### Endereco

| Método | Rota |
|---|---|
| GET | `/endereco/endereco/{id}` |
| GET | `/endereco/enderecos` |
| POST | `/endereco/cadastro` |
| PUT | `/endereco/atualizar` |
| DELETE | `/endereco/excluir` |

Nos métodos `PUT` e `DELETE`, o corpo da requisição precisa incluir o `id` do registro que será atualizado ou excluído.
