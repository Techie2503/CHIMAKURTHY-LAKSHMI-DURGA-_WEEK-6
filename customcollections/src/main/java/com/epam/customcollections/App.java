package com.epam.customcollections;
public class App 
{
    public static void main( String[] args )
    {
    	DList<Integer> list = new DList<>();
    	 
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(11);
        list.add(16);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
        System.out.println(list.size());
    }
}
