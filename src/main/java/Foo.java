import annotation.RequestMapping;
import annotation.RestController;

/**
 *
 * Created by chengpohi on 8/13/15.
 */

@RestController
public class Foo {
    @RequestMapping(path = "/", method = "POST")
    public String bar() {
        return "Hello World~";
    }
}
