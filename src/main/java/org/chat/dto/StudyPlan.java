package org.chat.dto;

public record StudyPlan(
    String planContent,
    String planTitle,
    Integer numberOfDay,
    Integer hoursPerDay
) {

}
