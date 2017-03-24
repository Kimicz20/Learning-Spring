package org.seckill.Service;

import java.util.List;

import org.seckill.Dto.Exposer;
import org.seckill.Dto.SeckillExecution;
import org.seckill.Entity.Seckill;
import org.seckill.Exception.RepeatKillException;
import org.seckill.Exception.SeckillCloseException;
import org.seckill.Exception.SeckillException;

/**
 * 秒杀服务接口
 * @author geek
 *
 */
public interface SerkillService {

	/*
	 * 查询所有的秒杀商品
	 */
	List<Seckill> getSeckillList();
	
	/*
	 * 查询单个秒杀商品
	 */
	Seckill getSkillById(long seckillId);
	
	/*
	 * 秒杀开启是否暴露秒杀商品的地址
	 * 否则输出系统时间和秒杀时间
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/*
	 * 执行秒杀
	 */
	SeckillExecution executeSeckill(long  seckillId,long userPhone,String md5) 
			throws SeckillException,RepeatKillException,SeckillCloseException;
}
