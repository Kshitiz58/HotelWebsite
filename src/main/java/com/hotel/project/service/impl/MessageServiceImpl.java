package com.hotel.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.project.model.Message;
import com.hotel.project.repository.MessageRepository;
import com.hotel.project.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MessageRepository messageRepo;
	
	@Override
	public void addMessage(Message message) {
		messageRepo.save(message);
		
	}

}
