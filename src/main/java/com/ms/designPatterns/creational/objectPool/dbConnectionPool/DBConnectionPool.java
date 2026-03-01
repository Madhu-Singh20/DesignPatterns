package com.ms.designPatterns.creational.objectPool.dbConnectionPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DBConnectionPool {

    private static final int POOL_SIZE = 3;
    private static DBConnectionPool instance;

    private BlockingQueue<DBConnection> pool;

    private DBConnectionPool() {
        pool = new ArrayBlockingQueue<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            pool.add(new DBConnection());
        }
    }

    // Thread-safe Singleton (Double-Checked Locking)
    public static DBConnectionPool getInstance() {
        if (instance == null) {
            synchronized (DBConnectionPool.class) {
                if (instance == null) {
                    instance = new DBConnectionPool();
                }
            }
        }
        return instance;
    }

    // Acquire object (blocks if none available)
    public DBConnection borrowObject() throws InterruptedException {
        return pool.take();   // waits if empty
    }

    // Release object
    public void returnObject(DBConnection conn) {
        pool.offer(conn);
    }
}
