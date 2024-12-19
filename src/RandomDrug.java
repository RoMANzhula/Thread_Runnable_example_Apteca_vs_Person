import java.util.ArrayList;
import java.util.List;

public interface RandomDrug {
    public default Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (DrugsController.allDrugs.size()));
        
        List<Drug> drugs = new ArrayList<>(DrugsController.allDrugs.keySet()); 
        
        return drugs.get(index);
    }
}
