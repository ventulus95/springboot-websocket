package com.example.websocket;

import org.springframework.format.datetime.DateFormatter;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Chat {
    private String name;
    private String message;
    private String time;

    public Chat(){

    }

    public Chat(String name, String message, String time) {
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("a hh시 mm분", Locale.KOREA));
    }
}
