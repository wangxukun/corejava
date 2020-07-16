package com.xk.corejava;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger myLogger = Logger.getLogger("com.xk.corejava");

    public static void main(String[] args) {
        myLogger.log(Level.SEVERE,"严重级别日志");
        myLogger.log(Level.WARNING,"警告级别日志");
        myLogger.log(Level.INFO,"信息级别日志");
        myLogger.log(Level.CONFIG,"配置级别日志");

        myLogger.setLevel(Level.FINE);
        myLogger.log(Level.FINE,"好级别日志");
        myLogger.log(Level.FINER,"更好级别日志");
        myLogger.log(Level.FINEST,"最好级别日志");
    }
}
