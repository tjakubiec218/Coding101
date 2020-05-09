public class Ex1
{
	//Java basically only uses object oriented programming (will learn what this is later)//
	//For now, just think of public class Ex(#) like a file name//

	public static void main(String[] args)
	{

		//the main method, is where all code begins to run in Java
		/*
		 * The most basic way of writing a method is method_name()
		 *                                           {
	
		 *                                           }
		 */
		/* (1) In order to let everything else in the "file" (class) have acess to the main method,
		 you must declare it: public 
		                            */
		/* (2) Every method, unless specified with the "static" keyword, must have an existing object to call said method on.
		 *     Since no object exists at the very start of your program, main must be specified as static.
		 */
		/* (3) void, is the return type of the function. 
		 *     Since the program is done after main finishes. main giving back a value does absolutely nothing  
		 */
		/* (4) String is a combination of letters with any number of spaces you want
		 *     String[] is an "organized box" of many strings where putting 0 in the square brackets refers to the first element
		       "in the box".
		 *     String[] args, is your command line arguments.
		 *     When you run your program on the command line, you can supply certain arguments to influence how your program runs.
		 *     Contrary to earlier statement about strings, on the command line, a space will determine a different argument.
		 */


		//Person.name is how to access the static, name variable
		System.out.println(Person.name);


		//Person.name.length() finds the length of the name variable
		System.out.println(Person.name.length());

		int wacky = 10;
		System.out.println("Java is awesome by a factor of " + wacky);



		/* System.out.println(" Stuff"), works similar to the Person example presented
		 * System is the name of a class present in the java.lang package
		 * out is a static variable (object) present in the System class of type PrintStream
		 * and println is an instance method meaning it can only be called once the out object of type PrintStream exists.

		 * In other words, System loads the system class and creates the out object of type PrintStream,
		 * then the println method is called on the object with whatever String argument
		 */

		//Don't worry about all of this "object" and "method" business yet, it will make more sense when we get to it.

		//Static methods are methods that can be called without any object exisiting

	}

	
}
