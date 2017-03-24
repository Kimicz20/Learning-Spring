package org.seckill.Service;

import java.util.List;

import org.seckill.Dto.Exposer;
import org.seckill.Dto.SeckillExecution;
import org.seckill.Entity.Seckill;
import org.seckill.Exception.RepeatKillException;
import org.seckill.Exception.SeckillCloseException;
import org.seckill.Exception.SeckillException;

/**
 * ��ɱ����ӿ�
 * @author geek
 *
 */
public interface SerkillService {

	/*
	 * ��ѯ���е���ɱ��Ʒ
	 */
	List<Seckill> getSeckillList();
	
	/*
	 * ��ѯ������ɱ��Ʒ
	 */
	Seckill getSkillById(long seckillId);
	
	/*
	 * ��ɱ�����Ƿ�¶��ɱ��Ʒ�ĵ�ַ
	 * �������ϵͳʱ�����ɱʱ��
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/*
	 * ִ����ɱ
	 */
	SeckillExecution executeSeckill(long  seckillId,long userPhone,String md5) 
			throws SeckillException,RepeatKillException,SeckillCloseException;
}
