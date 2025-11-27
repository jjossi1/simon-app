package simon.com.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import simon.com.user.service.UserService;

@RequiredArgsConstructor
@RestController
public class UserController {
	
	private final UserService userService;
	
	
	@PostMapping("/api/user/insertUser")
	private Map<String, Object> insertUserBsc(@RequestBody Map<String, Object> requestMap){
		Map<String, Object> responseMap = new HashMap<String, Object>();
		userService.insetUserBsc(requestMap);
		return responseMap;
	}
}
