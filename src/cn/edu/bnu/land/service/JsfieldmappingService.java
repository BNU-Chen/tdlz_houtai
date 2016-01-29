package cn.edu.bnu.land.service;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bnu.land.model.Crawlurl;
import cn.edu.bnu.land.model.Jsfieldmapping;
import cn.edu.bnu.land.model.JsfieldmappingHome;
import cn.edu.bnu.land.model.Transinfo;


@Service
public class JsfieldmappingService {
	private JsfieldmappingHome jsfieldmappingHome;
	private SessionFactory sessionFactory;
	private Jsfieldmapping jsfieldmapping;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	@Autowired
	public void setJsfieldmappingHome(JsfieldmappingHome jsfieldmappingHome){
		this.jsfieldmappingHome = jsfieldmappingHome;
	}
	

	
	
	public Map<String,Object>  lookFieldmapping(String start,String limit){
		System.out.println("look fieldmapping2");
		System.out.println("start:"+start);
		System.out.println("limit:"+limit);
		String totalCount =  new String();
		String hql="from Jsfieldmapping as jsfieldmapping";
		List<Jsfieldmapping> results = null;
	    try{
	    	org.hibernate.Query query=sessionFactory.getCurrentSession().createQuery(hql);
			if(!query.list().isEmpty())
				totalCount=String.valueOf(query.list().size());//获取此次搜索结果的总记录数
			query.setFirstResult(Integer.parseInt(start));//设置所有结果的首记录位置
			query.setMaxResults(Integer.parseInt(limit));//设置所有结果的每页显示的记录数
	    	results=query.list();
//	    	for(Jsfieldmapping jsfieldmapping:results){
//	    		System.out.println(jsfieldmapping.getId()+ jsfieldmapping.getFieldmapping());
//	    	}	    
	    	
	    	
			results = (List<Jsfieldmapping>)query.list(); 
			for (Jsfieldmapping i : results) { 
				System.out.println(i.getId()+"  " + i.getFieldmapping()); 
			} 
	    }
		catch(Exception e){
			e.printStackTrace();
		}	
				

		
		Map<String,Object> myMapResult = new TreeMap<String,Object>();
		System.out.println("字段映射表查询记录总数："+ totalCount);
		myMapResult.put("total", new String(totalCount));
		myMapResult.put("root", results);
		return myMapResult;	

	}
	
	/**
	 * 根据id删除crawlkeywords表中记录。多条id之间使用','分隔
	 * 
	**/
	public void deletefieldmapping(String ids){
		String[] idsArray=ids.split(",");
		for (int i=0;i<idsArray.length;i++){
			String hql="delete from Jsfieldmapping where id="+idsArray[i];
			System.out.println(hql);
			Session session = sessionFactory.getCurrentSession();
			Query q=session.createQuery(hql);
			q.executeUpdate();
		}
	}

	
}
