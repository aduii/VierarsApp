package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

public interface ICrudService<T> {

	public void insert(T t);
	
	public void update(T t);
	
	public void delete(int id);
	
	public List<T> listAll();
	
	public Optional<T> finbyId(int id);
	
}
