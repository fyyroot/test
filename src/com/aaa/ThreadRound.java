package com.aaa;

/**
 * @author Ying
 */
public class ThreadRound {


    public static void main(String[] args) {
        final Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        });
        final Thread t2=new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2");
            }
        });
        final Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3");
            }
        });

        t3.start();
        t2.start();
        t1.start();


    }


   /* private volatile static  ThreadRound threadRound=null;
    private ThreadRound(){}

    public static   ThreadRound threadRound(){

        if (threadRound==null){
          synchronized (ThreadRound.class){
              if (threadRound==null){
                   threadRound=new ThreadRound();
              }
          }
        }

        return threadRound;
    }*/

    private static final ThreadRound threadRound=new ThreadRound();
    private   ThreadRound(){

    }
    public static ThreadRound getInstance(){



        return threadRound;
    }





}
