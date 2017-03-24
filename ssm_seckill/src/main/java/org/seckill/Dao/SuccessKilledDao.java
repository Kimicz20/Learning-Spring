package org.seckill.Dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.Entity.Successkilled;

public interface SuccessKilledDao {

	/**
	 * 插入 可避免重复
	 * @param seckillID
	 * @param userPhone
	 * @return
	 */
	int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
	
	/**
	 * 根据id查询
	 * @param seckillID
	 * @return
	 */
	Successkilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
}
