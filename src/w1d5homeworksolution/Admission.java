package w1d5homeworksolution;

import java.util.LinkedList;
import java.util.Queue;
public class Admission {
    static int auto = 5001;
    int adno;
    String name;
    String pno;

    public Admission(String name, String pno) {
        adno = auto++;
        this.name = name;
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "{Admission number = " + adno + ", Name = "
                + name + ", Phone Number =" + pno + '}';
    }
       
    
    public static void main(String[] args){
    	// Creation of Queue object for the class Admission
        Queue<Admission> admission = new LinkedList<Admission>();
        
        // Inserting five elements into the Queue
        admission.add(new Admission("Raja", "641-115-4489"));
        admission.add(new Admission("Elaine", "425-125-3848"));
        admission.add(new Admission("Ajith", "911-135-4998"));
        admission.add(new Admission("Varun", "554-145-4111"));
        admission.add(new Admission("Jessy", "344-155-9895"));
       
        // Element in the Front
        System.out.println("Peek: " + admission.peek());
        
        // Size of the Queue
        System.out.println("Size: " + admission.size());
        
        // Removing elements in the List
        while(!admission.isEmpty()){
            System.out.println(admission.remove());
        }
        // Checking isEmpty() or not
        System.out.println("Empty? : " + admission.isEmpty());
        
    }
}