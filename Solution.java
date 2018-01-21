import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int size;
        int ib=0,jb=0,iq=0,jq=0;
        Scanner s=new Scanner(System.in);
		//s.useDelimiter(" ");
        size=s.nextInt();
		s.nextLine();
        char[][] arr=new char[size][size];
		String[] ss=new String[size];
		for(int i=0;i<size;i++)
			ss[i]=s.nextLine();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=ss[i].charAt(j);
                if(arr[i][j]=='m')
                {
                    ib=i;
                    jb=j;
                }
                if(arr[i][j]=='p')
                {
                    iq=i;
                    jq=j;
                }
            }
        }
        if(ib>iq)
        {
            if(jb>jq)
            {
                while(ib>iq && jb>jq)
                {
                    jb--;
                    ib--;
                    System.out.println("UP");
                    System.out.println("LEFT");
                }
            }
            if(jb<jq)
            {
                while(ib>iq && jb<jq)
                {
                    jb++;
                    System.out.println("RIGHT");
                    ib--;
                    System.out.println("UP");
                }
            }
        }
        if(ib<iq)
        {
            if(jb>jq)
            {
                ib++;
                jb--;
                 System.out.println("DOWN");
                    System.out.println("LEFT");
            }
            if(jb<jq)
            {
                ib++;
                jb++;
                 System.out.println("DOWN");
                    System.out.println("RIGHT");
            }
        }
        
    }
}