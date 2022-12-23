package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    private final Deth8 rabbi;
    @Autowired
    public Needle7(Deth8 rabbi) {
        this.rabbi = rabbi;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
