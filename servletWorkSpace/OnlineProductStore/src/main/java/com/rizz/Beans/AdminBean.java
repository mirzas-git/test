package com.rizz.Beans;
import java.io.*;
@SuppressWarnings("serial")
public class AdminBean implements Serializable{

	private String uName, pWord, fName, lName, address, mailId;
	private long phno;
	
	public AdminBean() {}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getpWord() {
		return pWord;
	}

	public void setpWord(String pWord) {
		this.pWord = pWord;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "AdminBean [uName=" + uName + ", pWord=" + pWord + ", fName=" + fName + ", lName=" + lName + ", address="
				+ address + ", mailId=" + mailId + ", phno=" + phno + "]";
	}
	
	
	
}
