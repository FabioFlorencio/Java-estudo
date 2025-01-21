# 📋 Tabela de revisão rápida ⚡

Aqui está uma tabela de revisão sobre as principais sintaxes em Java.


- [📋 Tabela de revisão rápida ⚡](#-tabela-de-revisão-rápida-)
  - [🎲 Tipos de dados](#-tipos-de-dados)
  - [Format](#-format)
	  - [printf](#-printf)
  - [📦 Arrays](#-arrays)
	  - [sort](#-sort)
	  - [fill](#-fill)
	  - [arraycopy](#-arraycopy)
  
  
  
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

## 📦 Arrays

### sort

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
### Arraycopy

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