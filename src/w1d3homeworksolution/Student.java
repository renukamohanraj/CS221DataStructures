package w1d3homeworksolution;

public class Student {
    private int id;
    private String name;
    private int mark;
    
    public Student(int id, String name, int mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    
    public void displayStudent(){
        System.out.println("Student Id = " + id + ", Name = " + name + ", Mark = " + mark);
    }
    
    public int getId(){
        return id;
    }
    
    public int getMark(){
        return mark;
    }
}