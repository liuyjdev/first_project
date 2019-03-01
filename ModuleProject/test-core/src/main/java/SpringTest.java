import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author liuyingjie
 * @Description spring测试
 * @create 2019-03-01 16:12
 */
@Controller
public class SpringTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationt.xml");
}