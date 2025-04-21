package com.javase.enum_test;

public enum State {
    //State WEIFUKUAN = new State()
    WEIFUKUAN("未付款"),
    //State YIFUKUAN = new State()
    YIFUKUAN("已付款"),
    //State WEIFAHUO = new State()
    WEIFAHUO("未发货"),
    //State YIFAHUO = new State()
    YIFAHUO("已发货");

    private String name;

    private State() {

    }

    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
