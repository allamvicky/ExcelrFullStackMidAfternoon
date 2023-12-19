class Q 
{
	static
	{
		System.out.println("Q-ISB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Q-main");
	}
}
//-SIB( static intializer block)
//-we can have no.of static blocks.
//-all the ststic blocks will be executed from top to bottom only once for one execution. before the main method.
//- static block should be outside the main method or any other method but within the class.
//-