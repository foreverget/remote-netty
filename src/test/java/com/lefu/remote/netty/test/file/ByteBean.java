package com.lefu.remote.netty.test.file;

public class ByteBean {
	private byte[] content;
	private int position;
	private int length;
	
	public ByteBean() {
		
	}
	
	public ByteBean(int position, int length, byte[] content) {
		this.position = position;
		this.length = length;
		this.content = content;
	}
	
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
