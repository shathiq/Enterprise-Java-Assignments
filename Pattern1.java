
public class Pattern1 {

	public static void main(String[] args) {
	  int n=10;	
	  for(int i=0;i<n;i++) //Outer Loop
	  {	
		for(int j=0;j<n;j++) // Inner Loop for Printing I
		{
		   if(j==0)
		      System.out.print("*");
		   else
			   System.out.print("");  
		}
		
		System.out.print(" ");
		System.out.print(" ");
		
		for(int j=0;j<n;j++) //Inner Loop for Printing N
		{
		if(j==0 || i==j || j==n-1 )
             	System.out.print("*");
			else
				System.out.print(" ");
              
		}
		
        System.out.print(" ");
        System.out.print(" ");
        
        for(int j=0;j<n;j++) //Inner Loop for Printing E
		{
		if(j==0 || i==0 || i==n-1 || i==(n-1)/2 )
             	System.out.print("*");
			else
				System.out.print(" ");
              
		}
		
        System.out.print(" ");
        System.out.print(" ");
        
        for(int j=0;j<n;j++) //Inner Loop for Printing U
		{
			if(j==0  || j==n-1 || i==n-1)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}
        System.out.print(" ");
        System.out.print(" ");
        
        for(int j=0;j<n;j++) //Inner Loop for Printing R
		{
			if(j==0 || i==0 || j==n-1 && i==n-1 || j==n-1 && i==(n-1/2) || j==n-1 && i==(n/3) || j==n-1 && i==2 ||
					j==n-1 && i==1 || i==(n-1)/2 || j==2 && i==5 || j==4 && i==6 ||j==6 && i==7
					||j==8 && i==8)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}   	
        
        System.out.print(" ");
        System.out.print(" ");
        
        for(int j=0;j<n;j++) //Inner Loop for Printing O
		{
			if(j==0  || j==n-1 || i==n-1 || i==0)
              System.out.print("*");
			else
				System.out.print(" ");
              
		}   	
        
        System.out.print(" ");
        System.out.print(" ");
        
		for(int j=0;j<n;j++) //Inner Loop for Printing N
		{
		if(j==0 || i==j || j==n-1 )
             	System.out.print("*");
			else
				System.out.print(" ");
              
		}
		        		
		System.out.println();
	}
	}

}
