package simon.com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test", schema = "simon")  
public class TestEntitiy {
	
	@Id
	@Column(name = "test_id")
	private int testId;

	@Column(name = "test")
	private String test;
	
	
	
	public int getTestId() { return testId; }
	public void setTestId(int testId) { this.testId= testId; }
	
	public String getTest() { return test; }
    public void setTest(String test) { this.test= test; }
}
