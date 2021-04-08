package io.jbaham1.github.personalportfolio.models;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 225)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false, length = 300)
    private String body;

    public Blog() {
    }

    public Blog(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Blog(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
