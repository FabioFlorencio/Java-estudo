# 📋 Tabela de revisão rápida ⚡

Aqui está uma tabela de revisão sobre as principais sintaxes em Java.


- [📋 Tabela de revisão rápida ⚡](#-tabela-de-revisão-rápida-)
  - [🎲 Tipos de dados](#-tipos-de-dados)
  - [Format](#-format)
	  - [printf](#-printf)
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
  
  
  
# Tabela de revisão rápida
  
## 🎲 Tipos de dados
  
## Format

### printf

```java

import java.util.Locale;

public class Format {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Exemplo de print formatado
		//%n -> quebra de linha		
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);		
		System.out.printf("%.4f%n", x);
	}
}

```

```java

public class Format {

	public static void main(String[] args) {
		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
	}
}
```

## 🔒 Arrays

### Sort

```java
import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		int[] num = {9,5,0,7,4,2,6,3,1,8};
		
		// faz a ordenação do array
		Arrays.sort(num);
		
		for(int n: num) {
			System.out.printf("%d - ", n);
		}	
	}
}
```
### Fill

```java
import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		int[] num = {9,5,0,7,4,2,6,3,1,8};
		int[] num2 = new int[10];
		
		// preenche o array com o número 10
		Arrays.fill(num2,10);
				
		for(int n: num2) {
			System.out.printf("%d - ", n);
		}	
	}
}
```
### Copy

```java
public class Array02 {

public static void main(String[] args) {
		
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
	}
}
```
### Equals

```java
import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {

		int[] num1 = {0,1,2,3,4,5,6,7,8,9};
		int[] num2 = {0,1,2,3,4,5,6,7,8,9};
		int[] num3 = {9,8,7,6,5,4,3,2,1,0};
		int[] num4 = {10,4,7,23,4,10,8,0,4,9};
		
		System.out.printf("num1 igual num2: %s%n", Arrays.equals(num1, num2));
		System.out.printf("num1 igual num3: %s%n", Arrays.equals(num1, num3));
		System.out.printf("num3 igual num4: %s%n", Arrays.equals(num3, num4));
		
	}
}

```
### Binary Search

```java
import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {

		
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
		
	}
}

```

### to String

```java
import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		
		int[] numeros = {1,2,3,4};
		
		//Converte um array de inteiros em string para exibição.
		System.out.println(Arrays.toString(numeros));		
	}
}

```
### copy Of

```java
import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		
		
		int[] numeros = {1,2,3};
		// Copia os elementos de um array para um novo array
		int[] copia = Arrays.copyOf(numeros, 5);
		
		System.out.println(Arrays.toString(copia));
		
		for (int c: copia) {
			System.out.println(c);
		}
	}
}

```
### copy Of Range

```java
import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {

		int[] numeros = {1,2,3,4,5};
		int[] subArrays = Arrays.copyOfRange(numeros, 1, 4); // indices: 1 (inclusivo) a 4
		
		System.out.println(Arrays.toString(subArrays));
		
	}
}

```
### as List

```java
import java.util.Arrays;
import java.util.List;

public class Array08 {

	public static void main(String[] args) {
		
		String[] frutas = {"Maçã" , "Banana", "Laranja"};
		// Transforma um array em uma lista
		List<String> listaFrutas = Arrays.asList(frutas);
		System.out.println(listaFrutas);
		
	}
}


```
## Arrays List

### Array LinkedList

```java
import java.util.List;
import java.util.LinkedList;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> frutas = new LinkedList<>();
		
		frutas.add("Maça");
		frutas.add("Banana");
		frutas.add("Laranja");
		
		System.out.println("Frutas:"  + frutas);
		
		frutas.remove(0);
		
		System.out.println("Frutas:"  + frutas);
		
		frutas.add(1, "Jaca");
		
		System.out.println("Frutas" + frutas);
		
	}
}

```