package cn.edu.bnu.land.service;


import java.util.List;

import java.util.Map;
import java.util.TreeMap;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.bnu.land.model.Crawlurl;
import cn.edu.bnu.land.model.CrawlurlHome;



@Service
public class CrawlurlService {
	private CrawlurlHome crawlurlHome;
	private SessionFactory sessionFactory;
	private Crawlurl crawlurl;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	@Autowired
	public void setCrawlurlHome(CrawlurlHome crawlurlHome){
		this.crawlurlHome=crawlurlHome;
	}
	
	public Map<String,Object>  lookurl(String start,String limit,String searchField){
		System.out.println("lookurl");
		
		System.out.println("searchField:"+searchField);
		String totalCount =  new String();
		List<Crawlurl> results = null;
		Session session =sessionFactory.getCurrentSession(); 
		DetachedCriteria dc = DetachedCriteria.forClass(Crawlurl.class); 
		

		
		if (searchField != ""){
			dc.add(Restrictions.ilike("webname", searchField,MatchMode.ANYWHERE));
		}

		Criteria c = dc.getExecutableCriteria(session); 
		
		
		if (!c.list().isEmpty())
			totalCount= String.valueOf(c.list().size());
		c.setFirstResult(Integer.parseInt(start));
		c.setMaxResults(Integer.parseInt(limit));
		
		results = (List<Crawlurl>)c.list(); 
//		for (Transinfo i : results) { 
//			System.out.println(i.getNumber()+"  " + i.getText()); 
//		} 
		
		Map<String,Object> myMapResult = new TreeMap<String,Object>();
		System.out.println("查询记录总数："+ totalCount);
		myMapResult.put("total", new String(totalCount));
		myMapResult.put("root", results);
		return myMapResult;	

	}
	
    public void addCrawlurl(Crawlurl crawlurl){	
    	System.out.println("add_crawlurl service!");
    	Session session = sessionFactory.getCurrentSession(); 	

     	String webname = crawlurl.getWebname();
     	String url = crawlurl.getUrl();
     	System.out.println(webname + url);
     	crawlurl.setWebname(webname);
     	crawlurl.setUrl(url);
     	session.save(crawlurl); 	
	}
	
	public void updateCrawlurl(Crawlurl crawlurl){	
		Session session = sessionFactory.getCurrentSession();   	 
		String webname = crawlurl.getWebname();
     	String url = crawlurl.getUrl();
		crawlurl.setWebname(webname);
		crawlurl.setUrl(url);
		
     	session.update(crawlurl); 	
	}	
	
	/**
	 * 根据id删除crawlurl表中记录。多条id之间使用','分隔
	 * 
	**/
	public void deleteCrawlurl(String ids){
		String[] idsArray=ids.split(",");
		for (int i=0;i<idsArray.length;i++){
			String hql="delete from Crawlurl where number="+idsArray[i];
			System.out.println(hql);
			Session session = sessionFactory.getCurrentSession();
			Query q=session.createQuery(hql);
			q.executeUpdate();
		}
	}
	
	

}
