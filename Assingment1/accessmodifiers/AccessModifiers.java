package Assingment1.accessmodifiers;

class A{
	public void publicMethod() {
		System.out.println("public method");
		privateMethod();
	}
	
	private void privateMethod() {  // can be used inside the class
		System.out.println("private method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	void defaultMethod() {
		System.out.println("default method");
	}
}


public class AccessModifiers {

	public static void main(String[] args) {
		A obj = new A();
		obj.publicMethod(); // public method-> can be used from any package or class
		obj.protectedMethod(); // protected method-> mostly used in inheritance. this method can only be used within class,same package,subclass in diff package 
		obj.defaultMethod(); // default method-> can be used by the classes in the same package
	}

}