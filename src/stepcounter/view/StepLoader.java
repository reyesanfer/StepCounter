package stepcounter.view;

import java.time.LocalDateTime;
import stepcounter.model.Scale;
import stepcounter.model.Step;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/18 11:22 GMT
 *
 */

public interface StepLoader {
    
    Step load(LocalDateTime dateTime, Scale scale);

}
