package Training;

public class Pattern_Triangle_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int x=1;int y=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=x;k>1;k--) {
				
				System.out.print(k);
			}
			x++;
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=3;i++)
		{
		
			for(int j=1;j<=i+1;j++) {
				System.out.print(" ");	
			}
			
			for(int k=y;k>1;k--) {
				
				System.out.print(k);
			}
			
			for(int j=1;j<=y;j++) {
				System.out.print(j);	
			}
			
			y--;
			System.out.println();
			
		}
		
		
		
	}

}