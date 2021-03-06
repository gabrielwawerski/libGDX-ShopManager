package com.gpteam.shopmanager.game.engine.modules.logger;

import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;

import java.util.ArrayList;

/*
 * Created by masmix on 14.02.2017.
 */
public class Logger {
    // One universal way of sending and receiving packed strings
    // =========================================================
    // Both sending and receiving of packed strings that contain
    // messages important for the logger must be handled
    // with regular arrays.
    // TODO different types of logs: warning,
    
    private Logger() {
        ErrorHandler.handleUnsupportedOperationException("msg");
    }

    private Logger instance = null;
    private ArrayList<Log> logs = new ArrayList<Log>();
    private int index = 0;
    private int length = 0;

    public Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public void sendLog(Log log) {
        length++;
        logs.add(log);
    }

    private Log getNextLog() { // TODO make this method better
        if (index < length)
            return logs.get(index++);
        else
            return null;
    }

    private ArrayList<Log> getAllLogs() {
        return logs;
    }
}