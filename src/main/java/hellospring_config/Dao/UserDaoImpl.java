package hellospring_config.Dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import hellospring_config.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public static final String collection_Name = "user";
	
	public List<User> listuser() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(User.class,collection_Name);
	}

	public void add(User user) {
		// TODO Auto-generated method stub
		if(!mongoTemplate.collectionExists(User.class))
		{
			mongoTemplate.createCollection(User.class);
		}
		user.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(user,collection_Name);
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		mongoTemplate.save(user);
		
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		mongoTemplate.remove(user,collection_Name);
	}

	public User findById(String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findById(id, User.class);
	}

	
	
}
