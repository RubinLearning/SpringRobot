package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

/**
 * Created by Владимир on 17.02.2016.
 */
public class ModelT1000 implements Robot {

    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000() {

    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}
