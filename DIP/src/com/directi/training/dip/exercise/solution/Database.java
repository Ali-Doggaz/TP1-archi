package com.directi.training.dip.exercise.solution;

import java.util.HashMap;
import java.util.Map;


public interface Database {

    static Map<Integer, String> _data = new HashMap<>();
    static int _count = 0;

    public int write(String inputString);

}
