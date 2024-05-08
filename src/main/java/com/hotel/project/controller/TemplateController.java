package com.hotel.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel.project.model.Blog;
import com.hotel.project.model.Message;
import com.hotel.project.service.BlogService;
import com.hotel.project.service.MessageService;


@Controller
public class TemplateController {

	@Autowired
	private BlogService blogService;
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping({"/","/index"})
	public String getIndex() {
		return "index";
	}
	@GetMapping("/blogs")
	public String getBlogs() {
		return "blogs";
	}
	
	@PostMapping("/blogs")
	public String postBlog(@ModelAttribute Blog blog) {
		blogService.addBlog(blog);
		return "redirect:/blogs";
	}
	
	@PostMapping("/contact")
	public String postMessage(@ModelAttribute Message message) {
		messageService.addMessage(message);
		return "redirect:/contact";
	}
	
	
	
	@GetMapping("/contact")
	public String getContact() {
		return "contact";
	}
	
	@GetMapping("/about")
	public String getAbout() {
		return "about";
	}
	
	@GetMapping("/services")
	public String getServices() {
		return "services";
	}
}
