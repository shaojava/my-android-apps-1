package com.java.learning_1;

import java.lang.String;

public class learning_main {
	
	public  T new_method (T a) throws Exception
	{
		T t;
		
		try
		{
			int a_2=(5/0);
		}
		catch (Exception e)
		{
		  System.out.println(e.getMessage());
		}
		
		return t;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args[0]=String.valueOf(10);
		StringBuilder stb=new StringBuilder("this is for test");
		System.out.println(stb.replace(stb.indexOf("for"),(stb.indexOf("for")+"for".length()), new StringBuilder("YES").reverse().toString()));
	 System.out.println(  args.length>0 ? Integer.parseInt(new StringBuilder(args[0]).reverse().toString()): "No");
	 learning_main ln=new learning_main();
	 learning_generic<Integer, Character> ln_gen=new learning_generic<Integer, Character>();
	 ln_gen.calc(10);
	}

}
