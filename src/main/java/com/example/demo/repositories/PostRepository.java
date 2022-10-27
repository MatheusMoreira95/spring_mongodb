package com.example.demo.repositories;

import com.example.demo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface PostRepository extends MongoRepository<Post, String> {


    List<Post> findByTitleContainingIgnoreCase(String text);
}
