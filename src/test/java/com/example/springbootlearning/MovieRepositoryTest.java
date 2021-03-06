package com.example.springbootlearning;

import com.example.springbootlearning.domain.entity.Movie;
import com.example.springbootlearning.domain.dao.MovieRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void test(){
//            movieRepository.save(new Movie("Titanic", "Jams", "1997"));
//            movieRepository.save(new Movie("Transformer" , "Mack" , "2008"));
        for (Movie x: movieRepository.findAll()
             ) {
            System.out.printf("MOIVE>    %s %s %s\n" , x.getName() , x.getDirector() , x.getYear());
        }
    }

}
