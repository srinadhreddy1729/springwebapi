package com.srinadh.boot.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;
import lombok.Setter;


@Service
public class servivceLayer {
	@Autowired
	private Reposity Repo;
	public @ResponseBody Vehicle save(Vehicle v)
	{
		return Repo.save(v);
	}
	public Reposity getRepo() {
		return Repo;
	}
	public void setRepo(Reposity repo) {
		Repo = repo;
	}
	public List<Vehicle> getAll()
	{
		List<Vehicle> jj=Repo.findAll();
		return jj;
	}
	public Vehicle putting(Vehicle vehi)
	{ 
	  return Repo.save(vehi);
	}
	public void letting(int vehi)
	{ 
		Vehicle v=Repo.findById(vehi).get();
	  Repo.delete(v);
	}
	public Vehicle get (int i)
	{ 
		Vehicle v=Repo.findById(i).get();
	  return v;
	}
	

}
