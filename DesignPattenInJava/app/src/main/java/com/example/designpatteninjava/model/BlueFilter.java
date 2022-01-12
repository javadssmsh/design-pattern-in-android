package com.example.designpatteninjava.model;

import java.util.ArrayList;
import java.util.List;

public class BlueFilter implements Filter {

    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> bluePurses = new ArrayList<>();

        for(Purse purse : purses){
            if(purse.getColour().getClass().getName().equalsIgnoreCase("blue")){
                bluePurses.add(purse);
            }
        }

        return bluePurses;
    }
}
