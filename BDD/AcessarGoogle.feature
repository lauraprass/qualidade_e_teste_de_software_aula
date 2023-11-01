#language:pt
Funcionalidade: Pesquisar no Google

  Cenário: Testar navegador
    Quando instanciar chrome-driver
    Então o navegador Google Chrome deve abrir

  Dado que o usuário está na página do google
    E que o usuário digitou o que deseja pesquisar
    Quando clicar em Pesquisar
    Então deve retornar o resultado da pesquisa
