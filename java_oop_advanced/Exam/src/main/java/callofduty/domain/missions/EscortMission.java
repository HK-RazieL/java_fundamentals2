package callofduty.domain.missions;

public class EscortMission extends Missions {

    String id;
    Double rating;
    Double bounty;

    public EscortMission (String id,Double rating, Double bounty){
        super(id, rating, bounty);

        this.rating -= rating * 0.25;
        this.bounty += bounty * 0.25;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Double getRating() {
        return this.rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public Double getBounty() {
        return this.bounty;
    }

    public void setBounty(Double bounty) {
        this.bounty = bounty;
    }
}
