package configAnnotation;

import org.springframework.stereotype.Component;

@Component
public class MinusService implements Minus {
    public int minus(int q, int w) {
        return q - w;
    }
}