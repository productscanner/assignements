package org.jnit.generics;

public class GenericClassDemo<T> {

	  private T t;

	  public void add(T t) {
	    this.t = t;
	  }

	  public T get() {
	    return t;
	  }

	  public static void main(String[] args) {
		  
		  GenericClassDemo<String> stringGenDemo = new GenericClassDemo<String>();
		  GenericClassDemo<Integer> intGenDemo = new GenericClassDemo<Integer>();
		  
		  stringGenDemo.add(new String("Generic Class Demo"));
		  System.out.printf("String Value :%s\n\n\n\n", stringGenDemo.get());
		  
		  intGenDemo.add(new Integer(23));
          System.out.printf("Integer Value %d", intGenDemo.get());
	  
	  }
	}