package com.mper.WebController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mper.Model.Log;
import com.mper.Service.LogService;

@RestController
public class LogsController {
    //auto wired the LogService class
    @Autowired
    LogService logService;

    @GetMapping("")
    public String index() {
        logService.save("/");
        return "Mper Devops Home Page";
    }

    //creating a get mapping that retrieves all the Logs detail from the database
    @GetMapping("/logs")
    private List<Log> getAllLog() {
        logService.save("/logs");
        return logService.getAllLog();
    }

    @GetMapping("/transaction")
    private String transaction() {
        logService.save("/transaction");
        return "New transaction have been made!";
    }
}
