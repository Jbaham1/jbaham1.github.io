package io.jbaham1.github.personalportfolio.models;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long comment_id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String comment;

    @ManyToOne
    @JoinColumn (name = "owner_id")
    private User owner;

    @ManyToOne
    @JoinColumn (name = "blog_id")
    private Blog blog;

    public Comment() {};

    public Comment(long id, String comment, User owner, Blog blog) {
        this.comment_id = id;
        this.comment = comment;
        this.owner = owner;
        this.blog = blog;
    }

    public Comment(String comment, User owner, Blog blog) {
        this.comment = comment;
        this.owner = owner;
        this.blog = blog;
    }

    public long getId() {
        return comment_id;
    }

    public void setId(long id) {
        this.comment_id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
