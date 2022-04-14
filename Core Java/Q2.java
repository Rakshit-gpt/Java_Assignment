class encapsulateExample{
	private String name="Abhi";

	//setter method
	public void setName(String name){
		this.name = name;
		System.out.println("Name changed successfully.");
	}

	// getter method
	public void getName(){
		System.out.println("Present Name: " + this.name);
	}

}

class Question2{
	public static void main(String args[]){
		encapsulateExample e = new encapsulateExample();
		e.getName();
		e.setName("Rakshit");
		e.getName();
	}
}