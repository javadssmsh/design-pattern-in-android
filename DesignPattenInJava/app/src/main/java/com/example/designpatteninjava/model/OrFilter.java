package com.example.designpatteninjava.model;

import java.util.List;

public class OrFilter implements Filter {
    private Filter filter;
    private Filter anotherFilter;

    public OrFilter(Filter filter, Filter anotherFilter){
        this.filter = filter;
        this.anotherFilter = anotherFilter;
    }

    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> firstFilterResult = filter.meetFilter(purses);
        List<Purse> otherFilterResult = anotherFilter.meetFilter(purses);

        for(Purse purse : otherFilterResult){
            if(!firstFilterResult.contains(purse)){
                firstFilterResult.add(purse);
            }
        }
        return firstFilterResult;
    }
}
