
package stepcounter.app;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import stepcounter.model.Scale;
import stepcounter.model.Step;
import stepcounter.view.StepLogger;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/18 11:32 GMT
 *
 */

public class MockStepLogger implements StepLogger {
    
    private StepDetection stepDetection;

    public MockStepLogger() {
        Timer timer = new Timer();
        timer.schedule(task(), 0, 10*60*1000);
    }

    @Override
    public void on(StepDetection stepDetection) {
        this.stepDetection = stepDetection;
    }

    private TimerTask task() {
        return new TimerTask() {
            @Override
            public void run() {
                stepDetection.detected(new Step(LocalDateTime.now(),Scale.Minute, new Random().nextInt(500)));
            }
        }; 
    }

}
