class K 
{
	void test1()
	{
		System.out.println("from test1");
	}
    static void test2() 
	{
		k obj = new K();
		obj.test1();
		System.out.println("from test2");
	}
}
