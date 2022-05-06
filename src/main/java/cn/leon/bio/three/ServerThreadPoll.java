package cn.leon.bio.three;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Leon
 * @create 2022-05-06 20:47
 * IntelliJ IDEA
 * cn.leon.bio.three
 */
public class ServerThreadPoll {

//1. 创建一个线程池的成员变量用于于存储一个线程池对象
    private ExecutorService executorService;

//2.创建这个类的的对象的时候就需要初始化线程池对象
    public ServerThreadPoll (int maxThread,int queueSize){
        executorService = new ThreadPoolExecutor(3,maxThread,120, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(queueSize));
    }

    //3.提供一个方法来提交任务给线程池的任务队列来暂存，等待线程池来处理
    public void execute(Runnable runnable){
        executorService.execute(runnable);
    }

}

