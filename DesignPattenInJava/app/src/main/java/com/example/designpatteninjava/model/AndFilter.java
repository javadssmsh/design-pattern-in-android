package com.example.designpatteninjava.model;

import java.util.List;

public class AndFilter implements Filter {
    private Filter filter;
    private Filter anotherFilter;

    public AndFilter(Filter filter, Filter anotherFilter){
        this.filter = filter;
        this.anotherFilter = anotherFilter;
    }

    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> firstFilter = filter.meetFilter(purses);
        return anotherFilter.meetFilter(firstFilter);
    }
}
