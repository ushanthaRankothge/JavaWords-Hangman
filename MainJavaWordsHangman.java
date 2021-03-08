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

public class MainJavaWordsHangman 
{
    public static void main(String[] args)
    {
        //Scanner scan = new Scanner(System.in);
        JavaWordsHangman1 game = new JavaWordsHangman1();
        System.out.println("JAVAWORDS HANGMAN");
        
        String word = "multithreading";
        System.out.println("CLUE : Named for many threading");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
        
        
        word = "arrayList";
        System.out.println("CLUE : list of items in array ");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
        
        word = "hashTable";
        System.out.println("CLUE : organized table by value and keyword ");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
        
        word = "null";
        System.out.println("CLUE : what do you call when no value ");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
        
        word = "toString";
        System.out.println("CLUE : change the datatype to a string for print ");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
   
        word = "super";
        System.out.println("CLUE : parent class keyword ");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
        
        word = "abstract";
        System.out.println("CLUE : similar to interface, but, allow to have defined methods");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
        
        word = "pointer";
        System.out.println("CLUE : helps to point to objects");
        game.displayWord(word);
        game.guessWord(word);
        game.gameOver();
        game.printScore();
   
        game.getScore();
        System.out.println("Good Bye");
   
    }
}

