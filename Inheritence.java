public class Inheritence {

    public static void main(String[] args){
        Animal a = new Animal();
        a.sleep();
        a.eat();
        Dog d = new Dog();
        d.Bark();
        d.sleep();
        d.eat();
    }
}

/* output
New Animal created
Animal Sleeps
Animal Eats
New Animal created
Its a dog
Dog Barks
Dog Sleeps
Animal Eats*/