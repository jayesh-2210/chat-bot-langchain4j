package org.chat.dto;

public record DayPlan(
    String title,
    String content,
    String practiceQuestions,
    Integer dayNumber
) {

}
