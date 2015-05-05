package w1d2;

public class IntegerArrayOperations {

	private int[] theArray = new int[10]; // Creates an array with the capacity of 10 	   
		    private int arraySize = 5; // Elements in theArray
		 	  
		    // Fills the Array with random values
		     
		    public void generateRandomArray(){
	         
	        for(int i = 0; i < arraySize; i++){
		            theArray[i] = i*2;
		             
	        }
		        
		    }
		     
		    public int[] getTheArray(){
		         
	        return theArray;
	         
		    }
		     
		    public int getArraySize(){
		         
		        return arraySize;
	        
	    }
		     
		    // Prints the Array on the screen in a grid
	     
		    public void printArray(){
	         
	        System.out.println("----------");
	         
	        for(int i = 0; i < arraySize; i++){
		             
	            System.out.print("| " + i + " | ");
	             
		            System.out.println(theArray[i] + " |");
	             
	            System.out.println("----------");
	             
		        }
	        
		    }
		     
	    // Gets value at provided index
	     
		    public int getValueAtIndex(int index){
		         
		        if(index < arraySize) return theArray[index];
	         
		        return 0;
	         
	    }
		      // Returns true or false if a value is in the Array(Linear Search)
		    
		     
	   public boolean doesArrayContainThisValue(int searchValue){
	         
		        boolean valueInArray = false;
	         
		        for(int i = 0; i < arraySize; i++){
	             
	            if(theArray[i] == searchValue){
	                
		                valueInArray = true;
		                break;
		                 
		            }
		             
		        }
		         
		        return valueInArray;
	         
	    }
	     	     
		    // Delete Array row for the index and move elements up
		     
	    public void deleteIndex(int index){
		         
		        if(index < arraySize){
		             
		            // Overwrite the value for the supplied index
		            // and then keep overwriting every index that follows
		            // until you get to the last index in the array
		             
	            for(int i = index; i < (arraySize - 1); i++){
	                 
	                theArray[i] = theArray[i+1];
		         
	            }
	             
		            arraySize--;
		             
	        }
		         
	    }
		     
		    public void insertValue(int value){
		    	  if(arraySize == theArray.length) 
		        	resize();
		       	             
	            theArray[arraySize] = value;
	            
	            arraySize++;
	            
		    }
		    
		   public void insertValue(int value, int pos){
			   	if(pos > arraySize) return;
				if(pos >= theArray.length||arraySize+1 > theArray.length) {
					resize();
				}
				int[] temp = new int[theArray.length+1];
				System.arraycopy(theArray,0,temp,0,pos);
				temp[pos] = value;
				
				System.arraycopy(theArray,pos,temp,pos+1, theArray.length - pos);
				theArray = temp;
				++arraySize;
				
			}
		     
	    // Linear Search : Every index must be looked at
		     
		    
		    private void resize(){
				System.out.println("resizing");
				int len = theArray.length;
				int newlen = 2*len;
				int[] temp = new int[newlen];
				System.arraycopy(theArray,0,temp,0,len);
				theArray = temp;
			}    	     
		    public static void main(String[] args){
		         
		    	IntegerArrayOperations  newArray = new IntegerArrayOperations ();
	         
	        newArray.generateRandomArray();
	         
		        newArray.printArray();
	        
		        System.out.println("Value in the Index(3) : " + newArray.getValueAtIndex(3));
		         
	        System.out.println("Does an array has a value 18 : " + newArray.doesArrayContainThisValue(18));
		         
		        newArray.deleteIndex(4);
	         
	        newArray.printArray();
		         
	        newArray.insertValue(55);
	        newArray.insertValue(66);
	        newArray.insertValue(77);
	        newArray.insertValue(88);
	        newArray.insertValue(100,1);
	         
	        newArray.printArray();
		    
	   }
		 
}
