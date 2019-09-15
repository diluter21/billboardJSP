package com.diluter.dao;

import java.util.List;

import com.diluter.pojo.Billboard;

public interface BillboardDao {
	public List<Billboard> getAllBillboarList();
	
	
	//´ú¸Õ¤À­¶
	public List<Billboard> findByPage( String hql, int offset,  int pageSize);
	

	
	public void insertBillboard(Billboard billboard);
	public void upDateBillboard(Billboard billboard,int updatenuber);
	public List<Billboard> getUpDateBillboardcheck(Billboard billboard,int updatenuber);
	
	
	public void deleteDillboardById(int billboardId);
}
