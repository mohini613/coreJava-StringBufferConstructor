package com.StringBufferConstructor;

public class StringS {

	public static void main(String[] args) {
String s= new String("Hello");
//String s1= new String ("Hello");
StringBuffer sb= new StringBuffer(s);
sb.append("java");
System.out.println(sb);
	}

}
