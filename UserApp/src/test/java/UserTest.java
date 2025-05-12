import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void testUserConstructor() {
        User user = new User("user1", "user1@cmucs246.com");
        // So sánh đúng với email, vì bạn đang gọi getEmail()
        assertEquals("user1@cmucs246.com", user.getEmail());
    }

    public void testSetEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.setEmail("newemail@cmucs246.com");
        assertEquals("newemail@cmucs246.com", user.getEmail());
    }

    public void testUpdateEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.updateEmail("updatedemail@cmucs246.com");
        assertEquals("updatedemail@cmucs246.com", user.getEmail());
    }
}
