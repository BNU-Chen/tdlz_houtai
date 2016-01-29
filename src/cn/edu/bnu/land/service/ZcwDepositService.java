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
import cn.edu.bnu.land.model.ZcwMangementOfDeposit;
import cn.edu.bnu.land.model.Zcwhistoryofdeposit;

@Service
public class ZcwDepositService {
	@Autowired
	private ZcwMangementOfDeposit depositManagment;
	@Autowired
	private Zcwhistoryofdeposit depositHistory;
	//private FkQualityreport fkReport;
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Map<String, Object> getDepositInfo(String start, String limit) {
		
		String hql = "from ZcwMangementOfDeposit s where s.returnstatus='正在确认' ";
		System.out.println(hql);
		String totalConut = null;
		List<ZcwMangementOfDeposit> results = null;
		try {
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println(totalConut);
			query.setFirstResult(Integer.parseInt(start));
			query.setMaxResults(Integer.parseInt(limit));
			results = (List<ZcwMangementOfDeposit>) query.list();
			//results.get(0).setArea("gea");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("area"+results.get(0).getArea());
		Map<String, Object> myMapResult = new TreeMap<String, Object>();
		myMapResult.put("total", totalConut);
		myMapResult.put("root", results);
		// System.out.println("myMapResult "+gridId+" "+myMapResult);

		return myMapResult;

	}
	
public Map<String, Object> handledRreceived(String name,String ticketid) {
		
		String hql = "from ZcwMangementOfDeposit s where s.loginName='"+name+"' and s.ticketId='"+ticketid+"'";
		//String hql = "from ZcwMangementOfDeposit s where s.returnstatus='正在确认' ";
		System.out.println(hql);
		String totalConut = null;
		List<ZcwMangementOfDeposit> results = null;
		try {
			//org.hibernate.Query query =this.getHibernateTemplate().getSessionFactory().openSession()
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println(totalConut);
			//query.setFirstResult(Integer.parseInt(start));
			//query.setMaxResults(Integer.parseInt(limit));
			results = (List<ZcwMangementOfDeposit>) query.list();
			results.get(0).setReturnstatus("已交纳");
			//sessionFactory.getCurrentSession().flush();
			//sessionFactory.getCurrentSession().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("status:"+results.get(0).getReturnstatus());
		Map<String, Object> myMapResult = new TreeMap<String, Object>();
		myMapResult.put("total", totalConut);
		myMapResult.put("root", results);
		// System.out.println("myMapResult "+gridId+" "+myMapResult);

		return myMapResult;

		
	}
	

public Map<String, Object> handleApplyBack(String name,String ticketid) {
	
	String hql = "from ZcwMangementOfDeposit s where s.loginName='"+name+"' and s.ticketId='"+ticketid+"'";
	//String hql = "from ZcwMangementOfDeposit s where s.returnstatus='正在确认' ";
	System.out.println(hql);
	String totalConut = null;
	List<ZcwMangementOfDeposit> results = null;
	try {
		//org.hibernate.Query query =this.getHibernateTemplate().getSessionFactory().openSession()
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		totalConut = String.valueOf(query.list().size());
		System.out.println(totalConut);
		//query.setFirstResult(Integer.parseInt(start));
		//query.setMaxResults(Integer.parseInt(limit));
		results = (List<ZcwMangementOfDeposit>) query.list();
		results.get(0).setReturnstatus("已退还");
		//sessionFactory.getCurrentSession().flush();
		//sessionFactory.getCurrentSession().close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("status:"+results.get(0).getReturnstatus());
	Map<String, Object> myMapResult = new TreeMap<String, Object>();
	myMapResult.put("total", totalConut);
	myMapResult.put("root", results);
	// System.out.println("myMapResult "+gridId+" "+myMapResult);

	return myMapResult;

	
}

	
public Map<String, Object> getDepositHistory(String start, String limit,String loginname) {
		
		String hql = "from Zcwhistoryofdeposit s ";
		System.out.println(hql);
		String totalConut = null;
		List<Zcwhistoryofdeposit> results = null;
		try {
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println(totalConut);
			query.setFirstResult(Integer.parseInt(start));
			query.setMaxResults(Integer.parseInt(limit));
			results = (List<Zcwhistoryofdeposit>) query.list();
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
