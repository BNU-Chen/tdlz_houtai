package cn.edu.bnu.land.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bnu.land.common.Encoder;
import cn.edu.bnu.land.common.SpringContextHolder;
import cn.edu.bnu.land.model.User;
import cn.edu.bnu.land.model.UserHome;
import cn.edu.bnu.land.model.ZSellapply;
import cn.edu.bnu.land.model.ZcwMangementOfDeposit;
import cn.edu.bnu.land.service.UserService;
import cn.edu.bnu.land.service.ZcwDepositService;



@Controller
public class ZcwDepositController {
	 @Autowired
	private ZcwDepositService depositService;
    private Encoder codechange;
    @Autowired
    private ZcwMangementOfDeposit d;
	@RequestMapping(value = "/getdeposit") //,method=RequestMethod.POST
	@ResponseBody 	
 	public Map<String,Object> handleZbsh(@RequestParam("start") String start,@RequestParam("limit") String limit) throws IOException 
	{ 	
		System.out.println("保证金交纳处理");
		Map<String,Object> model = new HashMap<String, Object>();   		  
        model=this.depositService.getDepositInfo(start, limit);
        return  (model); 
	} 
	
	@RequestMapping(value = "/updatedepositreceived") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> handlereceived(@RequestParam("start") String start,@RequestParam("limit") String limit,
			@RequestBody ZcwMangementOfDeposit record) throws IOException 
	{ 	
		System.out.println("保证金交纳处理handlereceived");
		System.out.println("name:"+record.getLoginName()+"tid:"+record.getTicketId());
		//Map<String,Object> model = new HashMap<String, Object>();   		  
         this.depositService.handledRreceived(record.getLoginName(), record.getTicketId());
        return  this.depositService.getDepositInfo(start, limit); 
        //return  (model); 
	} 
	
	@RequestMapping(value = "/updatedepositapplyback") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> handleApplyBack(@RequestParam("start") String start,@RequestParam("limit") String limit,
			@RequestBody ZcwMangementOfDeposit record) throws IOException 
	{ 	
		System.out.println("保证金交纳处理applyback");
		//Map<String,Object> model = new HashMap<String, Object>();   		  
         this.depositService.handleApplyBack(record.getLoginName(), record.getTicketId());
        return  this.depositService.getDepositInfo(start, limit); 
        //return  (model); 
	} 
	
	
	@RequestMapping(value = "/history") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> getDepositHistory(@RequestParam("start") String start,@RequestParam("limit") String limit) throws IOException 
	{ 	
		System.out.println("保证金历史记录");
		Map<String,Object> model = new HashMap<String, Object>();   		  
        model=this.depositService.getDepositHistory(start, limit, "三哥");
        return  (model); 
	} 
	
	
}
