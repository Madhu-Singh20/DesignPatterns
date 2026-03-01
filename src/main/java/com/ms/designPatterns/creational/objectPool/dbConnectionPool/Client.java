package com.ms.designPatterns.creational.objectPool.dbConnectionPool;

public class Client {

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                DBConnectionPool pool = DBConnectionPool.getInstance();
                DBConnection conn = pool.borrowObject();
                conn.connect();
                Thread.sleep(2000);
                pool.returnObject(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }

}
