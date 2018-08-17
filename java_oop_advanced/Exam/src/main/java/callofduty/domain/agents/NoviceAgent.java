package main.java.callofduty.domain.agents;

public class NoviceAgent extends BaseAgent {

    private static final double DEFFAULT_RATING = 0;

    public NoviceAgent(String id, String name, double rating) {
        super(id, name, rating);
        this.rating = DEFFAULT_RATING;
    }

}
