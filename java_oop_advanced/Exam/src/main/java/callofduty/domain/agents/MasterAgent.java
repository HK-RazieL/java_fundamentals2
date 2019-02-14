package callofduty.domain.agents;


import callofduty.interfaces.BountyAgent;

public class MasterAgent extends BaseAgent implements BountyAgent {

    final double DEFAULT_BOUNTY;

    public MasterAgent(String id, String name, double rating) {
        super(id, name, rating);
        this.DEFAULT_BOUNTY = 0;
    }

    @Override
    public Double getBounty() {
        return null;
    }
}
