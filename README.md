![alt text](https://i.postimg.cc/LXjTgrMH/Squad18-1.jpg)

# doacao-api project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .



## Passo-a-passo de como instalar o projeto e executá-lo

Esse projeto é feito com Java, sendo utilizado o framework Quarkus, e MySQL para o banco de dados.
Para o Quarkus, é necessário o JDK 11 e o Apache Maven 3.6.3 (links abaixo):

https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html
https://maven.apache.org/download.cgi

Como IDE, estamos usando o Eclipse:

https://www.eclipse.org/downloads/


Instalado todos esses componentes, segue abaixo como baixar o programa e executá-lo:


*****
1º Clone o projeto do github a partit da url: https://github.com/squad18/hackathon.fcamara.git 

```shell script
git clone https://github.com/squad18/hackathon.fcamara.git
```

Para acessar a branch master, execute o seguinte código no terminal:

```shell script
git checkout master
```


*****
2º - Estando no diretório do projeto, execute o seguinde comanto no terminal:

```shell script
./mvnw compile quarkus:dev
```


*****
3º - Acesse o link abaixo no seu navegador para verificar se esta funcionando a aplicação:

http://localhost:8080/q/swagger-ui/



*****
4º - Se você estiver usando o Eclipse, basta importá-lo da seguinte maneira:

- Com o Eclipse aberto, clique em: File-> Import;
- Abra   a aba do Import e depois seleciona "Existing Maven Project";
- Navegue até o diretório onde está o projeto e clique em abrir;


Caso ocorra algum problema na aplicação ou em sua execução, contate-nos por discord ou por e-mail:

Lucas - @Lucas Cabral / lucas.kabral2112@gmail.com
Monica - @Monica Ribeiro / monicaspribeiro@gmail.com
Riane - @Riane / Rianemlo@gmail.com