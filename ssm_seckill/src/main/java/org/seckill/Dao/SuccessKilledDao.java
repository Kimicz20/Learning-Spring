package org.seckill.Dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.Entity.Successkilled;

public interface SuccessKilledDao {

	/**
	 * ���� �ɱ����ظ�
	 * @param seckillID
	 * @param userPhone
	 * @return
	 */
	int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
	
	/**
	 * ����id��ѯ
	 * @param seckillID
	 * @return
	 */
	Successkilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
}
