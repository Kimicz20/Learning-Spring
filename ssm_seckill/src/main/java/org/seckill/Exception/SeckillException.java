package org.seckill.Exception;
/**
 * ���е���ɱ�쳣
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
