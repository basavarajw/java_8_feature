public interface Default_Static_methods {

    default void defaultMethod() {
        System.out.println("This is a default method block to excecute.");
    }

    static void staticMethod() {
        System.out.println("This is a static method block to excecute.");
    }
    
} 
