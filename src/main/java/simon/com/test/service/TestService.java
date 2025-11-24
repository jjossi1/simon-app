package simon.com.test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simon.com.test.mapper.TestMapper;
import simon.com.test.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	@Autowired
	private TestRepository testRepository;
	
	public Map<String, Object> selectTest(){
		return testMapper.selectTest();
	}
	
	public Map<String ,Object> selectTestJPA(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("test", testRepository.findByTest("simon"));
		return param;
				
	}
}
