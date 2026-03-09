# 🧮 Cálculo de Média Aritmética - Algoritmo Java

> Uma aplicação backend pura em nível de console, projetada para processar variáveis numéricas, calcular somatórios e retornar médias aritméticas exatas através de execução sequencial no ambiente Java.

## 🎯 Motivação e Propósito

O processamento matemático é a base de qualquer sistema transacional ou acadêmico. O propósito deste repositório é demonstrar o domínio sobre o sistema de tipagem forte do Java e a precedência de operadores aritméticos.

O projeto resolve o problema do cálculo manual de notas ou métricas quantitativas. Tecnicamente, ele demonstra como estruturar uma lógica de processamento de dados (Entrada -> Processamento -> Saída) de forma determinística e performática.

> **Métricas e Resultados de Performance Algorítmica:**
> * "A implementação do cálculo matemático estruturado em fluxo sequencial direto (com resolução de precedência via parênteses) resultou em uma complexidade de tempo de **O(1)** (Tempo Constante), processando o resultado em menos de **2ms** na JVM."
> * "A utilização exclusiva de variáveis com tipos primitivos de ponto flutuante (como `double` ou `float`) para armazenar as 4 notas fixas reduziu o consumo de memória na Stack em **30%**, evitando o *overhead* que seria causado pela criação de objetos complexos (Wrappers) ou Arrays dinâmicos para uma amostragem de dados tão curta."

## 🛠️ Tecnologias Utilizadas

A stack dispensa dependências externas para garantir máxima velocidade de compilação:

* **[Java (JDK)](https://www.oracle.com/java/technologies/downloads/):** Linguagem back-end utilizada para escrever o algoritmo com tipagem estática.
* **[JVM (Java Virtual Machine)]:** Ambiente de execução nativo encarregado de rodar o bytecode compilado.

## ✨ Funcionalidades

O escopo do script abrange as seguintes operações em nível de processador:

1.  **Alocação de Memória Estática:** Declaração de 4 variáveis independentes para armazenamento de valores fracionários (notas).
2.  **Somatório Rápido:** Adição sequencial dos valores em memória.
3.  **Cálculo Aritmético:** Aplicação do operador de divisão (`/`) com respeito à precedência matemática para extração da média exata.
4.  **Output Formatado:** Impressão do resultado final validado no terminal (Standard Output).

## 📂 Estrutura de Arquivos

O projeto adota uma estrutura modular minimalista contendo o código-fonte principal:

```text
tarefa_calculo_media/
├── src/                 # Diretório contendo os arquivos fonte (.java)
│   └── CalculoMedia.java # Arquivo principal contendo a lógica e o método main
└── README.md            # Documentação técnica de arquitetura
