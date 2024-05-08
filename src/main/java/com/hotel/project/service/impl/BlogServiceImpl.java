package com.hotel.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.project.model.Blog;
import com.hotel.project.repository.BlogRepository;
import com.hotel.project.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogRepository blogRepo;
	
	@Override
	public void addBlog(Blog blog) {
		blogRepo.save(blog);
		
	}

}
