public class Dog extends Animal {
    public Dog(){
        // 1.invokes the parent constructor, 
       // 2. not mandatory
       //3. If a constructor does not explicitly invoke a superclass constructor, 
        //the Java compiler automatically inserts a call to the no-argument constructor of the superclass. 
        //If the superclass does not have a no-argument constructor, you will get a compile-time error.      
        super();
        System.out.println("Its a dog");
    }

    public void Bark() {
        System.out.println("Dog Barks");
    }

    public void sleep() {
        System.out.println("Dog Sleeps");
    }
}
