import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gym.model.User;

public class TestStudent {
	@Test
	public void testStudent() {
		User user = new User();
		user.setName("Rajendra");
		String name = user.getName();
		assertEquals("Rajena",name);
		
	}

}
