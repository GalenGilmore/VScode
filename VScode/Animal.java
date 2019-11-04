public class Animal{

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " goes ZZZZZZzzzZZZzzz");
    }

    public void eat(){
        System.out.println(name + " says n0m");
    }

    public void speak(){
        return "w00t";
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + " says ";
    }
}