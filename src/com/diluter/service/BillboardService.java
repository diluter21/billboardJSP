package com.diluter.service;

import java.util.List;
import com.diluter.pojo.Billboard;
import com.diluter.pojo.UpDate;

public interface BillboardService {

	
	public  List<Billboard> getAllBillboarList() ;
	
	public List<Billboard> getUpDateBillboardcheck(Billboard billboard, int updatenuber);
	
	public List<Billboard> findByPage(String hql, int offset, int pageSize) ;
	
	public void insertBillboard(Billboard billboard);
	public void upDateBillboard(Billboard billboard,int updatenuber);
	
	public void deleteDillboardById(int billboardId);
	
	
}
