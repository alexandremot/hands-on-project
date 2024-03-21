
#### [ instruções ]


1.  instalar a versão de jdk 17 (caso ainda não tenha instalado; ou tenha outra versão instalada -- jdk 11, por exemplo)
2.  baixar o projeto para ambiente local (git clone https://github.com/alexandremot/hands-on-project.git)
3.  abrir o projeto no Intellij, a partir do POM
4.  em paralelo, abrir o arquivo com as respectivas chaves de acesso aws encaminhadas no email (ex: seuNome_accessKeys.csv)
5.  no projeto, localizar a classe DynamoDBConfig.java (src/main/java/com/example/handson/config)
6.  preencher os dados de acesso (accessKey e secretKey, respectivamente) conforme indicado abaixo:

```java
        ).withCredentials(
                new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials(
                                "QWERTYUIOPASDFGHJKLZXCVBNM",
                                "3aBcDeFgHiJkLmNoPqRsTuVwXyZaBcDeFgHiJkLm"
                        )
                )
        ).build();
```
7.  inicializar/executar o projeto

   ![image](https://github.com/alexandremot/hands-on-project/assets/42823175/45a6068b-28d0-49b0-89e3-a06f5df8e4dc)

9.  executar a seguinte query no insomnia (ou postman):

```curl
curl --request GET \
  --url http://localhost:8080/dict/29640751820 \
```

![image](https://github.com/alexandremot/hands-on-project/assets/42823175/db46f725-c0af-4878-b008-3b5eb752c42b)



10.  deverá ser obtido o seguinte resultado:
    
![Captura de tela de 2024-03-13 22-07-17](https://github.com/alexandremot/hands-on-project/assets/42823175/62140599-a66c-4bac-a8a5-127763d3bf6b)

----

#### [ plus ]

- caso deseje "brincar" com a tabela no dynamo, pode ser realizado acesso no painel indivudial
- para isto, basta abrir o arquivo com as credenciais de acesso (ex.: seuNome_credentials.csv), encaminhado via email
- acessar o link de acesso (ex.: https://789654123987.signin.aws.amazon.com/console) através de um browser de sua preferência
- na página que será aberta, inserir os dados de usuário e senha fornecidos também no arquivo "seuNome_credentials.csv"
- uma vez neste painel, é possível consultar, criar, atualizar e deletar registros na tabela "dict_keys" :-)


