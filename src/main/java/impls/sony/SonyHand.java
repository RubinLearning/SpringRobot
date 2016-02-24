package impls.sony;

import interfaces.Hand;

public class SonyHand implements Hand{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void catchSomething() {
        System.out.println("Catching something from Sony");
    }
}
