# 📋 Tabela de revisão rápida ⚡

Aqui está uma tabela de revisão sobre as principais sintaxes em Java.


- [📋 Tabela de revisão rápida ⚡](#-tabela-de-revisão-rápida-)
  - [🎲 Tipos de dados](#-tipos-de-dados)
  - [Format](#-format)
	  - [printf](#-printf)
  
  
  
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