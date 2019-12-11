
package groups;

import java.util.Comparator;

/**@author gergohs */

public class pointComparator implements Comparator<Team> {

    int returnValue;

    @Override
    public int compare(Team t1, Team t2) {
               
        if (t1.getPoints() < t2.getPoints()) {
            returnValue = 1;
        } else if (t1.getPoints() > t2.getPoints()) {
            returnValue = -1;
        } else if (t1.getPoints() == t2.getPoints()) {
            returnValue = 0;
        }
        return returnValue;
    }
}
