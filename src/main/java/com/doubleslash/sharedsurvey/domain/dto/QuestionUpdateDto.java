package com.doubleslash.sharedsurvey.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionUpdateDto {

    private Long questionId;

    private int questionCategoryId;

    private String questionText;

    private boolean required;
}
