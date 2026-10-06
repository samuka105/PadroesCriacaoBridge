# Padrão Bridge com Abstract Factory, Factory Method e Singleton

Exemplo que integra quatro padrões em uma tela de formulários com temas.
O formulário (Bridge) é montado a partir de uma família de componentes
(botão e campo) fornecida por um tema (Abstract Factory). O tema é escolhido
por um Factory Method dentro de um gerenciador único (Singleton), permitindo
combinar qualquer formulário com qualquer tema de forma consistente.

## Conteúdo do repositório

- **Código-fonte** integrando Bridge, Abstract Factory, Factory Method e Singleton (formulários com temas).
- **Casos de teste** (JUnit) cobrindo a instância única, a família de componentes e a troca de tema.
- **Diagrama UML** das classes, em formato de imagem.
