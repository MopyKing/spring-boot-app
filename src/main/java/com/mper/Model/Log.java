package com.mper.Model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "Log")
public class Log {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String type_request;

    @Column
    private String routing;

    @Column
    private final String create_at;

    public Log() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.create_at =dateTime.format(formatDateTime);
        this.type_request = "GET";
        this.routing = "None";
    }

    public Log(String route) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.create_at =dateTime.format(formatDateTime);
        this.type_request = "GET";
        this.routing = route;
    }

    public Log(String route, String request) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.create_at =dateTime.format(formatDateTime);
        this.type_request = request;
        this.routing = route;
    }

    public Integer getId() {
        return this.id;
    }

    public String getType() {
        return this.type_request;
    }
    public String getRoute() {
        return this.routing;
    }
    public String getDateTime() {
        return this.create_at;
    }
}
