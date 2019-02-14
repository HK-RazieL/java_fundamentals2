package callofduty.domain.missions;



public class SurveillanceMission extends Missions {

    public SurveillanceMission(String id, double rating, double bounty) {
      super(id, rating, bounty);
      this.rating -= rating * 0.75;
      this.bounty += bounty * 0.5;
  }

    SurveillanceMission(String id, Double rating, Double bounty) {
        super(id, rating, bounty);
    }

    @Override
    public Double getRating() {
        return super.getRating();
    }

    @Override
    public Double getBounty() {
        return super.getBounty();
    }

    @Override
    public String getId() {
        return super.getId();
    }
}
