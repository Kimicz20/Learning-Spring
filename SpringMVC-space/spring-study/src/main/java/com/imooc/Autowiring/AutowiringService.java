package com.imooc.Autowiring;

public class AutowiringService {

	public AutowiringDAO autowiringDAO;

	
	public AutowiringService(AutowiringDAO autowiringDAO) {
		this.autowiringDAO = autowiringDAO;
	}

//	public void setAutowiringDAO(AutowiringDAO autowiringDAO) {
//		this.autowiringDAO = autowiringDAO;
//	}
//	
	public void say(String name){
		autowiringDAO.say(name);
	}
}
