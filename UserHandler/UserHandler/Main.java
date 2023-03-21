package UserHandler;
public class Main {
    public static void main(String[] args) {
        Flows flows = new Flows();
        System.out.println("flows.methodA("Hello, world");");
        flows.methodA("Hello, world");
        System.out.println("flows.methodA("start");");
        flows.methodA("start");
        System.out.println("flows.methodB("Hello, world");");
        flows.methodB("Hello, world");
        System.out.println("flows.methodC("Hello, world");");
        flows.methodC("Hello, world");
        System.out.println("flows.methodD(25);");
        flows.methodD(25);

     /*   Exceptions exceptions = new Exceptions();
        try{
            System.out.println("exceptions.methodA("Hello, world");");
            exceptions.methodA("Hello, world");
        }
        catch (Exception e){
            System.out.println("Goodbye, world");
        }

        try{
            System.out.println("exceptions.methodA("Hi");");
            exceptions.methodA("Hi");
        }
        catch (Exception e){
            System.out.println("Bye");
        }

        System.out.println("exceptions.methodB("Hello, world");");
        exceptions.methodB("Hello, world");
        System.out.println("exceptions.methodB("Hi");");
        exceptions.methodB("Hi");

        System.out.println("exceptions.methodC("Hello, world");");
        exceptions.methodC("Hello, world");
        System.out.println("exceptions.methodC("Hi");");
        exceptions.methodC("Hi");*/
    }
}
