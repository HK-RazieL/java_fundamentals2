package callofduty.domain.missions;


public class HuntMission extends Missions {
    HuntMission(String id, Double rating, Double bounty) {
        super(id, rating * 1.5, bounty * 2);
    }


      public HuntMission(String id, double rating, double bounty) {

          super(id, rating, bounty);
          this.rating += rating * 0.5;
          this.bounty += bounty;

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
