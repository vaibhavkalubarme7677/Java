package Exception;

import java.io.IOException;

public class test {

void m1 () throws IOException
{
	throw new IOException ("Drive Error");
}

void p()
{
	try
	{
		m1();
		
	}
	catch (Exception e)
	{ 
		System.out.println("Handled");
	}
}
}
