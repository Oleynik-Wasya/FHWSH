package de.fhws.international.fhwsh.models;

import android.net.Uri;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private long id;
    private String title;
    private String info;
    private LocalDate date;

    public Post(long id, String title, String info, LocalDate date) {
        this.id = id;
        this.title = title;
        this.info = info;
        this.date = date;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Post(long id, String title, String info) {
        this.id = id;
        this.title = title;
        this.info = info;
        this.date = LocalDate.now();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Post(String title, String info) {
        this.title = title;
        this.info = info;
        this.id = title.hashCode() + info.hashCode();
        this.date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
