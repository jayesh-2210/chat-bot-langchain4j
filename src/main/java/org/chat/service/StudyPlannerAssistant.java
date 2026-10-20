package org.chat.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface StudyPlannerAssistant {

//    @UserMessage("""
//        you are expert in planning the study plan for a student.
//        create an useful plan for given topic
//        {{it}}
//        """)
//    String getStudyPlan(String topic);

    @UserMessage("""
        you are expert in planning the study plan for a student.
        create an useful plan for given topic
        {{topic}}
        """)
    String getStudyPlan(@V("topic") String topic);


}
