package io.jbaham1.github.personalportfolio.models;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String body;
}
