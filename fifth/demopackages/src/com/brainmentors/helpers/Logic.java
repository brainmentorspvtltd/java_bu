package com.brainmentors.helpers;

import com.brainmentors.dao.DB;

public class Logic {
	public void businessLogic() {
		DB db = new DB();
		db.read();
		
	}
}
