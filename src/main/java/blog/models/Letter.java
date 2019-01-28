package blog.models;

import java.time.LocalDate;


public class Letter {

    private long idLetter;
    private LocalDate date;
    private String title;
    private String text;
    private boolean pin;

    public Letter(long idLetter, LocalDate date, String title, String text) {
        this.idLetter = idLetter;
        this.date = date;
        this.title = title;
        this.text = text;
    }

    public long getIdLetter() {
        return idLetter;
    }

    public void setIdLetter(long idLetter) {
        this.idLetter = idLetter;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isPin() {
        return pin;
    }

    public void setPin(boolean pin) {
        this.pin = pin;
    }
}
