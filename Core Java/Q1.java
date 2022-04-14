abstract class abstractClass{
	public abstract void message();

	public void messageabst(){
		System.out.println("Hello from non abstract method in abstract class");
	}
}

interface interfaceDemo{
	public void greet(String name);
}


class someClass extends abstractClass implements interfaceDemo{

	@Override
	public void greet(String name) {
		System.out.println("Namaste! "+name);
	}

	public void message(){
		System.out.println("implementing abstract method");
		messageabst();
	}
}

class Question1{
	public static void main(String args[])
	{
		someClass s = new someClass();
		s.greet("Rakshit");
		s.message();
	}	
}