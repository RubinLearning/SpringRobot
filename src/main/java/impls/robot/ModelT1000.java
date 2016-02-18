package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000() {

    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}
