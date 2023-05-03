package com.sist.lib;

public class 연습장 {

	public static void main(String[] args) {
		int a=1;
		int b=10;
		int[] x= {};
		String c="";
        for(int i=a;i<=b;i++)
        {
            for(int j=1;j<=63;j++)
            {
            	c=Integer.toBinaryString(j);
                if(i%Integer.parseInt(c)==0 && i%5==0)
                {
                    System.out.println(i);
                }
            }
        }
		
	}
}
