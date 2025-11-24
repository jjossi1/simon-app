package simon.com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import simon.com.test.entity.TestEntitiy;

public interface TestRepository extends JpaRepository<TestEntitiy, Integer> {
	List<TestEntitiy> findByTest(String test);
}
