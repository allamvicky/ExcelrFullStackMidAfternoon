class F 
{
	int i;

	F()
	{
		System.out.println("F()");
		i = 10;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println("done");
	}
}

// ned of cnstructr.
// used to intialize the object.
// non -static members can be used vthout any reference variable in the non-static context.
//