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
import cn.edu.bnu.land.model.ZcwTicketManagement;
import cn.edu.bnu.land.model.ZcwTicketManagement;
import cn.edu.bnu.land.model.Zcwhistoryofdeposit;

@Service
public class ZcwJyglService {
	@Autowired
	private ZcwTicketManagement ticketManagment;
	@Autowired
	private Zcwhistoryofdeposit depositHistory;
	//private FkQualityreport fkReport;
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Map<String, Object> getTicketInfo() {
		
		String hql = " FROM ZcwTicketManagement z ORDER BY z.date  DESC";
		System.out.println(hql);
		String totalConut = null;
		List<ZcwTicketManagement> results = null;
		try {
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println(totalConut);
			query.setFirstResult(0);
	        query.setMaxResults(1);
			results = (List<ZcwTicketManagement>) query.list();
			//results.get(0).setArea("gea");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("area"+results.get(0).getArea());
		Map<String, Object> myMapResult = new TreeMap<String, Object>();
		myMapResult.put("success", true);
		myMapResult.put("data", results.get(0));
		//myMapResult.put("data", "{\"overage:"+results.get(0)+"\"}");
		// System.out.println("myMapResult "+gridId+" "+myMapResult);

		return myMapResult;

	}
	

}
