
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=10,k=4;
		for(int i=0;i<m;i++) {
			for(int j=0;j<k;j++) {
				if ((j==0 && i>m/2-k/2+1)||(j==k-1&& i>m/2-k/2+1)|| (i==m/2-k/2+1)||(i==0&&(j==0||j==k-1))||(i==(m/2-k/2+1)-1&&(j==0||j==k-1))) System.out.print(" ");
				else	System.out.print("*");
				if(j==k-1)System.out.print("      ");
			}
			 int a=11;
			for(int j=0;j<m;j++) {
				if(j==0 || j==m-1 || i==j) System.out.print("*");
				else System.out.print(" ");
				if(j==m-1)System.out.print("  ");
			}
			int e=m;
			for(int j=0;j<e;j++) {
				if((i==0&&j==0)||(i==m-1&&j==0))System.out.print(" ");
				else if ((j==0)||(i==0||i==m-1||i==(m-1)/2)) System.out.print("*");
				else	System.out.print(" ");
				if(j==e-1)System.out.print("  ");
			}
			int u=m;
			for(int j=0;j<u;j++) {
				if((i==m-1&&j==0)||(i==m-1 &&j==u-1))System.out.print(" ");
				else if ((j==0)||(j==u-1)||(i==m-1)) System.out.print("*");
				else	System.out.print(" ");
				if(j==u-1)System.out.print("  ");
			}
			int r=m;
			for(int j=0;j<r;j++) {
				if((i==0&&j==r-1)||(i==(m-1)/2 &&j==r-1)||(i==((m-1)/2)+1 &&j==r-1))	System.out.print(" ");
			    else if ((j==0)||(j==r-1)||(i==0)||(i==(m-1)/2)||(i==((m-1)/2)+1 &&j==r-2)) System.out.print("*");
				else	System.out.print(" ");
				if(j==r-1)System.out.print("  ");
			}
			int o=m;
			for(int j=0;j<r;j++) {
				if((i==0&&(j==0||j==o-1))||(i==m-1&&(j==0||j==o-1)))	System.out.print(" ");
			    else if ((j==0)||(j==o-1)||i==0||i==m-1) System.out.print("*");
				else	System.out.print(" ");
				if(j==o-1)System.out.print("  ");
			}
			
			for(int j=0;j<m;j++) {
				if(j==0 || j==m-1 || i==j) System.out.print("*");
				else System.out.print(" ");
				if(j==m-1)System.out.print("  ");
			}
			System.out.println();
		}
		
		
		int z=4;
		for(int i=1;i<=z;i++) {
			for(int j=0;j<z;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		int n=13;
		System.out.println("   ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( i==0 || i==n-1 || j==0 || j==n-1 || i+j<=(n-1)/2&&i<(n-1)/2 &&j<(n-1)/2 || j-i>=(n-1)/2
						&& j>(n-1)/2&&i<(n-1)/2) 
					System.out.print("*");
				else System.out.print(" ");
				if(j==n-1) System.out.print("    ");
			}
			
			for(int j=0;j<n;j++) {
				if( i-j>=(n-1)/2 &&i>=(n-1)/2 && j<=(n-1)/2   || i+j>=(n-1)+(n-1)/2 && i>=(n-1)/2 && j>=(n-1)/2 || i==n-1
						) 
					System.out.print("*");
				else System.out.print(" ");
				if(j==n-1) System.out.print("    ");
			}
			
			for(int j=0;j<n;j++) {
				if(
						i+j<=(n-1)/2 && i<(n-1)/2 && j<(n-1)/2 || i-j>=(n-1)/2 &&i>(n-1)/2 && j<(n-1)/2 ||i==0
						||j==0||i==n-1) 
					System.out.print("*");
				else System.out.print(" ");
				if(j==n-1) System.out.print("    ");
			}
			
			System.out.println();
		}

	}

}
