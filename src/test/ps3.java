package test;

public class ps3 extends ps4 {
	int a;
	public ps3(int i)
	{
		super(i);
		this.a=i;
	}
	
	public int increment()
	{
		a=a+1;
		return a;
	}
}
