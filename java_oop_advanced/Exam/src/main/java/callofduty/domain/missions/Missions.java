package main.java.callofduty.domain.missions;

import main.java.callofduty.interfaces.Mission;
import main.java.callofduty.interfaces.MissionControl;
import main.java.callofduty.interfaces.MissionManager;

public abstract class Missions implements Mission, MissionControl, MissionManager {

    String id;
    double rating;
    double bounty;

    public Missions(String id, double rating, double bounty) {
        this.id = id;
        this.rating = rating;
        this.bounty = bounty;
    }

    @Override
    public Double getRating() {
        return this.rating;
    }

    @Override
    public Double getBounty() {
        return this.bounty;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
