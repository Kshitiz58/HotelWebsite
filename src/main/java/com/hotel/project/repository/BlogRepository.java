package com.hotel.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.project.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, String>{

}
