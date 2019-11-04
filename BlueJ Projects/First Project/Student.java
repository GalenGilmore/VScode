
public class Student
{
    private int pointsEarned, pointsPossible;
    private String name;

    public Student(){
        name = "Jane Doe";
        pointsEarned = 0;
        pointsPossible = 0;
    }

    public Student(String name){
        this.name = name;
        pointsEarned = 0;
        pointsPossible = 0;
    }

    public void addAssignment(int earned, int possible){
        pointsEarned = pointsEarned + earned;
        pointsPossible = pointsPossible + possible;
    }

    public double getPercent(){
        
        return (double)pointsEarned / pointsPossible * 100;
        
        //return pointsEarned * 100. / pointsPossible;
        //return  1. * pointsEarned / pointsPossible * 100;
        
    }
    
    public String toString(){
        return name + ": Points Earned: " + pointsEarned + ", Points possible: " + pointsPossible;
    }
}

