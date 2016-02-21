package impls.robot;

import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnabled;

    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : " + color + " " + year + " " + soundEnabled);
    }

    public void initObject(){
        System.out.println("init");
    }

    public void destroyObject(){
        System.out.println("destroy");
    }

    public ModelT1000() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        super();
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public void action(){
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }

    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}
