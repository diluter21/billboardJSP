package com.diluter.pojo;



import java.util.ArrayList;
import java.util.List;

import com.diluter.pojo.Billboard;
import com.diluter.pojo.UpDate;
import com.diluter.service.BillboardService;
import com.diluter.service.BillboardServiceImp;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Set;

import org.hibernate.sql.Update;  


public class test {
	
	
	public static void main(String[] args) {
		
		 BillboardService bs = new BillboardServiceImp();
		 ActionContext.getContext().getSession().put("billboardList", bs.getAllBillboarList());
			
			

//		 BillboardService bs = new BillboardServiceImp();
//		 Billboard billboard = new Billboard();
//		 UpDate update = new UpDate();
//		
//		int pageNum = Integer.parseInt(ActionContext.getContext().getApplication().get("currentPageNum")+"");
//		ActionContext.getContext().getSession().put("billboardList", bs.getPageBillboarList(pageNum));

		
			
			
		}
	
	
	

}
