public class exception3 {
    static void main(String  args[])
    {
        Object[] array =new Integer[5];//creating the type of integer type
        try{
            //trying to store a String object in Intgere array
            array[0]="hello";
            //this will throw araaystroe exception

        }catch (ArrayStoreException e){
            System.out.println("arraystoreexception");
        }
    }}
