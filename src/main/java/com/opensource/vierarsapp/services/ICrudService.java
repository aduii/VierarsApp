package com.opensource.vierarsapp.services;

import java.util.List;

public interface ICrudService<T> {

	public boolean insert(T t);
	
	public boolean update(T t);
	
	public boolean delete(int id);
	
	public List<T> listAll();
	
	public T finbyId(int id);
	
}
