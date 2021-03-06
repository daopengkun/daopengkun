package com.entor.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	public void add(T t);
	public void addMore(List<T> list);
	public void update(T t);
	public void deleteById(Class<?> cls,Serializable id);
	public void deleteMore(Class<?> cls,String ids);
	public T queryById(Class<?> cls,Serializable id);
	public List<T> queryAll(Class<?> cls,T t);
	public List<T> queryByPage(Class<?> cls,Map<String,Integer> map);
	public List<T> queryByPageCondition(Class<?> cls,Map<String,Object> map);
	public int getTotals(Class<?> cls);
	public int getTotalsCondition(Class<?> cls,String condition);
	
}