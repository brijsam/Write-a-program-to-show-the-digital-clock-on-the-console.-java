class A
{
int sec=0,hour=0,min=0;
  public void show()
	{
    while(hour<24)
	{
	System.out.print("\b\b\b\b\b\b\b\b");
		sec++;
	if(sec==60)
		{
		min++;
		sec=0;
		}
	if(min==60)
		{
		hour++;
		min=0;
		}
	if(hour==24)
		{
		hour=min=sec=0;
		}
	System.out.print(hour+":"+min+":"+sec);
	try 
	{
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	
	}
	}
}

class B extends Thread
{
	A msg;
	B(A s)
	{
	msg =s;
	}
  public void run()
	{
	msg.show();
	}
}
class C
{
  public static void main(String...k)
	{
	A ob = new A();
	B ob1 = new B(ob);
	ob1.start();
	}
}