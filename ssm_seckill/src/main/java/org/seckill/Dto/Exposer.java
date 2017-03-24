package org.seckill.Dto;

/**
 * 暴露秒杀地址DTO
 * @author geek
 *
 */

public class Exposer {

	//是否暴露秒杀地址
	private boolean exposed;
	
	private long seckillId;
	
	//一种加密措施
	private String md5;
	
	//系统的当前时间(毫秒)
	private long mow;
	
	private long start;
	
	private long end;

	public Exposer(boolean exposed, long seckillId, String md5) {
		super();
		this.exposed = exposed;
		this.seckillId = seckillId;
		this.md5 = md5;
	}

	public Exposer(boolean exposed, long mow, long start, long end) {
		super();
		this.exposed = exposed;
		this.mow = mow;
		this.start = start;
		this.end = end;
	}

	public Exposer(boolean exposed, long seckillId) {
		super();
		this.exposed = exposed;
		this.seckillId = seckillId;
	}

	public boolean isExposed() {
		return exposed;
	}

	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public long getMow() {
		return mow;
	}

	public void setMow(long mow) {
		this.mow = mow;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}
	
}
