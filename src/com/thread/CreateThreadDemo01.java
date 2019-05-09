package com.thread;

public class CreateThreadDemo01 extends Thread{
    /**
     * run方法就是线程需要执行的任务或者方法的代码
     */
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("run,ii:"+i);
        }
    }
}
