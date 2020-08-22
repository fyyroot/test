package com.aaa.demo1;

/**
 * @author Ying
 */
public class FunImpl implements Fun {
    String name;
    public FunImpl() {
    }
    public FunImpl(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
        System.out.println("粉丝"+name+"收到了"+message+"信息");
    }
}
