package red.mohist.common.async.thread;

import red.mohist.common.async.Async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MohistThreadBox {

    public static final ScheduledExecutorService METRICS = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Metrics"));

    public static final ExecutorService ASYNCCHAT = Executors.newCachedThreadPool(new NamedThreadFactory("Async Chat Thread"));

    public static final ExecutorService FILEIO = Executors.newFixedThreadPool(2, new NamedThreadFactory("Mohist File IO Thread"));

    public static final ExecutorService ASYNCEXECUTOR = Executors.newSingleThreadExecutor(new NamedThreadFactory("Mohist Async Task Handler Thread"));

    public static final ExecutorService TCW = Executors.newSingleThreadExecutor(new NamedThreadFactory("TerminalConsoleWriter"));

    public static final ExecutorService Head = Executors.newFixedThreadPool(3, new NamedThreadFactory("Head Conversion Thread"));


    //ASYNC EDITION
    @Async
    public static final ExecutorService NMS_ENTITY_MOVE = Executors.newFixedThreadPool(4, new NamedThreadFactory("Nms Entity Async Thread"));

    @Async
    public static final ExecutorService MODDED_ENTITY_MOVE = Executors.newFixedThreadPool(4, new NamedThreadFactory("Modded Entity Async Thread"));


    public static final ExecutorService WORLDS_TICKING = Executors.newFixedThreadPool(10, new NamedThreadFactory("World tick handler"));

    public static class AssignableThread extends Thread {
        public AssignableThread(Runnable run) {
            super(run);
        }

        public AssignableThread() {
            super();
        }
    }
}
