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
import cn.edu.bnu.land.service.UserService;
import cn.edu.bnu.land.service.ZcwSellService;


@Controller
public class ZcwSellController {
    private ZcwSellService sellService;
    private Encoder codechange;
    @Autowired
    public ZcwSellController(ZcwSellService sellService) {
        this.sellService = sellService;
    }
	@RequestMapping(value = "/zbdjsh") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> handleZbsh(@RequestParam("start") String start,@RequestParam("limit") String limit) throws IOException 
	{ 	
		System.out.println("����zbdjsh����");
		Map<String,Object> model = new HashMap<String, Object>();   		  
        model=this.sellService.getSellInfo(start, limit);
        return  (model);
		 
	} 
	
	@RequestMapping(value = "/getzbdjxx") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> getZbXX(@RequestParam("ticketid")String ticketid) throws IOException 
	{ 	
		System.out.println("����zbdjxx����");
		
        return  this.sellService.getZbxx(ticketid);
		 
	} 
	@RequestMapping(value = "/getdkfkxx") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> getFkXX(@RequestParam("ticketid")String ticketid) throws IOException 
	{ 	
		System.out.println("����getfkxx����");
		
        return  this.sellService.getFkxx(ticketid);
		 
	} 
	
	@RequestMapping(value = "/getselldagl") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> getDagl(String ticketid,String date1,String date2,String checkstate,String start,String limit) throws IOException 
	{ 	
		System.out.println("����getdagl����");
		String check=codechange.encode(checkstate);
				
        return  this.sellService.getDagl(ticketid, date1, date2, check, start, limit);
		 
	} 
}
