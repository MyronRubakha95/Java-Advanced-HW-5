package ConfigAnnotation;

import org.springframework.stereotype.Component;

@Component
public class PlusService implements Plus{
    public int add(int a, int b) {
        return a + b;
    }
}
