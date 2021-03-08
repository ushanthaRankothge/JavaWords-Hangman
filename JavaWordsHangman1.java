/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UshanthaR
 */
import java.util.*;

public class JavaWordsHangman1 {

Scanner scan = new Scanner(System.in);
String word; 
int score;

//display char space for length of the word
protected void displayWord (String word)
{
  for (int i = 1 ; i <= word.length(); i++)  
  {
       System.out.print ("_" + " ");
  }
}

protected int guessWord(String word)
{
    System.out.println("Guess the word.");
    String guessWord = scan.next();
    if (word.equals(guessWord))
    { 
        System.out.println("word is corect");
         score++;
    }
    else 
    {
      System.out.println("correct word is :" + word);
    }
    return score;
}

protected void gameOver()
{
System.out.println("press 0 to exit game or 1 go to next");
int exit = scan.nextInt();
if (exit == 0)  
{
    System.exit(0);
    getScore();
}
}

protected void printScore()
{
    System.out.println("Score is : " + score);
}

protected void getScore()
{
    
   if ( score == 8 )
   {
   System.out.println("WON HANGMAN");
   System.out.println("  ******** ");
   System.out.println("  *      * ");
   System.out.println("  * *  * * ");
   System.out.println("  * **** * ");
   System.out.println("  ******** ");
   
   }
   else 
       
   {
   System.out.println("LOST HANGMAN");
   System.out.println("      ******* ");
   System.out.println("      *     * ");
   System.out.println("      *     * ");
   System.out.println("  ********  * ");
   System.out.println("  *      *  * ");
   System.out.println("  *      *  * ");
   System.out.println("  * **** *  * ");
   System.out.println("  * *  * *    ");
   System.out.println("  ********    ");
   }
}

}

