# Gerenciamento de Recursos App

> **Gerenciamento de Recursos App** é um aplicativo Android projetado para gerenciar eficientemente múltiplas atividades e janelas, utilizando testes automatizados para garantir a qualidade e estabilidade do software.

## Funcionalidades

> - **Gerenciamento de Atividades**: Utiliza o `ActivityManager` para monitorar e otimizar o ciclo de vida das atividades, garantindo a alocação eficiente de memória e a organização dinâmica da interface.

> - **Listagem de Aplicativos Instalados**: Com o `PackageManager`, o aplicativo exibe uma lista completa dos aplicativos instalados no dispositivo, permitindo ao usuário visualizar e interagir com os aplicativos diretamente.

> - **Otimização da Interface do Usuário**: Através do `WindowManager`, o aplicativo realiza ajustes no layout das janelas, como controle de brilho e ajuste do modo de entrada de texto, para melhorar a experiência do usuário.

> - **Testes Automatizados**: Implementação de testes automatizados usando Espresso e JUnit, garantindo que o ciclo de vida das atividades e a interface do usuário sejam validados continuamente, promovendo um software mais robusto e confiável.

## Tecnologias Utilizadas

> - **Linguagem**: Kotlin ou Java

> - **Android Studio**: Android Studio Meerkat | 2024.3.1 Canary 3

> - **Bibliotecas de Teste**: Espresso e JUnit

## Como Funciona

> 1. **Ciclo de Vida das Atividades**: O aplicativo registra logs para cada método do ciclo de vida (`onCreate`, `onStart`, etc.), permitindo a observação detalhada de como as atividades são gerenciadas pelo sistema Android.

> 2. **Listagem de Aplicativos**: Ao iniciar, o aplicativo utiliza o `PackageManager` para recuperar e exibir todos os aplicativos instalados em um `RecyclerView`, proporcionando uma interface amigável para navegação.

> 3. **Ajustes de Janela**: Com o uso do `WindowManager`, o aplicativo demonstra como ajustar parâmetros da janela, como opacidade, para criar um ambiente de uso personalizado.

> 4. **Testes Automatizados**: Os testes são realizados para verificar a presença do `RecyclerView` e se há itens nele, validando a estabilidade da interface, assegurando que as funcionalidade principal do `RecyclerView` está operando conforme o esperado.

## Execução do Aplicativo

> 1. **Clone o Repositório**

>    ```bash
>    git clone git@github.com:nockerajf/GerenciamentoRecursosApp.git
>    ```

> 2. **Importe no Android Studio**

>    - Abra o Android Studio.
>    - Selecione "Open an existing Android Studio project".
>    - Navegue até o diretório clonado e selecione-o.

> 3. **Execute o Aplicativo**

>    - Conecte um dispositivo Android ou inicie um emulador.
>    - Clique em "Run" para compilar e executar o aplicativo.
