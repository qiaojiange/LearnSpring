package com.qjg.dao;

import com.qjg.bean.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class DBUtil {
    private List<User> dbList;


	public List<User> getDbList() {
		return dbList;
	}

	public void setDbList(List<User> dbList) {
		this.dbList = dbList;
	}

	public int  getSize(){
		if (dbList != null){
			return dbList.size();
		}
		return 0;
	}
}
