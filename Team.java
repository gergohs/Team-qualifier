package groups;

/**@author gergohs */
public class Team {

    public String name;
    public int points;

    public Team(String name, int point) {
        this.name = name;
        this.points = point;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }
    public int goals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
