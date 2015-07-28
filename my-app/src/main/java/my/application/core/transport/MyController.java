package my.application.core.transport;

import my.application.core.bo.MyInformation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * TODO document me
 *
 * @author Mathieu POUSSE <mathieu.pousse@zenika.com>
 */
@RestController
public class MyController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public MyInformation welcome() {
        return new MyInformation(counter.get(), "previous");
    }

    @RequestMapping("/once")
    public MyInformation once() {
        return new MyInformation(counter.incrementAndGet(), "once");
    }

}
