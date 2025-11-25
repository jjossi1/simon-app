package simon.com.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simon.com.user.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public void insetUserBsc(Map<String, Object>paramMap) {
		userMapper.insetUserBsc(paramMap);
	}
}
