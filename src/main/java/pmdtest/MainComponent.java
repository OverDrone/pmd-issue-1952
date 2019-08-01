package pmdtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainComponent implements IMainComponent {
    @Value("{someprop}")
    private Integer val;
    
    
    @Override
    public void run() {
        //sample method
    }
    
}
