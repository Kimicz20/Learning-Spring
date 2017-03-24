package DaoTest;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.seckill.Dao.SeckillDao;
import org.seckill.Entity.Seckill;

public class SeckillDaoTest extends UtilBaseTest {

	@Resource
	private SeckillDao seckillDao;

	@Test
	public void queryById() throws Exception {
		long seckillId = 1000;
		Seckill seckill = seckillDao.queryById(seckillId);
		System.out.println(seckill.getName());
		System.out.println(seckill);
	}

	@Test
	public void queryAll() throws Exception {

		List<Seckill> seckills = seckillDao.queryAll(0, 100);
		for (Seckill seckill : seckills) {
			System.out.println(seckill);
		}
	}

	@Test
	public void reduceNumber() throws Exception {

		long seckillId = 1000;
		Date date = new Date();
		int updateCount = seckillDao.reduceNumber(seckillId, date);
		System.out.println(updateCount);

	}

}
