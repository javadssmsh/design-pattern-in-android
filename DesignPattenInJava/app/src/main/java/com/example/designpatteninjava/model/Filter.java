package com.example.designpatteninjava.model;

import java.util.List;

public interface Filter {

    List<Purse> meetFilter(List<Purse> purses);
}
