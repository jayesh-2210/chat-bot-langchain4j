package org.chat.service;

import org.chat.dto.StudyPlan;

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
    StudyPlan getStudyPlan(@V("topic") String topic);


}
