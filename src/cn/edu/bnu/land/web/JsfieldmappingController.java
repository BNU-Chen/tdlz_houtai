package cn.edu.bnu.land.web;

import java.io.IOException;



import java.util.HashMap;
import java.util.List;
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
import cn.edu.bnu.land.service.JsdatafieldService;
import cn.edu.bnu.land.service.JsfieldmappingService;



@Controller
public class JsfieldmappingController {
    private JsfieldmappingService jsfieldmappingService;


    @Autowired
    public JsfieldmappingController(JsfieldmappingService jsfieldmappingService) {
        this.jsfieldmappingService = jsfieldmappingService;
    }
	@RequestMapping(value = "/look_fieldmapping") 
	@ResponseBody 	
	
	public Map<String,Object> handle(@RequestParam("start") String start,
			@RequestParam("limit") String limit) throws IOException 
	{ 
		
		System.out.println("查询字段映射表");

		Map<String,Object>  myList= this.jsfieldmappingService.lookFieldmapping(start, limit);
		
		
        return  (myList);
		
	} 
	
	
	@RequestMapping(value = "/del_fieldmapping") //,method=RequestMethod.POST	
	@ResponseBody 	
	public void handle4(@RequestParam("ids") String ids) throws IOException 
	{ 
	    System.out.println("ids+jsdadafield="+ids);
	    this.jsfieldmappingService.deletefieldmapping(ids);   
	} 
	

}
