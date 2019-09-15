package com.diluter.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import javax.persistence.Id;
import org.hibernate.Transaction;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import com.diluter.pojo.Billboard;
import com.diluter.pojo.UpDate;
import com.diluter.utils.HibernateUtils;
import com.sun.xml.internal.bind.v2.model.core.ID;



import com.diluter.action.BillboardAction;
import org.hibernate.type.StringType;


public class BillboardDaoImp implements BillboardDao {
	
	
	

	@Override
	public List<Billboard> getAllBillboarList() {
			// TODO Auto-generated method stub
			Session session=  HibernateUtils.openSession();
			Criteria criteria = session.createCriteria(Billboard.class);
			List<Billboard>list = criteria.list();
			session.close();
			return list;
	}
	
	
	



	//*
	@Override
	public void insertBillboard(Billboard billboard) {
		Session session=  HibernateUtils.openSession();
		session.save(billboard);
		session.close();
	}


	@Override
	public void deleteDillboardById(int billboardId) {
		Session session=  HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		Billboard billboard = session.get(Billboard.class,billboardId);
		session.delete(billboard);
		transaction.commit();
		session.close();
		
	}


	@Override
	public void upDateBillboard(Billboard billboard,int updatenuber) {

		Session session=  HibernateUtils.openSession();
		

		Transaction transaction = session.beginTransaction();
		billboard.setId(updatenuber);
		billboard.setAttachment(billboard.getAttachment());
		billboard.setTitle(billboard.getTitle());
		billboard.setDetail(billboard.getDetail());
		billboard.setDueDate(billboard.getDueDate());
		billboard.setReleaseDate(billboard.getReleaseDate());
		
		session.update(billboard);
		transaction.commit();
		session.close();
		
		
		
	}





	@Override
	public List<Billboard> getUpDateBillboardcheck(Billboard billboard, int updatenuber) {
        Session session=  HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		String hql =  "select title,releaseDate,dueDate,detail "+
				  " from billboardData" 
				
				 + " where id=' " +  updatenuber    +  "   '";
		List list=new ArrayList();

	 List title1 = session.createSQLQuery(hql).addScalar("title", StringType.INSTANCE).list();
		List releaseDate1 = session.createSQLQuery(hql).addScalar("releaseDate", StringType.INSTANCE).list();
		List dueDate1 = session.createSQLQuery(hql).addScalar("dueDate", StringType.INSTANCE).list();
		List detail1 = session.createSQLQuery(hql).addScalar("detail", StringType.INSTANCE).list();

		//去除[]
		String title = StringUtils.strip(title1.toString(),"[]");
		String releaseDate = StringUtils.strip(releaseDate1.toString(),"[]");
		String dueDate = StringUtils.strip(dueDate1.toString(),"[]");
		String detail = StringUtils.strip(detail1.toString(),"[]");
		
		
			list.add(title);
			list.add(releaseDate);
			list.add(dueDate);
			list.add(detail);	
		
		return list;
	}




	@Override
	public List<Billboard> findByPage(String hql, int offset, int pageSize) {
        Session session=  HibernateUtils.openSession();
    	Criteria criteria = session.createCriteria(Billboard.class);
        List result = criteria
                .setFirstResult(offset)
                .setMaxResults(pageSize)
                .list();
        
        List<Billboard> list =result;
        
		return list;
 
	}



	
	







}
