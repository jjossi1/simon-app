package simon.com.user.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import simon.com.user.mapper.UserMapper;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserMapper userMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public void insetUserBsc(Map<String, Object>paramMap) {
		String rawPassword = (String)paramMap.get("password");
		String encodedPassword = passwordEncoder.encode(rawPassword);
		paramMap.put("encodedPassword",encodedPassword);
		userMapper.insetUserBsc(paramMap);
	}
}
