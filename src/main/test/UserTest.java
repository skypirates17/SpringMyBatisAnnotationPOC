import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poc.dto.DataTransferObject;
import com.poc.model.User;
import com.poc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springconfig/dispatcher-servlet.xml")
public class UserTest {
	@Autowired
	private UserService userService;
	
	@After
	public void destroy() {
		userService = null;
	}
	

	public void testSingleCRUD() {
		//test insert single record
		DataTransferObject dto = new DataTransferObject();
		User user = new User();
		user.setId(33);
		dto.setUser(user);
		
		DataTransferObject dtoresponse = userService.fetch(dto);
		
		System.out.println(dtoresponse.getUser().getAddress()+dtoresponse.getUser().getAge()+dtoresponse.getUser().getName());
	}
	

	public void testUpdate(){
		DataTransferObject dto = new DataTransferObject();
		User user = new User();
		user.setId(22);
		user.setAge("25");
		user.setName("JOHN REY");
		user.setAddress("ALABAMA");
		dto.setUser(user);
		
		userService.update(dto);
	}
	
	@Test
	public void testinsert(){
		DataTransferObject dto = new DataTransferObject();
		User user = new User();
		user.setAge("25");
		user.setName("JOHN REY2");
		user.setAddress("ALABAMA2");
		dto.setUser(user);
		
		userService.insert(dto);
	}
}
