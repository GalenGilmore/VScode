
public class Person
{
   
    //Fields - instance data
    //access type variableName
    
    private int age;
    private String name;
    
    //Constructors - instructions that run when te object is created
    //generally used to initialise fields
    //HAS THE SAME NAME AS THE CLASS
    //NO RETURN TYPE
    
    public Person(){
        name = "Jane Doe";
        age = 27;
     }
    
    //Methods - things the object can do or have done to it
    //access returnType methodName(parameters)
    
    public void growOlder(){
         age++;
     }
    
    
    public void introduce(){
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }
}
