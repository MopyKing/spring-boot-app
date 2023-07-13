package com.mper.WebController;

import com.mper.Service.LogService;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class H2 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private LogService logService;
    private static final Logger LOG = Logger.getLogger(H2.class.getName());


    @EventListener
    public void seed(ContextRefreshedEvent event) {

        seedLogsTable();
    }

    private void seedLogsTable() {
        logService.save("No Route", "Database Init");
        LOG.info("Logs Seeded");
    }
    //
}