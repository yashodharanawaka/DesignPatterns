package FactoryDesignPattern;

public class TestFactory {
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();

        OS osObj = osf.getInstance("IOS");
        osObj.specs();
    }
}
