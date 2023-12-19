class B 
{
	B()
	{
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("done");
	}
}
// we can also create the constructor 
// constructor should be with in  a class and outside of any method.
// if we are keeping atleast one explict constructor,compiler will not be keeping no arg default constructor.
// constructors are treated as a special type of methods internally,but they are not normal methods. there is a difference b/w  constructors and methods. 
// constructors are going to be invoked while  we are creating the object.
// compulsary there should be an object creation to invoke the constructor, in the beggining.
// metods r going to be invoke whervevr we call them.
        // rules for cnstructrs
//1. should be same class.(case-sensitive)
// 2. there is no return type for a cnstructr.
// 3 compilsary cnstructrs should be concrete , or, defined, or implemented.it should be having atleast {}, i.e body.

  

  // what r all the similarities b/w the cnstructrs nd methods.
  // parameter (can be anything nd any no.of numbers).
  // both cnstructrs nd methods having body.
  // concrete r defined one.
  // access specifier
  // we can  have any no.of cnstructrs nd methods ina class bt args ,ust be different( for a group of cnstrucrs,for a grouo of methods)
  // 