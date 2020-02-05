package com.xuzhang.selfvalidation.Model;

import com.xuzhang.selfvalidation.util.Constant;
import com.xuzhang.selfvalidation.validation.PersonNameNotMe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * Created by Robert 2020/2/5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = Constant.PERSON_NAME_CAN_T_BE_BLANK)
    @PersonNameNotMe(message = Constant.PERSON_NAME_IS_NOT_ME)
    private String name;
    private int age;
    @NotBlank(message = Constant.PERSON_JOB_CAN_T_BE_EMPTY)
    private String job;
}
