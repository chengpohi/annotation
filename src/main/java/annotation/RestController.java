package annotation;

import java.lang.annotation.*;

/**
 * annotation
 * Created by chengpohi on 8/13/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RestController {
}
