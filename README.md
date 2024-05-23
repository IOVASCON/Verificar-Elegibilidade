# Verificar Elegibilidade para Conta Bancária

Este projeto em Java verifica se um cliente é elegível para criar uma conta bancária com base em sua idade. Ele inclui duas versões: uma versão de linha de comando e uma versão com interface gráfica.
Adapatado do Projeto Desafio do curso Santander 2024 - Backend com Java promovido pela empresa educadora DIO.

## Estrutura do Projeto

Verificar-Elegibilidade/
├── src/
│ ├── VerificarElegibilidade.java
│ └── VerificarElegibilidadeGUI.java
└── bin/
├── VerificarElegibilidade.class
└── VerificarElegibilidadeGUI.class

## Pré-requisitos

- JDK instalado (Java Development Kit)
- Git instalado
- Visual Studio Code (VSCode) com o Java Extension Pack

## Compilação

Para compilar os arquivos `.java` e gerar os arquivos `.class` no diretório `bin`, siga os passos abaixo:

1. **Navegue até o diretório `src`**:

   cd src

## Compile os arquivos .java direcionando os arquivos .class para o diretório bin

javac -d ../bin VerificarElegibilidade.java VerificarElegibilidadeGUI.java

## Execução

Para executar o programa com a interface gráfica, use o comando abaixo:

    Navegue até o diretório raiz do projeto (caso ainda não esteja):

cd ..

## Execute o arquivo VerificarElegibilidadeGUI a partir do diretório bin

java -cp bin VerificarElegibilidadeGUI

## Subida para o GitHub

Para subir o projeto para o GitHub, siga os passos abaixo:

    Inicialize um repositório Git (se ainda não estiver inicializado):

    git init

    Adicione os arquivos ao repositório:
    git add .

    Faça o commit das mudanças:
    git commit -m "Organiza projeto e adiciona verificação de elegibilidade com interface gráfica"

    Adicione o repositório remoto (substitua <URL_DO_SEU_REPOSITORIO> pela URL do seu repositório no GitHub):
    git remote add origin <URL_DO_SEU_REPOSITORIO>

    Envie as mudanças para o GitHub:
    git push origin main

## Contribuição

Se desejar contribuir com este projeto, sinta-se à vontade para fazer um fork do repositório, criar um branch para suas alterações e enviar um pull request.
Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

Autor:Izairton Oliveira de Vasconcelos
E-mail:iovascon@gmail.com
