package com.xuzhang.selfvalidation.service;

import com.xuzhang.selfvalidation.Model.Person;

/**
 * Created by Robert 2020/2/5
 */
public interface PersonService {
   void savePerson(Person person);
   boolean checkPersonNameIsMe(String personName);
}
