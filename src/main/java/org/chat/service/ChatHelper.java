package org.chat.service;

import org.chat.dto.StudyPlan;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

public class ChatHelper {

    public static String getResponse(String input) {
        String apiKey = System.getenv("OPENROUTER_API_KEY");
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException(
                "OPENROUTER_API_KEY is missing. Set it in IntelliJ Settings > Build, Execution, Deployment > "
                    + "Build Tools > Maven > Runner > Environment variables, then run again.");
        }

        ChatModel chatModel = OpenAiChatModel.builder()
            .baseUrl("https://openrouter.ai/api/v1")
            .apiKey(apiKey)
            .modelName("openai/gpt-4o-mini")
            .temperature(0.7)
            .build();
//        AiMessage aiMessage = AiMessage.from("Name is Durgesh!!");
//        UserMessage userInputMessage = UserMessage.from(input);
//        ChatResponse chatResponse = chatModel.chat(aiMessage, userInputMessage);
        //return chatResponse.aiMessage().text();

//        UserMessage userMessage = UserMessage.from(
//            TextContent.from(input),
//            ImageContent.from("https://upload.wikimedia.org/wikipedia/commons/3/3e/The_cricket_legend_Sachin_Tendulkar_at_the_Oval_Maidan_in_Mumbai_During_the_Duke_and_Duchess_of_Cambridge_Visit%2826271019082%29.jpg?utm_source=commons.wikimedia.org&utm_campaign=index&utm_content=original")
//        );
//        ChatResponse chatResponse = chatModel.chat(userMessage);
//        return chatResponse.aiMessage().text();

//        UserMessage userMessage = UserMessage.from(
//            TextContent.from(input),
//            ImageContent.from("https://upload.wikimedia.org/wikipedia/commons/3/3e/The_cricket_legend_Sachin_Tendulkar_at_the_Oval_Maidan_in_Mumbai_During_the_Duke_and_Duchess_of_Cambridge_Visit%2826271019082%29.jpg?utm_source=commons.wikimedia.org&utm_campaign=index&utm_content=original")
//        );
//        ChatResponse response = chatModel.chat(userMessage);
//        IO.println(response.finishReason().name());
//        IO.println(response.tokenUsage());
//
//        return response.aiMessage().text();



//        byte[] imageBytes = readBytes("/home/me/cat.jpg");
//        String base64Data = Base64.getEncoder().encodeToString(imageBytes);
//        ImageContent imageContent = ImageContent.from(base64Data, "image/jpg");
//        UserMessage userMessage = UserMessage.from(imageContent);

//        CompletableFuture<ChatResponse> future = chatModel.chatAsync(userMessage);
//        return future.toString();

        //        BotAssistant assistant = AiServices.builder(BotAssistant.class)
//            .chatModel(chatModel)
//            .systemMessageProvider(chatMemoryId -> "You are a good friend of mine. Answer using slang.")
//            .build();
//        return assistant.chat(input);

        BotAssistant assistant = AiServices.create(BotAssistant.class, chatModel);
        return assistant.chatWithBot(input);

    }


    public static StudyPlan getResponseFromStudyPlanner(String topic) {
        String apiKey = System.getenv("OPENROUTER_API_KEY");
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException(
                "OPENROUTER_API_KEY is missing. Set it in IntelliJ Settings > Build, Execution, Deployment > "
                    + "Build Tools > Maven > Runner > Environment variables, then run again.");
        }

        ChatModel chatModel = OpenAiChatModel.builder()
            .baseUrl("https://openrouter.ai/api/v1")
            .apiKey(apiKey)
            .modelName("openai/gpt-4o-mini")
            .temperature(0.7)
            .build();
        StudyPlannerAssistant assistant = AiServices.create(StudyPlannerAssistant.class, chatModel);
        return assistant.getStudyPlan(topic);
    }

}
