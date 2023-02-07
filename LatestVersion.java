package version;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class LatestVersion {
	static String str1= "109.0.5414.75";
	public int VersionCheck(String version1,String version2)
	{
		String[] arrversion1=version1.split("\\.");
		String[] arrversion2=version2.split("\\.");
		int i=0;
		while(i<arrversion2.length || i<arrversion1.length)
		{
			if(i<arrversion2.length&& i<arrversion1.length)
			{
				if(Integer.parseInt(arrversion2[i])>Integer.parseInt(arrversion1[i]))
				{
					return -1;
				}
				else if(Integer.parseInt(arrversion2[i])>Integer.parseInt(arrversion1[i])){
					return 1;
				}
			}
			else if(i<arrversion2.length)
			{
				if(Integer.parseInt(arrversion2[i])!=0)
				{
					return 1;
				}
			}
			else if(i<arrversion1.length)
			{
				if(Integer.parseInt(arrversion1[i])!=0)
				{
					return -1;
				}
			}
			i++;
		}
		return 0;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the language version");
		String sr=sc.nextLine();
		LatestVersion obj=new LatestVersion();
		int a=obj.VersionCheck(str1,sr);
		if(a==1)
		{
			System.out.println("higher version");
		}
		else if(a==-1)
		{
			System.out.println("lower version");
		}
		else
		{
			System.out.println("same version");
		}
		sc.close();
	}
}
