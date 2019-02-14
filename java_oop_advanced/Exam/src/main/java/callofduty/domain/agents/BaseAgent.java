package callofduty.domain.agents;


import callofduty.interfaces.Agent;
import callofduty.interfaces.Mission;

public abstract class BaseAgent implements Agent {
    String id;
    String name;
    double rating;

    BaseAgent(){

    }

    BaseAgent(String id, String name, double rating) {

        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getRating() {
        return this.rating;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void acceptMission(Mission mission) {

    }

    @Override
    public void completeMissions() {

    }
}
