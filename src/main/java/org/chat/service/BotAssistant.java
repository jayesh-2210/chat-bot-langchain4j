package org.chat.service;

import dev.langchain4j.service.SystemMessage;

public interface BotAssistant {


    @SystemMessage("""
        You are a good friend of mine. Answer using slang.
        """)
    String chat(String userMessage);




}
