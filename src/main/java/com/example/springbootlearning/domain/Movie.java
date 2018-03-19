package com.example.springbootlearning.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Movie  implements Serializable{

    // TODO: 2018/3/9 搞清楚这个是干什么用的
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    // TODO: 2018/3/9 改变表结构后怎么真正地修改数据库中的表
    @Column(nullable = false , unique = true)
    private String name;

    @Column(nullable = false)
    private String director;

    @Column(nullable = false)
    private String year;

    public Movie() {
    }

    public Movie(String name, String director, String year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
