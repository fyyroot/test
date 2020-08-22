package com.aaa.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ying
 */
public class StartImpl implements Start{
    private  String name;
    public  StartImpl(){}
    public StartImpl(String name) {
        this.name = name;
    }
    private List<Fun>funList=new ArrayList<>();


    @Override
    public void addFans(Fun fun) {
        funList.add(fun);
    }

    @Override
    public void delFun(Fun fun) {
        if(funList.contains(fun)){
            funList.remove(fun);
        }
    }

    @Override
    public void update(String update) {
        for(Fun list:funList){
            list.update(update);
        }
    }
}
