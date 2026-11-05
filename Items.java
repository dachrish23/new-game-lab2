package sample2;

import java.io.Serializable;

public class Items implements Serializable{
	private static final long serialVersionUTD=1L;
	private String itemName;
	private boolean carries;
	
	public void use() {
		game1.print("cannot be used");
	}
	
	public void open() {
		game1.print("no place to open here");
	}
	
	public void close() {
		game1.print("no place to close this");
	}
	
	public void read() {
		game1.print("nothing meaningful");
	}
	
	
	public Items(String n) {
		this(n, false);
	}
	
	public Items(String in, boolean carry) {
		itemName=in;
		carries=carry;
		
	}


	public boolean isCarries() {
		return carries;
	}
	public void setCarries(boolean carries) {
		this.carries = carries;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String in) {
		this.itemName = in;
	}
	public String toString() {
		return itemName;
	}
	
}
