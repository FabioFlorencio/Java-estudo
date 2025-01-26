# 📋 Tabela de revisão rápida ⚡

Aqui está uma tabela de revisão sobre as principais sintaxes em Java.


- [📋 Tabela de revisão rápida ⚡](#-tabela-de-revisão-rápida-)
  - [🎲 Tipos de dados](#-tipos-de-dados)
  - [π Constantes](#-Constantes)
  	- [Constantes Simples](#-Constantes-simples)
  - [Format](#-format)
	  - [printf](#-printf)
  - [🚦 Condicionais](#-Condicionais)
	  - [If](#-if)
	  - [Ternário](#-Ternario)
  - [🔒 Arrays](#-arrays)
	  - [Sort](#-sort)
	  - [Fill](#-fill)
	  - [Copy](#-copy)
	  - [Equals](#-equals)
	  - [Binary Search](#-binary-search)
	  - [to String](#-to-string)
	  - [copy Of](#-copy-of)
	  - [copy Of Range](#-copy-of-range)
	  - [Arrays as List](#-as-list)
  - [📋 Arrays List](#-Arrays-list)
	  - [Array LinkedList](#-Array-linkedList)
  - [✍️ String](#-string)
	  - [Equals Ignore Case](#-Equals-Ignore-Case)  
	  - [String Builder](#-String-builder)  
  - [List](#-list)
	  - [ArrayList com tamanho determinado](#-ArrayList-com-tamanho-determinado)
  - [Try](#-try)
	  - [Múltiplos Catch](#-Multiplos-Catch)
	  - [Múltiplos Catch Genérico](#-Múltiplos-Catch-Genérico)
  
  
  
# Tabela de revisão rápida
  
## 🎲 Tipos de dados
  
## π Constantes 
###  Constantes Simples

```java
final double PI = 3.14159; // Constante para o valor de PI
final int MAX_TENTATIVAS = 5; // Constante para número máximo de tentativas

System.out.println("Valor de PI: " + PI);
System.out.println("Máximo de tentativas permitidas: " + MAX_TENTATIVAS);
```
  
## Format

### printf

```java

import java.util.Locale;
		
Locale.setDefault(Locale.US);

//Exemplo de print formatado
//%n -> quebra de linha		
double x = 10.35784;

System.out.println(x);
System.out.printf("%.2f%n", x);		
System.out.printf("%.4f%n", x);

```

```java

// %f = ponto flutuante
// %d = inteiro
// %s = texto
// %n = quebra de linha

String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);

```
## 🚦 Condicionais

### If

```java

import java.util.Scanner;
		
Scanner scan = new Scanner(System.in);

System.out.print("Entre com sua idade:");
int idade = scan.nextInt();

if (idade >= 18) {
	System.out.println("É maior de idade.");
} else {
	System.out.println("Não é maior de idade.");
}					
	
```

### Ternário

```java

int numero = 5;

// Operador ternário para verificar se o número é par ou ímpar
String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

System.out.println("O número " + numero + " é " + resultado);

```

## 🔒 Arrays

### Sort

```java
import java.util.Arrays;

		
int[] num = {9,5,0,7,4,2,6,3,1,8};

// faz a ordenação do array
Arrays.sort(num);

for(int n: num) {
	System.out.printf("%d - ", n);
}	

```
### Fill

```java
import java.util.Arrays;

int[] num = {9,5,0,7,4,2,6,3,1,8};
int[] num2 = new int[10];

// preenche o array com o número 10
Arrays.fill(num2,10);
		
for(int n: num2) {
	System.out.printf("%d - ", n);
}	

```
### Copy

```java
		
int[] num = {9,5,0,7,4,2,6,3,1,8};
int[] num2 = new int[10];

//                |------------------------> array de origem
//                |   |--------------------> posição inicial do array de origem
//                |   |   |----------------> array de destino (que vai receber os dados) 
//                |   |   |    |-----------> posição inicial do array de destino      
//                |   |   |    |  |--------> a quantidade de elementos que serão copiados       
//                |   |   |    |  |	
//System.arraycopy(num, 0, num2, 1, 8);
System.arraycopy(num, 0, num2, 0, num.length);
		
for (int n: num2) {
	System.out.printf("%d - ", n);
}				

```
### Equals

```java
import java.util.Arrays;

int[] num1 = {0,1,2,3,4,5,6,7,8,9};
int[] num2 = {0,1,2,3,4,5,6,7,8,9};
int[] num3 = {9,8,7,6,5,4,3,2,1,0};
int[] num4 = {10,4,7,23,4,10,8,0,4,9};

System.out.printf("num1 igual num2: %s%n", Arrays.equals(num1, num2));
System.out.printf("num1 igual num3: %s%n", Arrays.equals(num1, num3));
System.out.printf("num3 igual num4: %s%n", Arrays.equals(num3, num4));
		
```
### Binary Search

```java
import java.util.Arrays;

int[] num1 = {0,1,2,3,4,5,6,7,8,9};
int[] num2 = {0,1,2,3,4,5,6,7,8,9};
int[] num3 = {9,8,7,6,5,4,3,2,1,0};
int[] num4 = {10,4,7,23,4,10,8,0,4,9};
		
int valor1 = 9;
int valor2 = 100;
Arrays.sort(num4);
int pos3 = Arrays.binarySearch(num4, valor1);
int pos1 = Arrays.binarySearch(num1,valor1);
int pos2 = Arrays.binarySearch(num1,valor2);

// O array precisa está ordenado para fazer a busca
// Verifica sem tem o valor no array, caso não tenha retorna um valor negativo

System.out.printf("%d está no array? %s - posição:%d%n", valor1, pos1 >-1 ?"Sim" :"Não", pos1);
System.out.printf("%d está no array? - posição: %s", valor2, pos2);
System.out.printf("%n%d está no array? - posição: %s", valor1, pos3);
		
```

### to String

```java
import java.util.Arrays;
		
int[] numeros = {1,2,3,4};

//Converte um array de inteiros em string para exibição.
System.out.println(Arrays.toString(numeros));		

```
### copy Of

```java
import java.util.Arrays;

int[] numeros = {1,2,3};
// Copia os elementos de um array para um novo array
int[] copia = Arrays.copyOf(numeros, 5);

System.out.println(Arrays.toString(copia));

for (int c: copia) {
	System.out.println(c);
}

```
### copy Of Range

```java
import java.util.Arrays;


int[] numeros = {1,2,3,4,5};
int[] subArrays = Arrays.copyOfRange(numeros, 1, 4); // indices: 1 (inclusivo) a 4

System.out.println(Arrays.toString(subArrays));
		

```
### as List

```java
import java.util.Arrays;
import java.util.List;

		
String[] frutas = {"Maçã" , "Banana", "Laranja"};
// Transforma um array em uma lista
List<String> listaFrutas = Arrays.asList(frutas);
System.out.println(listaFrutas);
		

```
## Arrays List

### Array LinkedList

```java
import java.util.List;
import java.util.LinkedList;

		
List<String> frutas = new LinkedList<>();

frutas.add("Maça");
frutas.add("Banana");
frutas.add("Laranja");

System.out.println("Frutas:"  + frutas);

frutas.remove(0);

System.out.println("Frutas:"  + frutas);

frutas.add(1, "Jaca");

System.out.println("Frutas" + frutas);
		
```
## ✍️ String

### Equals Ignore Case

```java
import java.util.Scanner;

Scanner scan = new Scanner(System.in);

System.out.print("Digite F-Feminino ou M-Masculino:");
String genero = scan.next();


// Para comparação de String, não se usa o comparador de igualdade(==)
// A classe String tem o seu prório método para fazer a comparação

if (genero.equalsIgnoreCase("f")) {
	System.out.println(genero + "-feminino");
} else if (genero.equalsIgnoreCase("m")) {
	System.out.println(genero + "-masculino");	
} else {
	System.out.println("Você digitou algo diferente do solicitado.");
}
			
scan.close();
		

```
### String Builder

Em Java, a classe StringBuilder é utilizada para criar e manipular sequências de caracteres de forma eficiente. Diferente da classe String, que é imutável (ou seja, uma vez criada, seu valor não pode ser alterado), a classe StringBuilder permite que os valores sejam modificados sem a criação de novos objetos na memória.

Métodos úteis

* `append`: Adiciona dados ao final da sequência.
* `insert`: Insere dados em uma posição específica.
* `delete`: Remove caracteres em um intervalo.
* `replace`: Substitui parte do conteúdo por outro.
* `reverse`: Inverte a sequência de caracteres.
* `toString`: Converte o conteúdo de volta para um objeto `String`.

```java
        
StringBuilder sb = new StringBuilder();

sb.append("Olá");
sb.append(" ");
sb.append("Mundo");
sb.append("!");

// Converte o conteúdo de volta para um objeto String
String resultado = sb.toString();
System.out.println(resultado); // Saída: Olá Mundo!
    
```

```java
        
StringBuilder sb = new StringBuilder("Olá");
        
// Adicionando texto
sb.append(", Mundo!");
System.out.println(sb); // Saída: Olá, Mundo!

// Inserindo texto
sb.insert(4, " querido");
System.out.println(sb); // Saída: Olá querido, Mundo!

// Substituindo texto
sb.replace(4, 12, "caro");
System.out.println(sb); // Saída: Olá caro, Mundo!

// Removendo texto
sb.delete(4, 9);
System.out.println(sb); // Saída: Olá, Mundo!

// Revertendo texto
sb.reverse();
System.out.println(sb); // Saída: !odnuM ,álO
```
## List 

### ArrayList
		

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

Scanner scan = new Scanner(System.in);

//Cria uma lista de inteiros
List<Integer> numeros = new ArrayList<>();

System.out.print("Digite um número:");
numeros.add(scan.nextInt());

// pega o valor da posição determinada
System.out.println("Número digitado:" + numeros.get(0));

scan.close();
		

```

## List
		
### Múltiplos Catch

```java
int[] numeros = {4,8,16,32,64,128};
int[] demon = {2,0,4,8,0};
				
for (int i = 0; i < numeros.length;  i++) {
	try {
		System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
	} catch (ArithmeticException e1) {
		System.out.println("Erro ao dividir por zero.");
	} catch (ArrayIndexOutOfBoundsException e2) {
		System.out.println("Posição do array inválida.");
	}
}
```

### Múltiplos Catch Genérico

```java
int[] numeros = {4,8,16,32,64,128};
int[] demon = {2,0,4,8,0};
				
for (int i = 0; i < numeros.length;  i++) {
	try {
		System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
	} catch (ArithmeticException e1) {
		System.out.println("Erro ao dividir por zero.");
	} catch (Throwable e2) {
	// Throwable é uma super classe de exceção
	// sempre as classes de exceção específicas primeiro e depois as classes genéricas
		System.out.println("Ocorreu um erro.");
	}
}	
```