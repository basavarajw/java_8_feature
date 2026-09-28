public class Main implements Excecutable_FunctionInterface {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Default_Static_methods.staticMethod();
        Default_Static_methods instance = new Default_Static_methods() {};
        instance.defaultMethod();

        MyFunctionalInterface greeter = name -> System.out.println("Greetings dear..!  "  +name+ "  have a nice day!");
        greeter.greet("Darling");
    }

    @Override
    public void execute() {
        System.out.println("Executing from Excecutable_FunctionInterface.");
    }
}

