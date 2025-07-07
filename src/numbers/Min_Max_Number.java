package numbers;

public class Min_Max_Number{
	public static void main( String[] args ){
	 int min =minAndMax( 9,8 );
	 int max =minAndMax( 10,9 );
		System.out.println( "min = " + min );
		System.out.println( "max = " + max );

	}
	public static int minMaxNumber(int num1, int num2){
		if(num1<num2){
			return num1;
		}else if( num2>num1 ){
			return num2;
		}else {
			return -1;
		}
	}
	
	public static int minAndMax(int num3, int num4){
		if(num3< num4){
			return num3;
		}else if( num4>num3 ){
			return num4;
		} else {
			return -1;
		}
	}
}

       /*
    Create a method named min or max value that can return the minimum number between two numbers
     */
