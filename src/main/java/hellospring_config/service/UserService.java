package hellospring_config.service;

import java.util.List;

import hellospring_config.model.User;

public interface UserService {

	public List<User> listuser();
	
	public void add(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public User findById(String id);
	

}
