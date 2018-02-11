package hellospring_config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hellospring_config.Dao.UserDao;
import hellospring_config.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	public List<User> listuser() {
		// TODO Auto-generated method stub
		return userDao.listuser();
	}

	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
		
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
		
	}

	public User findById(String id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

}
