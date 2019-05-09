package com.thread;

/**
 * 创建多线程
 */
public class ThreadDemo01 {
    /**
     * 进程就是正在运行的程序,进程是线程的集合
     * 线程就是一条执行路径,一个独立的执行单元
     * 多线程为了提高程序的效率
     * 创建线程那些方式
     * 1.使用继承Thread类方式 继承Thread类重写run方法
     * 2.实现runlable接口方式
     * 3.使用匿名内部类方式
     * 4.callable
     * 5.使用线程池创建线程
     */
    public static void main(String[] args) {
        // 1.怎么调用线程
        CreateThreadDemo01 t1 = new CreateThreadDemo01();
        // 2.启动线程 不是调用run方法 而是start
        // 3.使用多线程后,
        t1.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("main,i:"+i);
        }
    }
}
