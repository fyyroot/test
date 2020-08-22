package com.aaa.demo1;

/**
 * @author Ying
 */
public class TestDemo1 {
    public static void main(String[] args) {
        Fun fun=new FunImpl("frr");
        Fun fun1=new FunImpl("faa");
        Fun fun2=new FunImpl("fbb");
        Fun fun3=new FunImpl("fcc");
        Start start=new StartImpl("woziji");

        start.addFans(fun);
        start.addFans(fun1);
        start.addFans(fun2);
       // start.addFans(fun3);
        start.update("劲歌天不错");
    }
}
