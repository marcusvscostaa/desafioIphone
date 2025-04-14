###POO - Abstraindo um Bootcamp Usando Orientação a Objetos em Java

#### Classes(Atributos + Métodos)
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
         String nomeMusica;
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {

    }

    iPhone --> ReprodutorMusical 
    iPhone --> AparelhoTelefonico 
    iPhone --> NavegadorInternet 
```
