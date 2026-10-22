package org.chat.dto;

import java.util.List;

import dev.langchain4j.model.output.structured.Description;

public record StudyPlan(

    String planContent,
    @Description("Title of the study plan")
    String planTitle,
    @Description("Number of days in the study plan")
    Integer numberOfDay,
    Integer hoursPerDay,
    List<DayPlan> dayPlans
) {

}
