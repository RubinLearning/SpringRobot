package impls.pool;

import interfaces.Robot;
import interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool{

    private Collection<Robot> robotCollection;


    public T1000Pool() {
    }

    public T1000Pool(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void beginShow() {
        for (Robot robot: robotCollection) {
            robot.action();
        }
    }

}
