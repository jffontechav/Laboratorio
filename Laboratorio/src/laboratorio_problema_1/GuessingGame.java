/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_problema_1;
/**
 *
 * @author Juan Felipe Fontecha Vasquez
 * @since 25-08-2016
 * @version 1.0
 */
public class GuessingGame {
        
    static void GuessingGame(){
        java.util.Scanner teclado=new java.util.Scanner(System.in);
        int answer= (int) Math.floor((Math.random()*100)+1);
        int guess=0;
        int numGuesses;
        for (numGuesses=1; !(numGuesses>7||(guess==answer)); numGuesses++) {
            System.out.print("Guess a number. ");
            guess= teclado.nextInt();
            if (guess<answer) {
                System.out.println("Higher...");
            }else{
                if (guess>answer) {
                    System.out.println("Lower...");
                }else{
                    System.out.println("You Win");
                    //aca coloque el break porque en el diagrama original despues del estado de victoria todavia continuaba la funcion.
                    break;
                }
            }
        }
        if (numGuesses>7) {
            System.out.println("You Lose");
        }
    }
     public static void main(String[] args) {
         //aca repeti el Scanner porque la funcion me ponia problema si lo colocaba en la clase y no en la funcion
         java.util.Scanner teclado2=new java.util.Scanner(System.in);
         //si se quiere se puede cambiar el while por un do-while para mejorar la ejecucion pero aca lo dejo lo mas cercano al diagrama como me es posible.
         String playAgain = "y";
         while("y".equals(playAgain)){
             GuessingGame();
             System.out.println("Would you like to play another game? (y/n): ");
             playAgain = teclado2.next();
         }
     }
}
