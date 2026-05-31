package com.project.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food.Food.Hotel;
import com.project.food.Repository.SwiggyRepository;

@Service
public class SwiggyService {
	@Autowired
       private SwiggyRepository swiggyrepo;
	
	public Hotel addfood(Hotel food) {
		return swiggyrepo.save(food);
	}
	
	public List<Hotel> getAllFood(){
		return swiggyrepo.findAll();
	}
	
	public void deletefood(int id) {
		swiggyrepo.deleteById(id);
	}
	
	
	
	
}
