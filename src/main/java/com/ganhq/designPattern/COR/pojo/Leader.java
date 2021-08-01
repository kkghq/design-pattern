package com.ganhq.designPattern.COR.pojo;

/**
 * 领导类（抽象）
 */
public abstract class Leader {
    // 下个一处理者
    private Leader next;
    public void setNext(Leader next) {
        this.next = next;
    }
    public Leader getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);
}

