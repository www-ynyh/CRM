package com.sc.entity;

import java.io.Serializable;

public class Message implements Serializable {
	
	String msgCode;
	String msgStatus;
	String msgContent;
	public Message() {
		super();
	}
	public Message(String msgCode, String msgStatus, String msgContent) {
		super();
		this.msgCode = msgCode;
		this.msgStatus = msgStatus;
		this.msgContent = msgContent;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgStatus() {
		return msgStatus;
	}
	public void setMsgStatus(String msgStatus) {
		this.msgStatus = msgStatus;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	
	
	
}
