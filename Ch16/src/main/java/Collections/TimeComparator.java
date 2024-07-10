package Collections;

import java.util.Comparator;
import java.util.List;

public class TimeComparator implements Comparator<Time2> {
    @Override
    public int compare(Time2 o1, Time2 o2) {
        int hourDifference=o1.getHours()-o2.getHours();
        if(hourDifference!=0){
            return hourDifference;
        }
        int minutesDifference=o1.getMinutes()-o2.getMinutes();
        if(minutesDifference!=0){
            return minutesDifference;
        }
        int secondsDifference=o1.getSeconds()-o2.getSeconds();
        return secondsDifference;


    }


}
