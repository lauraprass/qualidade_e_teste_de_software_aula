#language:pt

Funcionalidade: Acessar site Senac Faculdade Palhoça

  Contexto:
    Dado que o usuário está com o navegador aberto
    E acessou a url do www.google.com

  Cenário: Acessar site da Faculdade Senac
    Dado que o usuário pesquisou por Faculdade Senac na página do google
    Quando clicar no link Senac Santa Catarina
    Então o site da Faculdade Senac deve ser aberto

  Esquema do Cenário:
    Dado que o usuário acessou o site da Faculdade Senac
    E clicou em Cursos
    Quando clicar em <nível>
    Então deve ser apresentado todos os cursos de <nível>
    Exemplos:
      |nível        |
      |Graduação    |
      |Pós Graduação|