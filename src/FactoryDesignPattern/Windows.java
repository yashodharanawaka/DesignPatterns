package FactoryDesignPattern;

public class Windows implements OS{

    @Override
    public void specs() {
        System.out.println("I am Dying OS: Windows");
    }
}
