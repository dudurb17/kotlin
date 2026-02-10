# kotlin_app

Projeto Kotlin criado com Gradle, seguindo a estrutura padrão gerada pelo IntelliJ IDEA / Gradle Init.

## Como foi criado

O projeto foi gerado via terminal usando o comando `gradle init` com as seguintes opções:

```bash
mkdir kotlin_app && cd kotlin_app
gradle init
```

### Opções selecionadas durante o init

| Pergunta | Resposta |
|---|---|
| Type of build | **1: Application** |
| Implementation language | **Kotlin** |
| Application structure | **1: Single application project** |
| Build script DSL | **Kotlin** |
| Test framework | **JUnit Jupiter** |
| Project name | `kotlin_app` |
| Source package | `org.example` |

## Estrutura do Projeto

```
kotlin_app/
├── app/
│   ├── build.gradle.kts              # Configuração do build (plugins, dependências)
│   └── src/
│       ├── main/
│       │   ├── kotlin/org/example/
│       │   │   └── App.kt            # Código principal com função main()
│       │   └── resources/
│       └── test/
│           ├── kotlin/org/example/
│           │   └── AppTest.kt        # Testes unitários
│           └── resources/
├── gradle/
│   ├── libs.versions.toml            # Catálogo de versões das dependências
│   └── wrapper/                      # Gradle Wrapper
├── settings.gradle.kts               # Configuração do projeto (nome, módulos)
├── gradle.properties                 # Propriedades do Gradle
├── gradlew                           # Script para rodar Gradle no Linux/macOS
├── gradlew.bat                       # Script para rodar Gradle no Windows
└── .gitignore
```

## Tecnologias e Versões

- **Kotlin**: 2.2.21
- **Java Toolchain**: JDK 21
- **Gradle**: 9.3.1
- **Testes**: JUnit Jupiter 5.12.1
- **Dependência**: Guava 33.4.6-jre

## Como rodar

### Executar a aplicação

```bash
./gradlew :app:run --console=plain -q;  
```

Saída esperada:

```
Hello World!
```

### Executar os testes

```bash
./gradlew test 
```

### Build do projeto

```bash
./gradlew build
```

## Pré-requisitos

- **JDK 21** (baixado automaticamente pelo Gradle via toolchain)
- **Gradle** (ou usar o Gradle Wrapper `./gradlew` incluído no projeto)
