/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class chatbot {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Chatbot: Hello! How can I assist you today?");         
        while (true) {  
            String userInput = scanner.nextLine();  
            if (userInput.equalsIgnoreCase("hello")) {  
                System.out.println("Chatbot: Hi there!");  
            } else if (userInput.equalsIgnoreCase("how are you?")) {  
                System.out.println("Chatbot: I'm good, thank you. How about you?");  
            } else if (userInput.equalsIgnoreCase("bye")) {  
                System.out.println("Chatbot: Goodbye! Have a great day!");  
                break;  
            } else {  
                System.out.println("Chatbot: Sorry, I didn't understand that.");  
            }  
        }  
        scanner.close();  
    }  
  
}
