package com.company;

public class Array {
    private int[] data;
    private int size;
    //构造器初始化数组
    public Array(int capacity){
        data=new int[capacity];
        size=0;
    }
    //用户不传参则构造默认数组
    public Array(){
        this(10);
        size=0;
    }
//    获取数组实际大小
    public int getSize(){
        return size;
    }
    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    //是否为空
    public boolean isEmpty(){
        return size==0;
    }

}
