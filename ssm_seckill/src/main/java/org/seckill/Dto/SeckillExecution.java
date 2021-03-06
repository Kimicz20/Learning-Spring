package org.seckill.Dto;

import org.seckill.Entity.Successkilled;
/**
 * 秒杀执行后结果
 * @author geek
 *
 */
public class SeckillExecution {

	private long seckillId;
	
	//秒杀执行结果状态
	private int state;
	
	//结果状态描述
	private String stateInfo;

	//秒杀成功对象
	private Successkilled successKilled;
	
	public SeckillExecution(long seckillId, int state, String stateInfo, Successkilled successKilled) {
		super();
		this.seckillId = seckillId;
		this.state = state;
		this.stateInfo = stateInfo;
		this.successKilled = successKilled;
	}

	public SeckillExecution(long seckillId, int state, String stateInfo) {
		super();
		this.seckillId = seckillId;
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public Successkilled getSuccessKilled() {
		return successKilled;
	}

	public void setSuccessKilled(Successkilled successKilled) {
		this.successKilled = successKilled;
	}

	
}
