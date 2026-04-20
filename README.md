 Sistema Café Expresso

O Café Expresso é um sistema de autoatendimento desenvolvido para cafeterias de pequeno porte, com o objetivo de modernizar o processo de pedidos e reduzir filas no atendimento tradicional.

A proposta do sistema é permitir que o próprio cliente realize seu pedido por meio de um totem digital, selecione os produtos desejados, efetue o pagamento e acompanhe o status do pedido.  

Além disso, o sistema também oferece uma interface para o atendente/cozinha, responsável por visualizar e gerenciar os pedidos em tempo real.

 Objetivos
Reduzir o tempo de espera dos clientes
Minimizar erros em pedidos manuais
Melhorar a experiência de compra
Organizar o fluxo de pedidos na cafeteria

 Funcionalidades

O sistema contempla os seguintes requisitos funcionais:

Cadastro de produtos (nome e preço)
Adição de múltiplos itens a um pedido
Cálculo automático do valor total
Controle de status do pedido:
Pendente
Pago   
Em preparo
Finalizado 

 Regras de Negócio
O cliente pode selecionar produtos em quantidades variadas
O valor total do pedido é calculado automaticamente
Um pedido só pode avançar para preparo após confirmação de pagamento
O fluxo do pedido segue uma sequência lógica até a finalização

 Estrutura do Sistema

O sistema é baseado em três classes principais:

 Produto
Representa os itens do cardápio, contendo:

Nome
Preço

É a base do sistema, garantindo que os dados dos produtos sejam válidos.

 ItemPedido
Responsável por associar:

Um produto
Uma quantidade

Também realiza o cálculo do subtotal de cada item.

 Pedido

Classe central do sistema, responsável por:

Armazenar os itens do pedido
Calcular o valor total
Gerenciar o status do pedido

Controla todo o fluxo do atendimento, garantindo que as etapas sejam seguidas corretamente.