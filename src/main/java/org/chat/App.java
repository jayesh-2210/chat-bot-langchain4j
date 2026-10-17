package org.chat;

import org.chat.service.ChatHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*String inputValue = IO.readln("Enter your input : ");
        IO.println("You Entered: " + inputValue);*/


        IO.println("----Welcome to chatBot----");
        IO.println("Start Conversation with chatbot...");
        IO.println("""
            Press any time 'quit' to exit
            """);

        while (true) {
            String readIn = IO.readln("You : ");
            if (readIn.trim().equalsIgnoreCase("quit")) {
                IO.println("Existing ChatBot");
                IO.println("Thank You for using chatbot!");
                break;
            }
            // llm call krna pdega
            String response = ChatHelper.getResponse(readIn);
            IO.println("ChatBot : " + response);
        }

    }
}
