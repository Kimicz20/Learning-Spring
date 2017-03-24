package org.seckill.Exception;
/**
 * 所有的秒杀异常
 * @author geek
 *
 */
@SuppressWarnings("serial")
public class SeckillException extends RuntimeException {

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillException(String message) {
		super(message);
	}

}
