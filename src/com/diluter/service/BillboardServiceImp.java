package com.diluter.service;

import java.util.List;


import com.diluter.dao.BillboardDao;
import com.diluter.dao.BillboardDaoImp;
import com.diluter.pojo.Billboard;
import com.diluter.pojo.UpDate;

public class BillboardServiceImp implements BillboardService {

	private BillboardDao dao = new BillboardDaoImp();
	
	@Override
	public List<Billboard> getAllBillboarList() {

		return dao.getAllBillboarList();
	}
	
	


	@Override
	public void insertBillboard(Billboard billboard) {
		dao.insertBillboard(billboard);
		
	}

	@Override
	public void deleteDillboardById(int billboardId) {
		dao.deleteDillboardById(billboardId);
	}


	@Override
	public void upDateBillboard(Billboard billboard,int updatenuber) {
		dao.upDateBillboard(billboard,updatenuber);
		
	}






	@Override
	public List<Billboard> getUpDateBillboardcheck(Billboard billboard, int updatenuber) {
		return dao.getUpDateBillboardcheck(billboard, updatenuber);
	}




	@Override
	public List<Billboard> findByPage(String hql, int offset, int pageSize) {
		return dao.findByPage(hql, offset, pageSize);
	}

	

	
	
}
