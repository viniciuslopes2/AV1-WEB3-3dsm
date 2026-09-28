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

## Erros comuns e troubleshooting

### "Port 8080 was already in use"

Alguma outra aplicação (às vezes uma instância anterior do próprio projeto que não fechou direito) já está usando a porta 8080. Feche o processo antigo ou finalize o terminal onde ele ficou rodando. Se preferir, dá pra rodar em outra porta passando `--server.port=8081` no comando do Maven.

### `mvnw: Permission denied` no Linux/Mac

O arquivo `mvnw` precisa de permissão de execução. Basta rodar `chmod +x mvnw` na pasta `automanager` antes de tentar de novo.

### Erro de versão do Java (`invalid target release` ou parecido)

O projeto usa Java 17. Se aparecer erro de versão ao compilar, confira com `java -version` se essa é a versão configurada como padrão (ou pelo menos a que o VS Code/terminal está enxergando).

### Os dados somem toda vez que reinicio a aplicação

Isso é esperado. O banco usado é o H2 em memória, então tudo que foi cadastrado é apagado quando a aplicação para. Não é um bug, é só a configuração atual do projeto (não usa banco persistente em disco).

### Erro 400/500 ao fazer PUT ou DELETE

Geralmente é porque o `id` não foi enviado no corpo da requisição, ou foi enviado um `id` que não existe no banco. Confira se o JSON enviado tem o campo `id` preenchido com um valor válido.

### Lombok não funciona / getters e setters não são reconhecidos na IDE

Se o VS Code ou outra IDE reclamar de métodos como `getNome()` ou `setNome()` que não existem no código, é porque o plugin do Lombok não está instalado/habilitado na IDE. No VS Code, instale a extensão "Lombok Annotations Support" e reinicie o editor.

### A aplicação não sobe e não aparece nenhum erro claro

Vale rodar pelo terminal (opção 2 do "Como rodar o projeto") mesmo que normalmente você use o Spring Boot Dashboard, porque o log completo do erro aparece mais fácil de ler no terminal do que na aba de output do VS Code.
