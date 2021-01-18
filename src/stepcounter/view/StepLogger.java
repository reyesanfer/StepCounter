package stepcounter.view;

import stepcounter.model.Step;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/18 11:14 GMT
 *
 */

public interface StepLogger {
    
    void on(StepDetection stepDetection);
    
    public interface StepDetection{
        
        void step(Step step);

        public void detected(Step step);

    }

}
