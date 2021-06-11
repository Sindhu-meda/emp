package com.cg1;

import org.springframework.stereotype.Component;

@Component
public class SBU
{
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	public int getSbuId() {
		return sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	
	
}
