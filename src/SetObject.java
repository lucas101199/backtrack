import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SetObject{

    public ArrayList<__Object> list;

    public void sort (ArrayList<__Object> Set) {
            Collections.sort(Set, new Comparator<__Object>() {
                @Override
                public int compare(__Object o1, __Object o2) {
                    return o1.getRatio().compareTo(o2.getRatio());
                }
            });
    }


}
