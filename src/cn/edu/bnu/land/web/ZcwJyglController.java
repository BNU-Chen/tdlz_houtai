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
import cn.edu.bnu.land.service.ZcwJyglService;


@Controller
public class ZcwJyglController {
    private ZcwJyglService jyglService;
    private Encoder codechange;
    @Autowired
    public ZcwJyglController(ZcwJyglService jyglService) {
        this.jyglService = jyglService;
    }
	@RequestMapping(value = "/getoverage") //,method=RequestMethod.POST
	@ResponseBody 	
	public Map<String,Object> getOverAge() throws IOException 
	{ 	
		System.out.println("进入getovercontroller");
		
        return  this.jyglService.getTicketInfo();
		 
	} 
	
}
