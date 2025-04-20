package com.javase.genercity;
//泛型接口
public interface MyList <E>{
    public boolean add(E e);
/*    1.格式:
    public interface 接口名<E>{

    }
2.什么时候确定类型:
    a.在实现类的时候还没有确定类型,只能在new实现类的时候确定类型了 ->比如 ArrayList
    b.在实现类的时候直接确定类型了 -> 比如Scanner*/
}
