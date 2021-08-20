package sololearnjava;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
    
    System.out.println("Guess my favourite drink.");
    
    Scanner myScanner = new Scanner(System.in);
    String drink = myScanner.nextLine();
    
    String favouriteDrink = switch(drink) {
        case "water", "juice", "coffee" -> "You are right, it is my favourite drink!";
        case "cola", "fanta", "limonade", "milk" -> "One can drink it, but it is not my favourite drink.";
        case "beer", "vine" -> "You are wrong. I hate to drink this.";
        default -> "I don't know this drink.";
        };
        
    System.out.println(favouriteDrink);
    }
}
