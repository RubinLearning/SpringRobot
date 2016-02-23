package impls.replacer;

import impls.robot.BaseModel;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ActionReplacer implements MethodReplacer{
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("new action!");
        return null;
//        if ((o instanceof BaseModel) && ("action".equals(method.getName()))) {
//            BaseModel robot = (BaseModel) o;
//            robot.getLeg().go();
//            robot.getLeg().go();
//            robot.getLeg().go();
//            return null;
//        } else {
//            throw new IllegalArgumentException("Unable to reimplement method "
//                    + method.getName());
//        }
    }
}
