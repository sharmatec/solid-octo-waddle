package Demo.Test;


class Demo1{
	
	public void meth() { 
		
			
			int a[]=new int[6];
			a[5]=12;
			int i= 4;
			int j=0;
			int k;
			try {
			k= i/j;
			if (k==0)
			  throw new SakethException("not po");
			System.out.println("wow"+k);
			
		}
		catch(SakethException e)
		{
			System.out.println("bye"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("no array");
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		finally 
		{
			System.out.println("wow");
		}
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 dm=new Demo1();
		dm.meth();
		
		
		
	}

}
