package main.java.callofduty.domain.missions;

import main.java.callofduty.interfaces.Mission;

import java.util.List;

public class SurveillanceMission extends Missions {
    public SurveillanceMission(String id, double rating, double bounty) {
        super(id, rating, bounty);
        this.rating -= rating * 0.75;
        this.bounty += bounty * 0.5;
    }

    @Override
    public Mission generateMission(String missionId, Double missionRating, Double missionBounty) {
        return null;
    }

    @Override
    public String agent(List<String> arguments) {
        return null;
    }

    @Override
    public String request(List<String> arguments) {
        return null;
    }

    @Override
    public String complete(List<String> arguments) {
        return null;
    }

    @Override
    public String status(List<String> arguments) {
        return null;
    }

    @Override
    public String over(List<String> arguments) {
        return null;
    }
}
