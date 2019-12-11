package groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* @author gergohs */

public class qualifier {

    public static void main(String[] args) {

        Team Aze = new Team("Azerbaijan", 0);
        Team Cro = new Team("Croatia", 0);
        Team Hun = new Team("Hungary", 0);
        Team Wal = new Team("Wales", 0);
        Team Svk = new Team("Slovakia", 0);

        Hun.setPoints(12);
        Cro.setPoints(17);
        Svk.setPoints(10);
        Wal.setPoints(11);
        Aze.setPoints(1);
        
        //*********************************************************        
//        match(Cro, Hun, 1, 0);
//        match(Svk, Wal, 1, 1);
//
//        match(Hun, Aze, 1, 0);
//        match(Wal, Cro, 1, 1);
        //-------------------------------
//        match(Aze, Wal, 0, 1);
//        match(Cro, Svk, 1, 0);

        match(Svk, Aze, 1, 1);
        match(Wal, Hun, 1, 0);

        //*********************************************************        
        Team[] groupE = {Hun, Aze, Cro, Wal, Svk};

        ArrayList<Team> group = new ArrayList<>();

        group.addAll(Arrays.asList(groupE));

        Collections.sort(group, new pointComparator());

        System.out.println("********************* Standings ********************* ");

        for (int i = 0; i < group.size(); i++) {
            System.out.println(i + 1 + ". " + group.get(i).getName() + ", " + group.get(i).getPoints() + " pts");
        }
    }

    public static void match(Team t1, Team t2, int t1Goals, int t2Goals) {

        t1.setGoals(t1Goals);
        t2.setGoals(t2Goals);

        if (t1.getGoals() > t2.getGoals()) {
            t1.setPoints(t1.getPoints() + 3);
            t2.setPoints(t2.getPoints());
        } else if (t1.getGoals() < t2.getGoals()) {
            t1.setPoints(t1.getPoints());
            t2.setPoints(t2.getPoints() + 3);
        } else if (t1.getGoals() == t2.getGoals()) {
            t1.setPoints(t1.getPoints() + 1);
            t2.setPoints(t2.getPoints() + 1);
        }
    }
}
