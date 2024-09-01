package com.StringBufferConstructor;

public class StringCapacity {

	public static void main(String[] args) {
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("123456789123456789");
System.out.println(sb.capacity());
	}

}
