# ConhecendoJDBC
Este repositório serve para armazenar os conhecimentos e a apresentação sobre JDBC para as turmas do 3 ano de Desenvolvimento de Sistemas.

### Possíveis Dúvidas JDBC:

#### O que é "jar"?

Um arquivo JAR (Java ARchive) é um arquivo que contém um conjunto de arquivos compactados. No contexto do JDBC, frequentemente você precisará de um arquivo JAR que contenha as classes necessárias para se conectar e interagir com um banco de dados específico.

---

#### Em db.properties:

##### O que é "user"?

"User" é o nome de usuário usado para se conectar ao banco de dados. É como seu nome de usuário em um sistema, mas para o banco de dados.

##### O que é "password"?

"Password" é a senha associada ao nome de usuário. É como a chave para acessar seu perfil em um sistema, mas para o banco de dados.

##### O que é "dburl"?

"Dburl" é a URL de conexão com o banco de dados. É o endereço que o programa usa para encontrar e se conectar ao banco de dados.

##### O que é "useSSL"?

"UseSSL" é uma configuração que indica se a conexão com o banco de dados deve ser feita usando SSL (Secure Sockets Layer) para criptografar os dados durante a comunicação.

---

#### O que é Classe FileInputStream?

"FileInputStream" é uma classe em Java que permite ler dados de um arquivo no sistema de arquivos. É útil quando você precisa ler dados de um arquivo, como um arquivo de configuração, por exemplo.

#### O que é Classe Properties?

"Properties" é uma classe em Java que é usada para gerenciar pares de chave-valor. É comumente usada para carregar configurações a partir de arquivos de propriedades, como o arquivo "db.properties" que mencionamos anteriormente.

#### O que é Classe Connection?

"Connection" é uma classe em Java que representa uma conexão com um banco de dados. Você usa essa classe para estabelecer uma conexão com o banco de dados e realizar operações como inserção, atualização, exclusão e consulta de dados.

#### O que é Classe Statement?

"Statement" é uma classe em Java usada para executar instruções SQL em um banco de dados. Você usa essa classe para enviar consultas simples ao banco de dados.

#### O que é Classe PrepareStatement?

"PrepareStatement" é uma subclasse de "Statement" que é usada para executar consultas parametrizadas. Consultas parametrizadas são consultas SQL que podem ter parâmetros que são preenchidos com valores específicos antes da execução.

#### O que é Classe ResultSet?

"ResultSet" é uma classe em Java que representa o conjunto de resultados de uma consulta SQL. Você usa essa classe para iterar sobre os resultados da consulta e acessar os dados retornados pelo banco de dados.

#### O que é Classe DriverManager?

"DriverManager" é uma classe em Java que gerencia os drivers de banco de dados. Você usa essa classe para obter uma conexão com um banco de dados usando as informações de conexão fornecidas.

#### O que é Classe de Exceção RuntimeException?

"RuntimeException" é uma classe em Java que representa exceções que ocorrem durante a execução do programa. Ela é usada para lidar com erros que ocorrem em tempo de execução, como divisão por zero ou acesso a um índice inválido em um array.

#### O que é Classe de Exceção SQLException?

"SQLException" é uma classe em Java que representa exceções específicas do SQL que podem ocorrer durante a interação com um banco de dados. Ela é usada para lidar com erros relacionados ao banco de dados, como consultas mal formadas ou problemas de conexão.

#### O que é Classe de Exceção IOException?

"IOException" é uma classe em Java que representa exceções relacionadas à entrada e saída de dados. Ela é usada para lidar com erros que podem ocorrer ao ler ou gravar dados de ou para um dispositivo, como um arquivo ou um soquete de rede.

---

#### Métodos:

##### props.load(fs);

Este método é usado para carregar propriedades de um objeto "Properties" a partir de um fluxo de entrada, como um arquivo no sistema de arquivos.

##### props.getProperty("dburl");

Este método é usado para obter o valor associado a uma chave específica no objeto "Properties". No caso, estamos recuperando a URL de conexão com o banco de dados.

##### DriverManager.getConnection(url, props)

Este método é usado para estabelecer uma conexão com o banco de dados usando a URL de conexão fornecida e as propriedades de conexão.

##### conn.createStatement();

Este método é usado para criar um objeto "Statement" associado à conexão fornecida. Você usa esse objeto "Statement" para executar consultas SQL simples no banco de dados.

##### st.executeQuery();

Este método é usado para executar uma consulta SQL no banco de dados e retorna um objeto "ResultSet" contendo os resultados da consulta.

##### st.executeUpdate();

Este método é usado para executar uma instrução SQL de atualização, como uma instrução INSERT, UPDATE ou DELETE, no banco de dados.

##### st.setString() or st.setDouble();

Estes métodos são usados para definir os valores dos parâmetros em uma instrução "PrepareStatement". Eles são usados para preencher os espaços reservados na consulta parametrizada com os valores específicos que você deseja usar.

##### e.printStackTrace();

Este método é usado para imprimir a pilha de chamadas de métodos que levou à exceção. É útil para depurar e entender onde ocorreu um erro no código.

---

### Para mais informações:

![assinatura-andreymoraesfriedel](https://github.com/AndreyMoraesFriedel/CursosHTML-CSS-JS/assets/134893056/2fc3ec5d-484b-4034-b20c-b9efa5c0d791)

### **Links** :link:
* Meu perfil no [GitHub](https://github.com/AndreyMoraesFriedel) :octocat:
* Meu perfil no [Instagram](https://www.instagram.com/_moraes_sc/?hl=enl) :camera:
* Meu perfil no [Linkedin](https://www.linkedin.com/in/andrey-moraes/l) :briefcase:
