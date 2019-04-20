package com.cloud.common.entity;

import java.io.Serializable;



public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long deptNo;
	private String deptName; 
	private String dbName;
	
	public Dept(String deptName) {
		super();
		this.deptName = deptName;
	}
	
	public Dept () {
		super();
	}

	public Long getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Long deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
	
	
	
	
}
