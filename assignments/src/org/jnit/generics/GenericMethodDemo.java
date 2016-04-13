package org.jnit.generics;

public class GenericMethodDemo
{
   // Generic method displayArgument                         
   public static < T > void displayArgument( T element )
   {
	   System.out.println( element);
    }

    public static void main( String[] args )
    {
       
        Integer i = 1;
        Double d = 6.4;
        Character c = 'a';

        displayArgument(i);
        
        displayArgument(d);
        displayArgument(c);
    } 
}