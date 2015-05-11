package w3d1;

public class TriangleNumber {
public static void main(String args[])
{
	System.out.println("Triangle Numner for input 3" + triangle(3));
}
static int triangle(int n)
{
	if(n==1)
        return 1;
     else
        return  ( n + triangle(n-1) );
}

}
