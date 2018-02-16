package org.girmiti.javaassignment;
interface Display{
	public void method();
}

public class MyInterface implements Display{

	@Override
	public void method() {
		System.out.println("this is quite boring....I'm loving it");
	}

	public static void main(String[] args) {
		MyInterface my=new MyInterface();
		my.method();
	}
}
