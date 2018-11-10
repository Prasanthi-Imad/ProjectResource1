package com.cg.emp.bean;

import java.io.Serializable;



public class Employee implements Serializable {
	
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Integer eid;
		private String ename;
		private Double sal;
		private String dept;
		
		
		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public Double getSal() {
			return sal;
		}

		public void setSal(Double sal) {
			this.sal = sal;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal
					+ ", dept=" + dept + "]";
		}

		
		
	}

