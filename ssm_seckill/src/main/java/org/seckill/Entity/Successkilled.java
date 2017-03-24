package org.seckill.Entity;

import java.util.Date;

public class Successkilled {

	/*
	 * 秒杀商品ID
	 */
	private long seckillId;

	/*
	 * 用户手机号
	 */
	private long userPhone;

	/*
	 * 状态标识:-1:无效 0:成功 1:已付款 2:已发货
	 */
	private short state;

	/*
	 * 创建时间
	 */
	private Date createTime;

	private Seckill seckill;

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public short getState() {
		return state;
	}

	public void setState(short state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Seckill getSeckill() {
		return seckill;
	}

	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}

}
