# language: pt

Funcionalidade: Comportamento de mudança de texto

  Cenário: Alterar texto na mesma atividade
    Dado que eu abro a atividade principal
    Quando eu digito "Espresso BNB" no campo de entrada
    E eu pressiono o botão de mudar texto
    Então eu vejo o texto "Espresso BNB" exibido

  Cenário: Alterar texto em uma nova atividade
    Dado que eu abro a atividade principal
    Quando eu digito "Hello Espresso BNB" no campo de entrada
    E eu pressiono o botão de mudar texto da nova atividade
    Então eu vejo o texto "Hello Espresso BNB" na nova tela

Cenário: Duplicidade de texto
Dado que eu abro a atividade principal
Quando eu digito "Hello Espresso!" no campo de entrada
E eu pressiono o botão de mudar texto
Então a mensagem de erro "Texto já existe" deve ser exibida

Cenário: Duplicidade de texto em uma nova atividade
Dado que eu abro a atividade principal
Quando eu digito "Hello Espresso!" no campo de entrada
E eu pressiono o botão de mudar texto da nova atividade
Então a mensagem de erro "Texto já existe" deve ser exibida

Cenário: Alterar texto digitando somente números
Dado que eu abro a atividade principal
Quando eu digito "2025" no campo de entrada
E eu pressiono o botão de mudar texto
Então a mensagem de erro "Texto não pode conter apenas números" deve ser exibida

Cenário: Alterar texto em uma nova atividade digitando somente números
Dado que eu abro a atividade principal
Quando eu digito "2025" no campo de entrada
E eu pressiono o botão de mudar texto da nova atividade
Então a mensagem de erro "Texto não pode conter apenas números" deve ser exibida
