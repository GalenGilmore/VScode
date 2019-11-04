public class Cat {
    int foodEaten;
    String color;
    public int age;
    String name;
    static int numOfCats;
    
    public Cat(String color, int age, String name) {
        foodEaten = 0;
        this.color = color;
        this.age = age;
        this.name = name;
        numOfCats++;
    }
    
    // this method will increase the age of the this cat by 1
    public void grow() {
        age += 1;
        // age = age + 1;
        // age++;
    }
}