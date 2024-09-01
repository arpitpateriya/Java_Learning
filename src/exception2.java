public class exception2 {
    static void main(java.lang.String args[]){
        int[ ]numbers ={1,2,3};
        try{
            //trying to acces an element beyond the the array bound
            int nunmber=numbers[10];//this willthrow araay tndexout of boundsexceotion
            System.out.println("number:"+numbers);//this line will not be exception
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds.");
        }
    }
}
