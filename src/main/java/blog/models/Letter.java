package blog.models;

import java.time.LocalDate;


public class Letter {

    private long id;
    private LocalDate date;
    private String title;
    private String text;

    public Letter(long id, LocalDate date, String title, String text) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.text = text;
    }



}
