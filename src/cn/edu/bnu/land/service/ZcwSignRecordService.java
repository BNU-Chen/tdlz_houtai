package cn.edu.bnu.land.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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
import cn.edu.bnu.land.model.Zcwrecord;
import cn.edu.bnu.land.model.ZcwrecordHome;
import cn.edu.bnu.land.model.Zcwsignandrecord;
import cn.edu.bnu.land.model.ZcwsignandrecordHome;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service
public class ZcwSignRecordService {
	@Autowired
	private Zcwrecord red;
	@Autowired
	private ZcwrecordHome redHome;
	
	@Autowired
	private Zcwsignandrecord sr;
	@Autowired
	private ZcwsignandrecordHome srHome;
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Map<String, Object> getSign(String start, String limit) {
		
		String hql = "from Zcwsignandrecord s where s.contractstatus='待确认' or s.contractstatus='未签'";
		System.out.println(hql);
		String totalConut = null;
		List<ZcwMangementOfDeposit> results = null;
		try {
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println("count:"+totalConut);
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
	
	public Map<String, Object> updateSign(Zcwsignandrecord instance) {
		Map<String, Object> myMapResult = new TreeMap<String, Object>();
		
		Zcwsignandrecord sr=srHome.findById(instance.getId());
        sr.setContractstatus("待确认");
        System.out.println("待确认修改后"+sr.getContractstatus());
		myMapResult.put("msg", "已经向客户发出签约邀请");
		//myMapResult.put("root", results);
		return myMapResult;
		
	}
	
	public Zcwsignandrecord updateContractId(Zcwsignandrecord instance)throws IOException  {
		//Calendar cal = Calendar.getInstance();		
		String contractid="018"+instance.getTicketid();//018+指标id为合同id
		Zcwsignandrecord sr=srHome.findById(instance.getId());
		sr.setContractid(contractid);
		return sr;
		
	}
	
	
	
public Map<String, Object> getCheck(String start, String limit) {
		
		String hql = "from Zcwsignandrecord s where s.jycheck='未审核'";
		System.out.println(hql);
		String totalConut = null;
		List<ZcwMangementOfDeposit> results = null;
		try {
			org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
			totalConut = String.valueOf(query.list().size());
			System.out.println("count:"+totalConut);
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


public Map<String, Object> updateCheck(Zcwsignandrecord instance) {
	Map<String, Object> myMapResult = new TreeMap<String, Object>();
	
	Zcwsignandrecord sr=srHome.findById(instance.getId());
    sr.setJycheck("通过");;
    //System.out.println("待确认修改后"+sr.getContractstatus());
	myMapResult.put("msg", "已经向客户发出签约邀请");
	//myMapResult.put("root", results);
	return myMapResult;
	
}

public void updateContractHtml(Zcwsignandrecord instance) {
    
    Zcwsignandrecord result=srHome.findById(instance.getId());
    
    Configuration   configuration = new Configuration();
     configuration.setEncoding(Locale.CHINA, "utf-8");  
     configuration.setClassForTemplateLoading(this.getClass(), "/cn/edu/bnu/land/common");
     Template t = null;

     try {
         // freemarker2html.ftl为要装载的html模板
         t = configuration.getTemplate("zbjyht.ftl");
         t.setEncoding("utf-8");
     } catch (IOException e) {
         e.printStackTrace();
     }
     

     // 输出文档路径及名称
     Calendar ca = Calendar.getInstance();
     Date date = ca.getTime();
     java.text.DateFormat format2 = new java.text.SimpleDateFormat(
             "yyyyMMdd");
     String dateString = format2.format(date);
     //文件名称
     String m_fileName = java.net.URLEncoder.encode(result.getLoginName())+ "_" + dateString + ".html";
     //
     String realPath=this.getClass().getClassLoader().getResource("/").getPath();
     System.out.println("realPath"+realPath);
     int pos=realPath.indexOf("/WEB-INF");
     System.out.println(pos);
     realPath=realPath.substring(0, pos);
     realPath=realPath+"/contracts/"; 
     System.out.println(realPath);
     String filePath = realPath +m_fileName;
     result.setCertification("contracts/"+m_fileName);
     
     System.out.println("凭证地址"+result.getContractcontent());
    srHome.merge(result);
     File outFile = new File(filePath);
     Writer out = null;
     try {
         out = new BufferedWriter(new OutputStreamWriter(
                 new FileOutputStream(outFile), "gbk"));
     } catch (Exception e1) {
         e1.printStackTrace();
     }

     try {
         t.process(result, out);
         out.close();
     } catch (TemplateException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }        
}

public Map<String, Object> getFfpz(String start, String limit) {
	
	String hql = "from Zcwsignandrecord s where s.jycheck='通过'";
	System.out.println(hql);
	String totalConut = null;
	List<ZcwMangementOfDeposit> results = null;
	try {
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		totalConut = String.valueOf(query.list().size());
		System.out.println("count:"+totalConut);
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

public void updatePzHtml(Zcwsignandrecord instance) {
    
    Zcwsignandrecord result=srHome.findById(instance.getId());
    
    Configuration   configuration = new Configuration();
     configuration.setEncoding(Locale.CHINA, "utf-8");  
     configuration.setClassForTemplateLoading(this.getClass(), "/cn/edu/bnu/land/common");
     Template t = null;

     try {
         // freemarker2html.ftl为要装载的html模板
         t = configuration.getTemplate("zbpz.ftl");
         t.setEncoding("utf-8");
     } catch (IOException e) {
         e.printStackTrace();
     }
     

     // 输出文档路径及名称
     Calendar ca = Calendar.getInstance();
     Date date = ca.getTime();
     java.text.DateFormat format2 = new java.text.SimpleDateFormat(
             "yyyyMMdd");
     String dateString = format2.format(date);
     //文件名称
     String m_fileName = java.net.URLEncoder.encode(result.getLoginName())+ "_" + dateString + ".html";
     //
     String realPath=this.getClass().getClassLoader().getResource("/").getPath();
     System.out.println("realPath"+realPath);
     int pos=realPath.indexOf("/WEB-INF");
     System.out.println(pos);
     realPath=realPath.substring(0, pos);
     realPath=realPath+"/pz/"; 
     System.out.println(realPath);
     String filePath = realPath +m_fileName;
     result.setCertification("pz/"+m_fileName);
     
     System.out.println("凭证地址"+result.getCertification());
    srHome.merge(result);
     File outFile = new File(filePath);
     Writer out = null;
     try {
         out = new BufferedWriter(new OutputStreamWriter(
                 new FileOutputStream(outFile), "gbk"));
     } catch (Exception e1) {
         e1.printStackTrace();
     }

     try {
         t.process(result, out);
         out.close();
     } catch (TemplateException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }        
}

public Map<String, Object> getRecord(String start, String limit) {
	
	String hql = "from Zcwrecord";
	System.out.println(hql);
	String totalConut = null;
	List<Zcwrecord> results = null;
	try {
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		totalConut = String.valueOf(query.list().size());
		System.out.println("count:"+totalConut);
		query.setFirstResult(Integer.parseInt(start));
		query.setMaxResults(Integer.parseInt(limit));
		results = (List<Zcwrecord>) query.list();
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

}

