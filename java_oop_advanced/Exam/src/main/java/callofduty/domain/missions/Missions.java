package callofduty.domain.missions;


import callofduty.interfaces.Mission;

import java.util.List;

public abstract class Missions implements Mission {

   String id;
   Double rating;
   Double bounty;


    Missions (String id,Double rating,Double bounty){
        super();
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

    @Override
    public String agent(List<String> arguments) {
        return null;
    }

}
