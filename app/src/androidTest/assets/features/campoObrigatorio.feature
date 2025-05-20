# language: pt

Funcionalidade: Validação de campo obrigatório

  Cenário: Exibir mensagem de erro ao clicar no botão de alterar texto com campo vazio
    Dado que eu abro a atividade principal
    Quando eu pressiono o botão de mudar texto
    Então a mensagem de erro "Campo obrigatório" deve ser exibida

  Cenário: Exibir mensagem de erro ao clicar no botão de alterar texto de uma nova atividade com campo vazio
    Dado que eu abro a atividade principal
    E eu pressiono o botão de mudar texto da nova atividade
    Então a mensagem de erro "Campo obrigatório" deve ser exibida