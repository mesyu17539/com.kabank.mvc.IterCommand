package com.kabank.mvc.enums;

public enum DDLENUM {
	CREATE_TABLE_MEMBER(){
		public String toString() {
			return "CREATE TABLE "
					+"MEMBER"
					+"("
					+" ID VARCHAR2(20) PRIMARY KEY,"
					+" pass VARCHAR2(20), "
					+" name VARCHAR2(20), "
					+" ssn VARCHAR2(20), "
					+" phone VARCHAR2(20), "
					+" email VARCHAR2(20), "
					+" profile VARCHAR2(20), "
					+" addr VARCHAR2(20) "
					+")";
		}
	},
	CREATE_TABLE_ATTEND(){
		@Override
		public String toString() {
			return "CREATE TABLE "
					+"ATTEND"
					+"("
					+" ID VARCHAR2(20) PRIMARY KEY,"
					+" pass VARCHAR2(20), "
					+" name VARCHAR2(20), "
					+" ssn VARCHAR2(20), "
					+" phone VARCHAR2(20), "
					+" email VARCHAR2(20), "
					+" profile VARCHAR2(20), "
					+" addr VARCHAR2(20) "
					+")";
		}
	},
	CREATE_TABLE_BANK(){
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "create table bank(" + 
					"custonNum varchar2(20) primary key," + 
					"accountNum varchar2(20)," + 
					"money varchar2(20)," + 
					"id varchar2(20)," + 
					"foreign key(id) references member(id) on delete cascade)"
					;
		}
	}
}
