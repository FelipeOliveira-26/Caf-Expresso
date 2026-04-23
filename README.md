# Sistema Café Expresso

O **Café Expresso** é um sistema de autoatendimento desenvolvido para cafeterias de pequeno porte, com o objetivo de modernizar o processo de pedidos e reduzir filas no atendimento tradicional.

A proposta do sistema é permitir que o próprio cliente realize seu pedido por meio de um totem digital, selecione os produtos desejados, efetue o pagamento e acompanhe o status do pedido.

Além disso, o sistema também oferece uma interface para o atendente/cozinha, responsável por visualizar e gerenciar os pedidos em tempo real.

## Objetivos

- Reduzir o tempo de espera dos clientes
- Minimizar erros em pedidos manuais
- Melhorar a experiência de compra
- Organizar o fluxo de pedidos na cafeteria

## Funcionalidades

O sistema contempla os seguintes requisitos funcionais:

- Cadastro de produtos com nome e preço
- Adição de múltiplos itens a um pedido
- Cálculo automático do valor total
- Controle de status do pedido

### Status do pedido

- Pendente
- Pago
- Em preparo
- Finalizado

## Regras de Negócio

- O cliente pode selecionar produtos em quantidades variadas
- O valor total do pedido é calculado automaticamente
- Um pedido só pode avançar para preparo após confirmação de pagamento
- O fluxo do pedido segue uma sequência lógica até a finalização

## Estrutura do Sistema

O sistema é baseado em três classes principais:

### Produto

Representa os itens do cardápio, contendo:

- Nome
- Preço

É a base do sistema, garantindo que os dados dos produtos sejam válidos.

### ItemPedido

Responsável por associar:

- Um produto
- Uma quantidade

Também realiza o cálculo do subtotal de cada item.

### Pedido

Classe central do sistema, responsável por:

- Armazenar os itens do pedido
- Calcular o valor total
- Gerenciar o status do pedido

Controla todo o fluxo do atendimento, garantindo que as etapas sejam seguidas corretamente.

## Exemplo de Fluxo do Sistema

1. O cliente acessa o totem digital da cafeteria.
2. Seleciona os produtos desejados e informa as quantidades.
3. O sistema registra os itens escolhidos no pedido.
4. O valor total é calculado automaticamente.
5. Após a confirmação do pagamento, o pedido recebe o status **Pago**.
6. Em seguida, o pedido passa para o status **Em preparo**.
7. Quando o preparo é concluído, o pedido recebe o status **Finalizado**.

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos

## Autores
Felipe Mendes / Erivelton Afonso

## Etapas de Desenvolvimento

O projeto foi desenvolvido de forma incremental, com commits separados por funcionalidade.  
Cada método principal implementado foi acompanhado de testes específicos, permitindo validar o comportamento do sistema a cada etapa.

### Etapas a serem realizadas

1. Criação da estrutura inicial do projeto
2. Implementação da classe 'Produto'
3. Criação de testes para validação de nome e preço
4. Implementação da classe 'ItemPedido'
5. Criação de testes para cálculo de subtotal
6. Implementação da classe 'Pedido'
7. Criação de testes para adição de itens, cálculo do total e controle de status
8. Ajustes finais e documentação

## Considerações Finais

O sistema Café Expresso foi projetado para tornar o atendimento em cafeterias mais rápido, organizado e eficiente. Com a automação do processo de pedidos, é possível reduzir filas, evitar erros de comunicação e melhorar a experiência tanto do cliente quanto da equipe responsável pelo preparo dos produtos.
