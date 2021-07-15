# desafio-automacao-web-ticket

Esse desafio é um projeto **Maven** e **Cucumber**, desenvolvido na linguangem de programação **Java** com a **JDK11**

As dependências do projeto se encontram no arquivo **pom.xml**, então basta importá-lo dentro de sua IDE favorita.

A classe **TestRunner** é responsável por dar ínicio à execução da automação se encontra no **src/java/test/runners**
Então basta executar o teste **JUnit** a partir dela.

Dentro dessa mesma classe há uma especificação do dirétorio a ser criado para guardar os relatórios de execução, conforme segue:
**src/test/resources/relatorios** 

São gerados um relatório no formato **HTML** e outro em **JSON**, indicando o status da execução.

A imagem que evidencia o final da execução será criada no seguinte diretório:
**//target//relatorios/evidencias/imagens/**
De acordo com o especificado na classe que implementa os **StepDefinitions**

Por fim, o teste só funcionará se for executado utilizando o navagador **Google Chrome** na versão **91.0.4472.124** que é a sua versão mais recente.
O driver compatível com a versão especificada já se encontra no diretório raiz do projeto, onde será encontrado pelas classes **Pages**.
