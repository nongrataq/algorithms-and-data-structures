package patterns.behavioral.observer;

import java.time.LocalDateTime;

public class News {
    private String news;
    private LocalDateTime date;

    @Override
    public String toString() {
        return "News{" +
                "news='" + news + '\'' +
                ", date=" + date +
                '}';
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public News(String news, LocalDateTime date) {
        this.news = news;
        this.date = date;
    }
}
