package code.practise.WebExample;

public class AnonymousGreetings {

	interface HelloWorld {
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void sayHello(){
		class EnglishGreeting implements HelloWorld {
			String name = "User";
			public void greet(){
				greetSomeone(name);
			}
			
			public void greetSomeone(String someone){
				name = someone;
				System.out.println("Hello: "+name);
			}
		}
	HelloWorld englishGreeting = new EnglishGreeting();
	
	HelloWorld frenchGreeting =  new HelloWorld() {
		String name = "mundo";
		public void greet(){
			greetSomeone(name);
		}
		
		public void greetSomeone(String someone){
			name = someone;
			System.out.println("Hello in French: "+name);
		}
		
	};
	HelloWorld spanishGreeting = new HelloWorld(){
		String name = "Mundo";
		
		public void greet (){
			greetSomeone(name);
		}
		
		public void greetSomeone(String someone){
			name = someone;
			System.out.println("Holla amigo: "+name);
		}
	};
	
	englishGreeting.greet();
	frenchGreeting.greetSomeone("Fred");
	spanishGreeting.greet();
	
	}
	
	public static void main(String[] args) {
		AnonymousGreetings greeting = new AnonymousGreetings();
		greeting.sayHello();
	}
}
