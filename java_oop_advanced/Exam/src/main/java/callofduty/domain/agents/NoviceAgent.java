package callofduty.domain.agents;

public class NoviceAgent extends BaseAgent {

    private static final double DEFAULT_RATING = 0;
    private double rating;

    public NoviceAgent(String id, String name) {
        this.id = id;
        this.name = name;
        this.rating = DEFAULT_RATING;
    }


}
