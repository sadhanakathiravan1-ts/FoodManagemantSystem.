package com.project.food.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.food.SwiggyService;
import com.project.food.Food.Hotel;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hotel")
public class SwiggyController {

	@Autowired
	private SwiggyService swiggyser;
	
	@PostMapping("/save")
	public Hotel addfood(@RequestBody Hotel food) {
		return swiggyser.addfood(food);
	}
	
	@GetMapping("/fetchAll")
	public List<Hotel> getAllfood(){
		return swiggyser.getAllFood();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletefood(@PathVariable int id) {
		swiggyser.deletefood(id);
	}
}
