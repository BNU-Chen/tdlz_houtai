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
import cn.edu.bnu.land.model.Zcwsignandrecord;
import cn.edu.bnu.land.service.UserService;
import cn.edu.bnu.land.service.ZcwDepositService;
import cn.edu.bnu.land.service.ZcwSignRecordService;



@Controller
public class ZcwSignRecordController {
	 @Autowired
	private ZcwSignRecordService srService;
    private Encoder codechange;
    @Autowired
    private Zcwsignandrecord sr;
	@RequestMapping(value = "/getsign") //,method=RequestMethod.POST
	@ResponseBody 	
 	public Map<String,Object> handleGetSign(@RequestParam("start") String start,@RequestParam("limit") String limit) throws IOException 
	{ 	
		System.out.println("网签网备");
		Map<String,Object> model = new HashMap<String, Object>();   		  
        model=this.srService.getSign(start, limit);
        return  (model); 
	} 
	
	@RequestMapping(value = "/updatesign",method=RequestMethod.POST)
	@ResponseBody 	
 	public Map<String,Object> handleUpdateSign(@RequestBody Zcwsignandrecord record) throws IOException 
	{ 	
		System.out.println("邀请签约");
		Map<String,Object> model = new HashMap<String, Object>(); 
		//this.srService.generateContractId(record);
		//this.srService.generateContractId(record);
		this.srService.updateContractHtml(this.srService.updateContractId(record));
		
        model=this.srService.updateSign(record);
        return  (model); 
	} 
	
	

	@RequestMapping(value = "/getcheck")
	@ResponseBody 	
 	public Map<String,Object> handleGetCheck(@RequestParam("start") String start,@RequestParam("limit") String limit) throws IOException 
	{ 	
		System.out.println("交易审核");
		Map<String,Object> model = new HashMap<String, Object>(); 
		//this.srService.generateContractId(record);
		//this.srService.generateContractId(record);
		//this.srService.updateContractHtml(this.srService.updateContractId(record));
		
        model=this.srService.getCheck(start, limit);
        return  (model); 
	} 
	
	@RequestMapping(value = "/updatecheck",method=RequestMethod.POST)
	@ResponseBody 	
 	public Map<String,Object> handleUpdateCheck(@RequestBody Zcwsignandrecord record) throws IOException 
	{ 	
		System.out.println("邀请签约");
		Map<String,Object> model = new HashMap<String, Object>(); 
		//this.srService.generateContractId(record);
		//this.srService.generateContractId(record);
		//this.srService.updateContractHtml(this.srService.updateContractId(record));
		
        model=this.srService.updateCheck(record);
        return  (model); 
	} 
	
	@RequestMapping(value = "/getffpz")
	@ResponseBody 	
 	public Map<String,Object> handleGetFfpz(@RequestParam("start") String start,@RequestParam("limit") String limit) throws IOException 
	{ 	
		System.out.println("发放凭证");
		Map<String,Object> model = new HashMap<String, Object>(); 
		//this.srService.generateContractId(record);
		//this.srService.generateContractId(record);
		//this.srService.updateContractHtml(this.srService.updateContractId(record));
		
        model=this.srService.getCheck(start, limit);
        return  (model); 
	} 
	
	@RequestMapping(value = "/updatepz",method=RequestMethod.POST)
	@ResponseBody 	
 	public Map<String,Object> handleUpdatePz(@RequestBody Zcwsignandrecord record) throws IOException 
	{ 	
		System.out.println("生成凭证");
		Map<String,Object> model = new HashMap<String, Object>(); 
		//this.srService.generateContractId(record);
		//this.srService.generateContractId(record);
		//this.srService.updateContractHtml(this.srService.updateContractId(record));
		
        this.srService.updatePzHtml(record);
        model.put("msg", "凭证生成成功");
        return  (model); 
	} 
	
	
	@RequestMapping(value = "/getrecord") //,method=RequestMethod.POST
	@ResponseBody 	
 	public Map<String,Object> handleGetRecord(@RequestParam("start") String start,@RequestParam("limit") String limit) throws IOException 
	{ 	
		System.out.println("备案");
		Map<String,Object> model = new HashMap<String, Object>();   		  
        model=this.srService.getRecord(start, limit);
        return  (model); 
	} 
	
}
