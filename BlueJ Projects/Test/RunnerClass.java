public class RunnerClass {
    public static void main(String[] args){
        Cat cat1 = new Cat("orange", 41, "Garfeild");
        System.out.println(cat1.age);
        cat1.grow();
        System.out.println(cat1.age);
    }
}