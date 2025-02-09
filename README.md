O projeto **my-First-Web-Api** é uma aplicação **REST API** desenvolvida em **Java**, utilizando **Spring Boot** para a criação dos endpoints. Ele segue uma arquitetura de **serviços** para gerenciamento de dados e comunicação entre cliente e servidor.  

## 🚀 Tecnologias Utilizadas  
- **Java** (linguagem principal)  
- **Spring Boot** (framework para API REST)  
- **Maven** (gerenciamento de dependências)  

## 🛠️ Funcionalidades e Implementação  

✔ **Arquitetura REST**: A API segue os princípios RESTful, permitindo operações como **GET, POST, PUT e DELETE** para manipulação de recursos.  

✔ **Controllers**: O projeto implementa **Controllers** para definir os endpoints da API.  

✔ **Services**: Camada de serviço para manipular as regras de negócio.  

✔ **Repositórios (Repositories)**: Provavelmente utiliza **Spring Data JPA** para a persistência de dados (necessário verificar os arquivos de código).  

✔ **Gerenciamento de dependências**: Utiliza **Maven**, definido no arquivo `pom.xml`, para organizar as bibliotecas necessárias.  

## 📂 Como Executar  

1. **Clone o repositório**  
   ```sh
   git clone https://github.com/mariavitoriajesus/my-First-Web-Api.git
   cd my-First-Web-Api
   ```

2. **Compilar o projeto**  
   ```sh
   mvn clean install
   ```

3. **Executar a aplicação**  
   ```sh
   mvn spring-boot:run
   ```
   A API estará disponível em **http://localhost:8080/**.  

## 📢 Contribuição  
Caso queira contribuir, faça um **fork** do projeto e abra um **Pull Request** com suas melhorias.  
