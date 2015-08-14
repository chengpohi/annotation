import annotation.RequestMapping;
import annotation.RestController;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * MyApp
 * Created by chengpohi on 8/13/15.
 */
public class MyApp {
    public static void main(String[] args) {
        Annotation[] annotations = Foo.class.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType().equals(RestController.class)) {
                System.out.println("Foo class have annotated by RestController annotation");
                Method[] methods = Foo.class.getMethods();
                for (Method method : methods) {
                    for (Annotation a : method.getAnnotations()) {
                        if (a.annotationType().equals(RequestMapping.class)) {
                            RequestMapping requestMapping = (RequestMapping) a;
                            System.out.println(method.getName() + " method has annotated by RequestMapping annotation");
                            System.out.println("Path: " + requestMapping.path());
                            System.out.println("method: " + requestMapping.method());
                        }
                    }
                }
            }
        }
    }
}
