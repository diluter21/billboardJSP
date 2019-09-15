package com.diluter.action;

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


public class BillboardAction extends ActionSupport implements ModelDriven<Billboard>{

	private static final long serialVersionUID = 1L;
	
	
	
	private BillboardService bs = new BillboardServiceImp();
	private Billboard billboard = new Billboard();
	private UpDate update = new UpDate();

	
	
	//返回當前頁面
	 private int curPageNumber;
	public int getCurPageNumber() {
		return curPageNumber;
	}
	public void setCurPageNumber(int curPageNumber) {
		this.curPageNumber = curPageNumber;
	}

	









	public String goHomePage() {
      
      //用不到 改criteria搜尋方法
      String hql = "  from billboardData";
      
      int pageSize = 10; // 每頁數輛
      int allRows = bs.getAllBillboarList().size(); //紀錄總數
      int allPage; // 總頁數
      int offset =  curPageNumber + 1; // 起始值
      allPage = (allRows -1) / pageSize + 1;  // 計算總頁數
      
      
      List<Billboard> billboardLists = bs.findByPage(hql,(offset-1)*pageSize, pageSize);
      ActionContext.getContext().getSession().put("allPage", allPage);
      ActionContext.getContext().getSession().put("offset", offset);
      ActionContext.getContext().getSession().put("billboard", billboardLists);
//      System.out.println(allPage);
//      System.out.println(offset);
      

      	return SUCCESS;
 
	}
	
	
	
	
	
	
	
	
	
	
	public String revisePage() {
		System.out.println(billboard.getId());
		System.out.println(update.getUpdateid());
		ActionContext.getContext().put("Updateid", update.getUpdateid());
	    return SUCCESS;
	}
	
	
	public String addPage() {
//		System.out.println(billboard);
		bs.insertBillboard(billboard);
		return SUCCESS;
	}
	
	
	public String revise() {
//    update.setUpdateid(billboard.getId());
	 bs.upDateBillboard(billboard,billboard.getId());
		return SUCCESS;
	}
	
	
	


	public String deleteDillboardById() {
   bs.deleteDillboardById(billboard.getId());
	return SUCCESS;
 
	}

	@Override
	public Billboard getModel() {
	
		return billboard;
	}

	
	
	
	

	

		

	
	

	
	
	
	
	
	
	
	
	
	
	
	
}




