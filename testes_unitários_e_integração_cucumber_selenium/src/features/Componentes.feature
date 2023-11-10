#language:pt
Funcionalidade: Acessar vários componentes html

  Contexto:

  @validar_cadastro_do_usuario
  Esquema do Cenario: Preencher o cadastro do usuário
    Dado que o usuário informar nome, sobrenome, sexo, comida, escolaridade e esporte
    Quando clicar em cadastrar
    Entao os dados <dados> devem ser validados no formulario <formulario>
    Exemplos:
      | dados          |  | formulario     |
      | Laura          |  | nome           |
      | Prass          |  | sobrenome      |
      | Feminino       |  | sexo           |
      | Carne         |  | comida          |
      | Superior       |  | escolaridade   |
      | Karate        |  | esporte         |

  @validar_regra_de_negócio
  Cenário: Estabelecer que o campo nome é obrigatório
    Dado que o usuário não preencheu o campo nome
    Quando o usuário for se cadastrar
    Então retorna uma mensagem de erro falando que nome é Obrigatório

  @validar_regra_de_negócio
  Cenário: Estabelecer que o campo sobrenome é obrigatório
    Dado que o usuário não preencheu o campo sobrenome
    Quando o user clicar em cadastrar
    Então retorna uma mensagem de erro falando que sobrenome é Obrigatório

  @validar_regra_de_negócio
  Cenário: Estabelecer que o campo sexo é obrigatório
    Dado que o usuário não preencheu o campo sexo
    Quando dar um clique em cadastrar
    Então retorna uma mensagem de erro falando que sexo é Obrigatório

  @validar_clique-me_volar
  Cenário: Aprovar o campo Clique Me! e o campo Voltar
    Dado que o usuário acessou o arquivo Componentes.html
    Quando clicar no botão Clique Me! e depois no  Voltar
    Então o elemento deve aparecer voltou!
