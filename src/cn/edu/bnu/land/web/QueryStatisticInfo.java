package cn.edu.bnu.land.web;

import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.bnu.land.service.UserService;

@Controller
public class QueryStatisticInfo {
	private UserService userService;
    @Autowired
    public QueryStatisticInfo(UserService userService) {
        this.userService = userService;
    }

	@RequestMapping(value = "/QueryStatisticInfo", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> handle(@RequestParam("start") String start,
			@RequestParam("limit") String limit
			) throws IOException {

		// System.out.println("time to getInfoArticleList");
		// System.out.println(start);
		// System.out.println(limit);
		// System.out.println();
		Map<String, Object> mySyncpushList = this.userService.getSyncData(start, limit);
		System.out.println(mySyncpushList.get("total"));
		return (mySyncpushList);
	}
	
}
