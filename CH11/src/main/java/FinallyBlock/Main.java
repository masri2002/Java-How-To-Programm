package FinallyBlock;

public class Main {
    public static void main (String []args) {
        try {
            throwExecption();

        }catch (Exception exception){
            System.out.println("Exception handled in main");
        }
        doesNotThrowExecption();
    }

    private static void throwExecption() throws Exception {
    try {
        System.out.println("Method throwException");
        throw new Exception();
    }catch (Exception exception){
        System.err.println(
                 "Exception handled in method throwException");
        throw exception;
    }
    finally // executes regardless of what occurs in try...catch
    {
        System.err.println("Finally executed in throwException");
    }
    }

    private static void doesNotThrowExecption() {
        try // try block does not throw an exception
         {
             System.out.println("Method doesNotThrowException");
             }
        catch (Exception exception){

            System.err.println(exception);

        }
        finally // executes regardless of what occurs in try...catch
        {
            System.err.println(
                    "Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
