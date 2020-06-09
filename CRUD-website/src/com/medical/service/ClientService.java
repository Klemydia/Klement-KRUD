package com.medical.service;

import java.util.List;

import com.medical.entity.client;

public interface ClientService {
	
	public List<client> getClients();
	
	public void saveClient(client theClient);
	
	

}
