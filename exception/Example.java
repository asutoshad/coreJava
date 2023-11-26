package coreJava.exception;

public class Example {
    public static void main(String[] args) {
        System.out.println("Starting ....");

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("We have got two numbers");
            int result = n1/n2;
            System.out.println("Division is " +result);
        }
        catch (ArithmeticException e){
            System.out.println("n2 cannot be 0");
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Numbers !!");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error !!!");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I'm in final block");
            System.out.println("Closing all the resources ...");
        }
    }
}
//java exception handiling using try catch
//wrote this code in notepad and executed it in terminal
//was having hard time doing it in idm.