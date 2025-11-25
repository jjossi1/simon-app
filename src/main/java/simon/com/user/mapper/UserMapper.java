package simon.com.user.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	
	int insetUserBsc(Map<String, Object> map);
	
}
