package SingletonDesignPattern;

public class SingleObject {
    private static SingleObject singleInstance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getSingleInstance(){
        return singleInstance;
    }

    public void insideSingleObjectClass(){
        System.out.println("The single instance is here!!");
    }
}
