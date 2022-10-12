package main.java.ca.vanier;

public class Main {

    public static void main(String args[]) {
        ObjectManager objectM = new ObjectManager();
        objectM.setProductName(args[0]);
        objectM.setProductID(args[1]);
        objectM.setProductColor(args[2]);
        objectM.setProductPrice(args[3]);

        System.out.println(objectM.getProductName()+" "+objectM.getProductID()+" "+objectM.getProductColor()
                            +" "+objectM.getProductPrice());
    }

}