package cn.edu.bnu.land.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bnu.land.model.FkQualityreport;
import cn.edu.bnu.land.model.Syncpush;
import cn.edu.bnu.land.model.SyncpushHome;
import cn.edu.bnu.land.model.User;
import cn.edu.bnu.land.model.UserHome;
import cn.edu.bnu.land.model.ZSellapply;

@Service
public class ZcwSellService {
	
	private ZSellapply sellApply;
	private FkQualityreport fkReport;
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
		
	@Autowired
	public void setSyncpushHome(ZSellapply sellApply){
		this.sellApply=sellApply;
	}
	
	
	public Map<String, Object> getSellInfo(String start, String limit) {
		
		String hql = "from ZSellapply s where s.checkstate='�������'";
		System.out.println(hql);
		String totalConut = null;
		List<ZSellapply> results = null;
		try {
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println(totalConut);
			query.setFirstResult(Integer.parseInt(start));
			query.setMaxResults(Integer.parseInt(limit));
			results = (List<ZSellapply>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Map<String, Object> myMapResult = new TreeMap<String, Object>();
		myMapResult.put("total", totalConut);
		myMapResult.put("root", results);
		// System.out.println("myMapResult "+gridId+" "+myMapResult);

		return myMapResult;

	}
	
public Map<String, Object> getZbxx(String ticketid) {
		
		String hql = "from ZSellapply s where s.ticketid='"+ticketid+"'";
		System.out.println(hql);
		String totalConut = null;
		List<ZSellapply> results = null;
		try {
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println(totalConut);			
			results = (List<ZSellapply>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Map<String, Object> myMapResult = new TreeMap<String, Object>();
		myMapResult.put("success", true);
		myMapResult.put("data", results.get(0));
		// System.out.println("myMapResult "+gridId+" "+myMapResult);

		return myMapResult;

	}
	
public Map<String, Object> getFkxx(String ticketid) {
	
	String hql = "from FkQualityreport s where s.applyId='"+ticketid+"'";
	System.out.println(hql);
	String totalConut = null;
	List<FkQualityreport> results = null;
	try {
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		totalConut = String.valueOf(query.list().size());
		System.out.println("������Ϣ��¼����"+totalConut);			
		results = (List<FkQualityreport>) query.list();
	} catch (Exception e) {
		e.printStackTrace();
	}

	Map<String, Object> myMapResult = new TreeMap<String, Object>();
	myMapResult.put("success", true);
	myMapResult.put("data", results.get(0));
	// System.out.println("myMapResult "+gridId+" "+myMapResult);

	return myMapResult;

}


public Map<String, Object> getDagl(String ticketid,String date1,String date2,String checkstate,String start,String limit) {
	System.out.println(checkstate);
	String check=null;
	if(checkstate.equals("δͨ��"))
		{System.out.println(checkstate);
		check="�������";}
	else
		check="ͨ��";
	if(date1=="")
		date1="2000-01-01";
	if(date2=="")
		date2="2020-01-01";
	String hql =" from ZSellapply ticket where ticket.ticketid like '%"+ticketid+"%' and ticket.applydate >= "+
			"'"+date1+"'"+" and ticket.applydate <= "+"'"+date2+"' and ticket.checkstate='"+check+"'"  ;
	System.out.println(hql);
	String totalConut = null;
	List<ZSellapply> results = null;
	try {
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		totalConut = String.valueOf(query.list().size());
		System.out.println(totalConut);
		query.setFirstResult(Integer.parseInt(start));
		query.setMaxResults(Integer.parseInt(limit));
		results = (List<ZSellapply>) query.list();
	} catch (Exception e) {
		e.printStackTrace();
	}

	Map<String, Object> myMapResult = new TreeMap<String, Object>();
	myMapResult.put("total", totalConut);
	myMapResult.put("root", results);
	// System.out.println("myMapResult "+gridId+" "+myMapResult);

	return myMapResult;

}
	
}
