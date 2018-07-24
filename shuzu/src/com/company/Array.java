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
    //在数组末尾添加元素
    public void addAtLast(int e){
             addAtMiddle(size,e);                                                                                       /*
                                                                                                    if(size==data.length){
             原始逻辑在右侧                                                                                           throw new IllegalArgumentException("数组已满，无法插入");
                                                                                                    }
                                                                                                    data[size]=e;
                                                                                                    size++;
                                                                                                    */
    }
    public void addAtFirst(int e){
        addAtMiddle(0,e);
    }
    //在数组的数据中间插入一个元素
    public void addAtMiddle(int index,int e){
        if(size==data.length){
            throw new IllegalArgumentException("数组满，无法插入");
        }
        if (index<0||index>size)
            throw new IllegalArgumentException("index参数错误，无法插入");
        //方法1
        int l=size;
        while (index<l){
            data[l]=data[l-1];
            l--;
        }
        data[index]=e;
        size++;                                                  /*
                                                            方法二
                                                            for(int i=size;i>index;i--){
                                                                data[size]=data[size-1];

                                                            }
                                                            */


        }
        //是否包含一个元素
        public boolean contains(int e){
            for (int i=0;i<size;i++){
                if(data[i]==e)
                    return true;
            }
            return false;
        }
        //查找一个元素
    public int findElement(int e){
        for (int i=0;i<size;i++){
            if(data[i]==e)
                return i;
        }
        return -1;
    }
    //删除一个元素
    public int deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引不合法");
        }
        int result=data[index];
        for (int i=index+1;i<=size-1;i++){
            data[i-1]=data[i];
        }
        size--;
        return result;
    }
    public void deleteByElement(int e){
       int local=findElement(e);
       if (local==-1){
           throw new IllegalArgumentException("删除的元素不存在！");
       }
       for (int i=local+1;i<=size-1;i++){
           data[i-1]=data[i];
       }
       size--;
    }
    @Override
    public String toString(){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<size;i++){
            result.append(data[i]);
            if (i!=size-1)
            result.append(',');
        }
        return "数组大小："+size+"     元素为"+result;
    }
}
