package Exception;

public class ExceptionHandling {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        int[] arr = {1,2,4};
//        try{
//            //System.out.println(a/b);
//            System.out.println(arr[4]);
//
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        finally{
//            System.out.println("Finally Block");
//        }
        try{
            System.out.println(arr[5]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        throw new ArithmeticException("Manual Exception");
    }
}
