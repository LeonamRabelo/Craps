package craps;
import java.util.*; //Random
/**
 *
 * @author Lion
 */
public class Craps {
    public static void main(String[] args) {
      
      Random rand = new Random();
      int dado1 = rand.nextInt(6) + 1;
      int dado2 = rand.nextInt(6) + 1;
      int ponto = dado1 + dado2;
      
      System.out.println("Dado 1: " + dado1);
      System.out.println("Dado 2: " + dado2);
      System.out.println("A soma dos dados foi: " + ponto);
      
      if(ponto==7||ponto==11){
          System.out.println("Venceu!");
      }
      if(ponto==2||ponto==3||ponto==12){
          System.out.println("Vc perdeu!");
      }
      if(ponto==4||ponto==5||ponto==6||ponto==8||ponto==9||ponto==10){
          System.out.println("\nIniciando o estágio 2");
          int soma = 0, ijogadas = 1;
            while(soma!=7||soma==ponto){
                dado1 = rand.nextInt(6) + 1;
                dado2 = rand.nextInt(6) + 1;
                soma = dado1 + dado2;
                      System.out.println("Dado 1: " + dado1);
                      System.out.println("Dado 2: " + dado2);
                      System.out.println("Jogada " + ijogadas + " foi: " + soma);
                      ijogadas++;
            if(soma==7){
            System.out.print("Vc perdeu!");
            }
            if(soma==ponto){
            System.out.print("Vc ganhou!");
            break;
            }
            }
      }
      
      }
}
