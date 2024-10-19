package ClassWork;
import java.util.EmptyStackException;

public class Exceptions {
    
    public static void main(String[] args) {

        try{
            int[] number = {1,2,3};
            System.out.println(number[3]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
            
        }catch(EmptyStackException e){

        }
        finally{
            System.out.println("Done!");
        }
    }

}
