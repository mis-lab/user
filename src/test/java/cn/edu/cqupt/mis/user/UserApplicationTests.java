package cn.edu.cqupt.mis.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = UserApplication.class)
public class UserApplicationTests {

    @Test
    public void contextLoads() {
    }

}
