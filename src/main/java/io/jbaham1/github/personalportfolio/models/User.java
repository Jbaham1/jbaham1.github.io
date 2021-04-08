package io.jbaham1.github.personalportfolio.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;



    @OneToMany (cascade = CascadeType.ALL, mappedBy = "id")
    private List<Blog> blog;

//    @OneToMany (cascade = CascadeType.ALL, mappedBy = "comment_id")
//    private List<Comment> comments;
public User() {
}

    public User(String username, String email, String password, List<Blog> blog) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.blog = blog;
    }

    public User(long id, String username, String email, String password, List<Blog> blog) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.blog = blog;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }
}
