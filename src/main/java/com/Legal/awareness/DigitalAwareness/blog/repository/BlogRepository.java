package com.Legal.awareness.DigitalAwareness.blog.repository;

import com.Legal.awareness.DigitalAwareness.blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
