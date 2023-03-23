
import java.util.Scanner;
import java.io.IOException; /* Para poder efetuar a leitura de um caractere, delimitado entre aspas simples, 
deve-se utilizar o método "read" do pacote de classes System.in */

public class Main {
  static float altura;
  static float sexo;
  
  public static void main (String[]args) throws IOException { /* Precisa declarar throws IOException */
    System.out.println("Conjunto de dados, informe abaixo:");	/* Mensagem de Inicio */
    Scanner ler = new Scanner (System.in);
    float mulher=0, homem=0;
    float alturaHomem=0, alturaMulher=0;
    float maior=0, menor=500;
    char resposta;
    
    do{ /* Inicio do do-while */
    	System.out.printf ("Altura: ");
    	altura = ler.nextFloat ();
    	
    	do { /* Início do do-while */
    	    System.out.printf ("Sexo - Masculino (0) / Feminino (1): ");
    	    sexo = ler.nextFloat ();
    	    
    	    /* Inicio do if-else --> Homem ou mulher */
    	    if(sexo == 1) 
    	        mulher = mulher +1;
    	    else
    	        homem = homem +1; 
    	    /* Fim do if-else */
    	    
    	    /* Inicio do if-else --> Altura */
    	    if(sexo == 0 )
    	        alturaHomem = altura +1;
    	    else 
    	        alturaMulher = altura+1;
    	   /* Fim do if-else */
    	   
    	   /* Inicio do if-else --> Maior e menor altura */
    	   if(altura > maior)
    	       maior = altura;
    	   if(altura < menor)
    	       menor = altura;
    	   /* Fim do if-else */
 
    	  } while (sexo != 0 && sexo != 1);	/* Fim do do-while */
        
        /* Para encerrar o programa */
    	System.out.printf("Deseja encerrar o programa? (S/N) ");
    	resposta = (char)System.in.read();
    	
    	System.out.printf("\n"); /* Pula linha */
      } while (resposta != 'S'); /* Fim do do-while */
     
     System.out.printf("Número de mulheres: %.0f", mulher); /* Mostra o total de mulheres */
     System.out.printf("\nNúmero de homens: %.0f", homem); /* Mostra o total de homens */
     System.out.printf("\nMédia da altura dos homens: %.1f", alturaHomem/homem); /* Media da altura dos homens */
     System.out.printf("\nA maior altura é %.0f m e menor altura é %.0f m.", maior, menor);
  } 
}
