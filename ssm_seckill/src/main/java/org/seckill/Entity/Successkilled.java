package org.seckill.Entity;

import java.util.Date;

public class Successkilled {

	/*
	 * ��ɱ��ƷID
	 */
	private long seckillId;

	/*
	 * �û��ֻ���
	 */
	private long userPhone;

	/*
	 * ״̬��ʶ:-1:��Ч 0:�ɹ� 1:�Ѹ��� 2:�ѷ���
	 */
	private short state;

	/*
	 * ����ʱ��
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
