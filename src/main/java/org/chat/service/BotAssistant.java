package org.chat.service;

import dev.langchain4j.service.SystemMessage;

public interface BotAssistant {


//    @SystemMessage("""
//        Act as an helpful company assitant.
//        Reply in short and in hinglish,
//        Tumhara naam Ankur hai, to usihisab se conversation ko manage krna
//        """)
//    String chat(String userMessage);


    @SystemMessage(fromResource = "ai-system-prompt.txt")
    String chatWithBot(String userMessage);




}
