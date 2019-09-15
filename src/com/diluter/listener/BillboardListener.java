package com.diluter.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.engine.jdbc.batch.spi.BatchObserver;
import com.diluter.service.BillboardService;
import com.diluter.service.BillboardServiceImp;

public class BillboardListener implements ServletContextListener{
	private BillboardService bs = new BillboardServiceImp();
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		//�w�]��
		event.getServletContext().setAttribute("currentPageNum", 1);
		//�`��Ƶ���
		int totalNum = bs.getAllBillboarList().size();
		//���ƭp��
		int totalPageNum = totalNum%3 == 0?totalNum/3:totalNum/3+1;
		event.getServletContext().setAttribute("totalPageNum", totalPageNum);
		
	}

	
	
}
