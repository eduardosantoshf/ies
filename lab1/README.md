# Guião Lab 1

## No seu “bloco de notas (ficheiro “readme” da aula), explique o que é um archetype, groupId e artifactId.

archetype - modelo genrénico de uma componente importante num sistema.

groupId - identificador único de cada projeto, este deve seguir as "Java's package name rules", i.e., o mesmo começa pelo domain name revertido.

artifactId - nome do jar sem versão.

## No ficheiro “readme” da aula, responder às questões:

### o que é um “maven goal”?

Os projetos Maven são compostos por "build phases", cada uma destas fases representando um passo no ciclo, estas fases também são denominadas de **goals**.

Cada uma das "build phases" também é dividida em goals, i.e., tarefas a serem cumpridas.

### quais os principais “maven goals” e a respetiva sequência de invocação?
Os principais "maven goals" são os seguintes:
* **validate** - validate the project is correct and all necessary information is available
* **compile** - compile the source code of the project
* **test** - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
* **package** - take the compiled code and package it in its distributable format, such as a JAR.
* **verify** - run any checks on results of integration tests to ensure quality criteria are met
* **install** - install the package into the local repository, for use as a dependency in other projects locally
* **deploy** - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects

A respetiva sequência de invocação obtém-se com o seguinte comando:

```
$ mvn help:describe -Dcmd=PHASENAME 
```
onde PHASENAME, como o próprio nome indica, é a respetiva fase.

