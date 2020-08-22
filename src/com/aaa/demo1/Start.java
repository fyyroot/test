package com.aaa.demo1;

/**抽象被观察者
 * @author Ying
 */
public interface Start {


    void addFans(Fun fun);
    void delFun(Fun fun);
    void update(String update);
}
