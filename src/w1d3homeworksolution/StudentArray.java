package w1d3homeworksolution;

public class StudentArray {
    private Student[] a;
    private int nElems = 0;
    
    public StudentArray(int max){
        a = new Student[max];
    }
    
    public void insert(int id, String name, int mark){
        for(int i = 0; i<nElems;i++){
            if(a[i].getId() == id){
                return;
            }
        }
        a[nElems] = new Student(id, name, mark);
        nElems++;
    }
    
    public boolean delete(int id){
        for (int i = 0; i < nElems; i++) {
            if (a[i].getId() == id) {
                for (int j = i; j < nElems; j++) {
                    a[j] = a[j + 1];

                }
                nElems--;
                return true;
            }
        }
        return false;
    }
    
    public void displayAll(){
        for(int i = 0; i < nElems; i++){
            a[i].displayStudent();
        }
    }
    
    public void maxMark(){
        Student highScore;
        highScore = a[0];
        for(int i = 1; i < nElems;i++){
            if(highScore.getMark() < a[i].getMark()){
                highScore = a[i];
            }
        }
        highScore.displayStudent();
    }
    
    public void minMark(){
        Student lowScore;
        lowScore = a[0];
        for(int i = 1; i < nElems;i++){
            if(lowScore.getMark() > a[i].getMark()){
                lowScore = a[i];
            }
        }
        lowScore.displayStudent();
    }
    
    public static void main(String[] args){
        StudentArray Obj = new StudentArray(20);
        Obj.insert(1000, "Arun", 78);
        Obj.insert(1001, "Amala", 66);
        Obj.insert(1002, "Sunil", 87);
        Obj.insert(1003, "John", 95);
        Obj.insert(1004, "Madhu", 50);
        Obj.insert(1005, "Janani", 90);
        Obj.displayAll();
        System.out.println("Status of Deleted student id number 1005 : " + Obj.delete(1005)) ;
        Obj.displayAll();
        System.out.print("Maximum Score is : ");
        Obj.maxMark();
        System.out.print("Minimum Score is :");
        Obj.minMark();
    }
    
}
