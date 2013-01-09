package com.bd.nosql.mongodb.springdata.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.bd.nosql.mongodb.springdata.model.User;

public class MongoDbClient {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");

		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

		User user = new User("Sahana", "password123");

		// save
		mongoOperation.save(user, "users");

		// find
		User savedUser = mongoOperation.findOne(new Query(Criteria.where("username").is("Sahana")), User.class, "users");

		System.out.println("savedUser : " + savedUser);

		// update
		mongoOperation.updateMulti(new Query(Criteria.where("username").is("Sahana")), Update.update("password", "new password"), "users");

		// find
		User updatedUser = mongoOperation.findOne(new Query(Criteria.where("username").is("Sahana")), User.class, "users");

		System.out.println("updatedUser : " + updatedUser);

		// delete - comment this to see this user in all users query result
		mongoOperation.remove(new Query(Criteria.where("username").is("Sahana")), "users");

		// List
		List<User> listUser = mongoOperation.findAll(User.class, "users");
		System.out.println("all users = " + listUser);
		System.out.println("Number of user = " + listUser.size());

	}

}
