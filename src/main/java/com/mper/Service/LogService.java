package com.mper.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mper.Model.Log;
import com.mper.Repository.LogRepository;

@Service
public class LogService {
    @Autowired
    LogRepository logRepository;

    //getting all Log records
    public List <Log> getAllLog() {
        List <Log> logs = new ArrayList <Log>();
        logRepository.findAll().forEach(Log -> logs.add(Log));
        return logs;
    }

    //getting a specific log
    public Log getLogById(int id) {
        return logRepository.findById(id).get();
    }

    public void save(String string) {
        Log log = new Log(string);
        logRepository.save(log);
    }

    public void save(String string, String string2) {
        Log log = new Log(string, string2);
        logRepository.save(log);
    }
}