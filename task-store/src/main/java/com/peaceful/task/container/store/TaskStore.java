package com.peaceful.task.container.store;

/**
 * @author WangJun <wangjuntytl@163.com>
 * @version 1.0 15/9/15
 * @since 1.6
 */

public class TaskStore {

    public static Queue get(){
        return FIFOQueueImpl.getInstance();
    }
}
