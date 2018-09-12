import java.io.*;

class Q1
{
	public static void main(String x[])
	{
		File f1 = new File("D:/java/Acadview/12-9-18/abc.txt");
		File f2 = new File("D:/java/Acadview/12-9-18/xyz.txt");
		
		try
		{
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			
			int i;
			i = fin.read();
			
			while(i != -1)
			{
			fout.write((char)i);
			i = fin.read();
			
			}
			System.out.println("File Copied Successfully ");
		fin.close();
		fout.close();	
		}	
		
		catch(IOException e)
		{
		System.out.println(e);
		}
		
		try
		{
			System.out.print("Content of xyz.txt : ");
			FileInputStream fi = new FileInputStream(f2);
			int j = 1;
			j = fi.read();
			while(j != -1)
			{
			System.out.print((char)j);
			j = fi.read();
			}
			fi.close();
		}
		
		
		catch(IOException ee)
		{
		System.out.println(ee);	
		}
		
		
	}
	
}