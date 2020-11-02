package SingletonDesignPattern;

public class TestSingleton {
    public static void main(String[] args) {

//        SingleObject() has private access in SingletonDesignPattern.SingleObject
//        SingleObject obj = new SingleObject();

        SingleObject obj = SingleObject.getSingleInstance();//get the only instance available

        obj.insideSingleObjectClass();
    }
}
