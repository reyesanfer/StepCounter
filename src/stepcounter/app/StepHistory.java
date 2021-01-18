
package stepcounter.app;

import java.time.LocalDateTime;
import stepcounter.model.Scale;
import stepcounter.model.Step;
import stepcounter.view.StepLoader;
import stepcounter.view.StepStore;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/18 11:31 GMT
 *
 */

public class StepHistory implements StepStore, StepLoader {

    @Override
    public void store(Step step) {
        
    }

    @Override
    public Step load(LocalDateTime dateTime, Scale scale) {
        return null;
    }

}
