package org.chat;

import org.chat.dto.DayPlan;
import org.chat.dto.StudyPlan;
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
        IO.println("Press 1 : to create a study plan");
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
            if (readIn.trim().equals("1")) {
                IO.println("Enter the Topic ");
                String topic = IO.readln();
                StudyPlan response = ChatHelper.getResponseFromStudyPlanner(topic);
                IO.println("StudyPlan planContent : " + response.planContent());
                IO.println("StudyPlan planTitle : " + response.planTitle());
                IO.println("StudyPlan numberOfDay : " + response.numberOfDay());
                IO.println("StudyPlan hoursPerDay : " + response.hoursPerDay());
                IO.println("Day Plans : ");
                for (DayPlan dayPlan : response.dayPlans()) {
                    IO.println("Day Plans DayNumber: " + dayPlan.dayNumber());
                    IO.println("Day Plans title: " + dayPlan.title());
                    IO.println("Day Plans content: " + dayPlan.content());
                    IO.println("Day Plans practiceQuestions: " + dayPlan.practiceQuestions());
                    IO.println("+++++++++++++++++++++++++++");
                }
//                IO.println("ChatBot : " + response);
                continue;
            }
            // llm call krna pdega
            String response = ChatHelper.getResponse(readIn);
            IO.println("ChatBot : " + response);
        }

    }
}
