package com.JavaLearning.SampleProject;
import java.util.*;
/**
 * Hello world!
 *
 */

import com.JavaLearning.SampleProject.Exceptions.InvalidInputException;

public interface ProductApplication {
    /**
     * Should it be 1 product / or more than product
     * @param str null|valid values  code, name, category
     * @return array of product names if found else null
     * @exception  InvalidInputException is returned when you dont have a valid input
     */
    String[] findProductBy(String str) throws InvalidInputException;
}

