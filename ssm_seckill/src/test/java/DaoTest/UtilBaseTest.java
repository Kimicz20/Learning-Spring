package DaoTest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * 测试类：需要整合spring与Junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
/*
 * spring配置文件
 */
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })

public class UtilBaseTest {

}
