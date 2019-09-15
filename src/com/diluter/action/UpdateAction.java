package com.diluter.action;

import java.util.ArrayList;
import java.util.List;
import com.diluter.pojo.Billboard;
import com.diluter.pojo.UpDate;
import com.diluter.service.BillboardService;
import com.diluter.service.BillboardServiceImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Set;

import org.hibernate.sql.Update;  

public class UpdateAction extends ActionSupport implements ModelDriven<UpDate> {
	

	

	private static final long serialVersionUID = 1L;
	
	private BillboardService bs = new BillboardServiceImp();
	private Billboard billboard = new Billboard();
	private UpDate update = new UpDate();


	
	
	public String revisePage() {
//		System.out.println(billboard.getId());
//		System.out.println(update.getUpdateid());
		ActionContext.getContext().put("Updateid", update.getUpdateid());
	ActionContext.getContext().put("UpdateList", bs.getUpDateBillboardcheck(billboard,update.getUpdateid()));

	
	//	 ActionContext.getContext().getSession().put("UpDateBillboardcheckList",  bs.getUpDateBillboardcheck(billboard, billboard.getId()));
		
	    return SUCCESS;
	}
	
	@Override
	public UpDate getModel() {
	
		return update;
	}
}

	

