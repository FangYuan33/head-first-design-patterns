package com.fy.patterns.design.chapter15;

/**
 * 通用的处理节点
 * 将调用链的处理节点可以封装成一条链表
 *
 * @author FangYuan
 * @since 2022-11-30 20:30:39
 */
public abstract class AbstractHandler {

    /**
     * 每个节点中持有下一个节点的引用
     */
    private AbstractHandler nextHandler = null;

    /**
     * 继续向下执行
     */
    protected Object doChainProcess(String param) throws Throwable {
        if (getNextHandler() == null) {
            return param + " 执行业务逻辑";
        } else {
            return this.nextHandler.handler(param);
        }
    }

    /**
     * 各个不同的节点实现自己的不同的处理逻辑
     *
     * @param param 请求参数
     */
    public abstract Object handler(String param) throws Throwable;

    /**
     * 获取下一个责任链节点
     */
    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    /**
     * 指定下一个节点
     */
    public AbstractHandler setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }
}
