package main.java.callofduty.domain.missions;

import main.java.callofduty.interfaces.Mission;

import java.util.List;

public class HuntMission extends Missions {
    public HuntMission(String id, double rating, double bounty) {
        super(id, rating, bounty);
        this.rating += rating * 0.5;
        this.bounty += bounty;
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
