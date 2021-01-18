
package stepcounter.control;

import stepcounter.model.Step;
import stepcounter.view.StepLogger;
import stepcounter.view.StepStore;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/18 11:26 GMT
 *
 */

public class MonitorStepCommand implements Command {
    
    private final StepStore store;
    private final StepLogger logger;

    public MonitorStepCommand(StepStore store, StepLogger logger) {
        this.store = store;
        this.logger = logger;
        this.logger.on(stepDetection());
    }

    @Override
    public void execute() {
        
    }
    
    private StepLogger.StepDetection stepDetection() {
        return new StepLogger.StepDetection() {
            @Override
            public void step(Step step) {
                store.store(step);
            }

            @Override
            public void detected(Step step) {
            }
        };
    }

}
