package start;

import impls.pool.T1000Pool;
import impls.robot.ModelT1000;
import interfaces.Robot;
import interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

//        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");
//        Robot terminator1 = t1000Conveyor.createRobot();
//        System.out.println("terminator1" + terminator1);
//        terminator1.action();

//        T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000GoldenPool");
//        t1000Pool.beginShow();

        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.action();

    }

}
