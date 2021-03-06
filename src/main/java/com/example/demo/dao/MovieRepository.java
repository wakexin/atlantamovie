package com.example.demo.dao;

import com.example.demo.po.Movie;
import com.example.demo.po.MovieId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, MovieId> {
    Movie findByNameAndReleasedate(String name, String releasedate);



    // original version:
    // used embedded id for composite primary key
    // usage for findBy as below:
    // Movie findById_NameAndId_Releasedate(String name, String releasedate);
}
