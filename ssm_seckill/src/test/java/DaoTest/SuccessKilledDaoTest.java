package DaoTest;

import javax.annotation.Resource;
import org.junit.Test;
import org.seckill.Dao.SuccessKilledDao;
import org.seckill.Entity.Successkilled;

public class SuccessKilledDaoTest extends UtilBaseTest {

	@Resource
	private SuccessKilledDao successkilledDao;

	@Test
	public void testInsertSuccessKilled() throws Exception {
		long id = 1001L;
		long phone =123L;
		int n = successkilledDao.insertSuccessKilled(id,phone);
		System.out.println("InsertSuccessKilled :"+n);
	}
	
	@Test
	public void queryByIdWithSeckill() throws Exception {
		long id = 1001L;
		long phone =123L;
		Successkilled n = successkilledDao.queryByIdWithSeckill(id,phone);
		System.out.println(n.getSeckill());
	}
}
