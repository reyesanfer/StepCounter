
package stepcounter.model;

import java.time.LocalDateTime;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2021/01/18 11:09 GMT
 *
 */

public class Step {
    
    private final LocalDateTime dateTime;
    private final int count;
    private final Scale scale;

    public Step(LocalDateTime dateTime, int count, Scale scale) {
        this.dateTime = dateTime;
        this.count = count;
        this.scale = scale;
    }

    public Step(LocalDateTime now, Scale scale, int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getCount() {
        return count;
    }

    public Scale getScale() {
        return scale;
    }

}
