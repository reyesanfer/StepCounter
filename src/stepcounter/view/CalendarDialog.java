package stepcounter.view;

import java.time.LocalDateTime;
import stepcounter.model.Scale;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/18 11:25 GMT
 *
 */

public interface CalendarDialog {
    
    void execute();
    LocalDateTime dateTime();
    Scale scale();

}
