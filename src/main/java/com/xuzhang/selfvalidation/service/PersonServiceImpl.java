package com.xuzhang.selfvalidation.service;

import com.xuzhang.selfvalidation.Model.Person;
import com.xuzhang.selfvalidation.common.Constant;
import org.springframework.stereotype.Component;

/**
 * Created by Robert 2020/2/5
 */
@Component
public class PersonServiceImpl implements PersonService {
    @Override
    public void savePerson(Person person) {
        System.out.println("save person successfully");
    }

    @Override
    public boolean checkPersonNameIsMe(String personName) {
        return Constant.ME.equals(personName);
    }
}
