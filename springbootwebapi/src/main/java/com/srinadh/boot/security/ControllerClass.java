package com.srinadh.boot.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	@Autowired
	private servivceLayer layer;
	public servivceLayer getLayer() {
		return layer;
	}
	public void setLayer(servivceLayer layer) {
		this.layer = layer;
	}
	@PostMapping("/madhu")
	public Vehicle save(@RequestBody Vehicle vehi)
	{
		return layer.save(vehi);
	}
	@GetMapping("/madhu")
	public List<Vehicle>getAll()
	{
		return layer.getAll();
	}
	@PutMapping("/madhu{id}")
	public Vehicle saa(@RequestBody Vehicle vehi)
	{
			
	   return layer.putting(vehi)	;
	}
	@DeleteMapping("/madhu/{id}")
	public void saa(@PathVariable("id") int vehi)
	{
	  layer.letting(vehi)	;
	}
	@GetMapping("/madhu/{id}")
	public Vehicle getId(@PathVariable("id") int i)
	{
		return layer.get(i);
	}

}
