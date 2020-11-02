package FactoryDesignPattern;

public class OSFactory {
    public OS getInstance(String str){
        System.out.println("OS factory is working!");

        if(str.equals("IOS"))
            return new IOS();

        else if(str.equals("Android"))
            return new Android();

        else
            return new Windows();
    }
}
