package hellospring_config.Dao;

import java.util.List;

import hellospring_config.model.User;

public interface UserDao {

	public List<User> listuser();
	
	public void add(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public User findById(String id);
	
}
