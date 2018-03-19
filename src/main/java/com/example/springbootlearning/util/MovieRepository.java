package com.example.springbootlearning.util;

import com.example.springbootlearning.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie , Long> {
    public Movie findByName(String name);

    //有多个对象时返回list
    public List<Movie> findByDirector(String director);
}
