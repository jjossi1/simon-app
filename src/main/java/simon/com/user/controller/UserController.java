package simon.com.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import simon.com.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/api/user/insertUser")
	private Map<String, Object> insertUserBsc(@RequestBody Map<String, Object> requestMap){
		Map<String, Object> responseMap = new HashMap<String, Object>();
		userService.insetUserBsc(requestMap);
		return responseMap;
	}
}
