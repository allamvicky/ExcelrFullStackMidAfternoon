class Dog
{
	String name, bread, gender, color;
	int age;
	double height, weight;


	Dog(String dogname, String dogbreed, String doggender, String dogcolor, int dogage, double dogheight, double dogweight)
	{
        System.out.println("intializing dog object: begins");
		name = dogname;
		breed = dogbreed;
		gender = doggender;
		color = dogcolor;
		age = dogage;
		height = dogheight;
		weight = dogweight;
		System.out.println("intializing dog object: completed");
	}

	//behaviour
	void bark()
	{
		System.out.println("This dog barks!");
	}
	void bite()
	{
		System.out.println("This dog bites!!");
	}

		public static void main(String[] args) 
	{
		System.out.println("main begin");
		Dog d1 = new Dog("charlie", "lab", "male", "brown", 2, 2.8, 5.8);
		System.out.println("Name: " + d1.name + "Breed: " + d1.breed + "Color: " + d1.color + "Age: " + d1.age + "Height: " + d1.height + "Weight: " + d1.weight);
		System.out.println("main end");
	}
}
