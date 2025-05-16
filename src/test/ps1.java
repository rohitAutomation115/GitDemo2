package test;

import org.testng.annotations.Test;

public class ps1 extends ps2 {
	
		int x=4;
		@Test
		public void demo1()
		{
			doThis();
			ps3 p3=new ps3(x);
			System.out.println(p3.increment());
			
			System.out.println(p3.mul3());
			
		}
		
		
		
		
		
}
