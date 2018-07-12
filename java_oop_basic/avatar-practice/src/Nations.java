import Benders.*;
import Monuments.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nations {

    List<FireBender> fireBenders = new ArrayList<>();
    List<WaterBender> waterBenders = new ArrayList<>();
    List<EarthBender> earthBenders = new ArrayList<>();
    List<AirBender> airBenders = new ArrayList<>();
    List<FireMonument> fireMonuments = new ArrayList<>();
    List<WaterMonument> waterMonuments = new ArrayList<>();
    List<EarthMonument> earthMonuments = new ArrayList<>();
    List<AirMonument> airMonuments = new ArrayList<>();
    List<String> warHistory = new LinkedList<>();

    public double getFireNationsPower() {
        double benderPower = 0;
        int monumentPower = 0;

        for (FireBender fireBender : this.fireBenders) {
            benderPower += fireBender.fireBenderTotalPower();
        }

        for (FireMonument fireMonument : this.fireMonuments) {
            monumentPower += fireMonument.getFireAffinity();
        }

        if (monumentPower == 0) {
            return benderPower;
        } else {
            return ((benderPower / 100) * monumentPower) + benderPower;
        }
    }

    public double getWaterNationsPower() {
        double benderPower = 0;
        int monumentPower = 0;

        for (WaterBender waterBender : this.waterBenders) {
            benderPower += waterBender.waterBenderTotalPower();
        }

        for (WaterMonument waterMonument : this.waterMonuments) {
            monumentPower += waterMonument.getWaterAffinity();
        }

        if (monumentPower == 0) {
            return benderPower;
        } else {
            return ((benderPower / 100) * monumentPower) + benderPower;
        }
    }

    public double getEarthNationsPower() {
        double benderPower = 0;
        int monumentPower = 0;

        for (EarthBender earthBender : this.earthBenders) {
            benderPower += earthBender.earthBenderTotalPower();
        }

        for (EarthMonument earthMonument : this.earthMonuments) {
            monumentPower += earthMonument.getEarthAffinity();
        }

        if (monumentPower == 0) {
            return benderPower;
        } else {
            return ((benderPower / 100) * monumentPower) + benderPower;
        }
    }

    public double getAirNationsPower() {
        double benderPower = 0;
        int monumentPower = 0;

        for (AirBender airBender : this.airBenders) {
            benderPower += airBender.airBenderTotalPower();
        }

        for (AirMonument airMonument : this.airMonuments) {
            monumentPower += airMonument.getAirAffinity();
        }

        if (monumentPower == 0) {
            return benderPower;
        } else {
            return ((benderPower / 100) * monumentPower) + benderPower;
        }
    }

    void addingAirBender(AirBender bender) {
        this.airBenders.add(bender);
    }

    void addingFireBender(FireBender bender) {
        this.fireBenders.add(bender);
    }

    void addingWaterBender(WaterBender bender) {
        this.waterBenders.add(bender);
    }

    void addingEarthBender(EarthBender bender) {
        this.earthBenders.add(bender);
    }

    void addingAirMonument(AirMonument monument) {
        this.airMonuments.add(monument);
    }

    void addingFireMonument(FireMonument monument) {
        this.fireMonuments.add(monument);
    }

    void addingWaterMonument(WaterMonument monument) {
        this.waterMonuments.add(monument);
    }

    void addingEarthMonument(EarthMonument monument) {
        this.earthMonuments.add(monument);
    }

    public void statusAir() {
        System.out.printf("%nAir Nation%nBenders:");
        if (this.airBenders.size() > 0) {
            for (AirBender airBender : this.airBenders) {
                System.out.printf("%n###Air Bender: %s, Power: %d, Aerial Integrity: %.2f", airBender.name(), airBender.power(), airBender.getAerialIntegrity());
            }
        } else {
            System.out.printf(" None");
        }
        System.out.printf("%nMonuments:");
        if (this.airMonuments.size() > 0) {
            for (AirMonument airMonument : this.airMonuments) {
                System.out.printf("%n###Air Monument: %s, Air Affinity: %d", airMonument.name(), airMonument.getAirAffinity());
            }
        } else {
            System.out.printf(" None");
        }
    }

    public void statusFire() {
        System.out.printf("%nFire Nation%nBenders:");
        if (this.fireBenders.size() > 0) {
            for (FireBender fireBender : this.fireBenders) {
                System.out.printf("%n###Fire Bender: %s, Power: %d, Heat Aggression: %.2f", fireBender.name(), fireBender.power(), fireBender.getHeatAggression());
            }
        } else {
            System.out.printf(" None");
        }
        System.out.printf("%nMonuments:");
        if (this.fireMonuments.size() > 0) {
            for (FireMonument fireMonument : this.fireMonuments) {
                System.out.printf("%n###Fire Monument: %s, Fire Affinity: %d", fireMonument.name(), fireMonument.getFireAffinity());
            }
        } else {
            System.out.printf(" None");
        }
    }

    public void statusWater() {
        System.out.printf("%nWater Nation%nBenders:");
        if (this.waterBenders.size() > 0) {
            for (WaterBender waterBender : this.waterBenders) {
                System.out.printf("%n###Water Bender: %s, Power: %d, Water Clarity: %.2f", waterBender.name(), waterBender.power(), waterBender.getWaterClarity());
            }
        } else {
            System.out.printf(" None");
        }
        System.out.printf("%nMonuments:");
        if (this.waterMonuments.size() > 0) {
            for (WaterMonument waterMonument : this.waterMonuments) {
                System.out.printf("%n###Fire Monument: %s, Fire Affinity: %d", waterMonument.name(), waterMonument.getWaterAffinity());
            }
        } else {
            System.out.printf(" None");
        }
    }

    public void statusEarth() {
        System.out.printf("%nEarth Nation%nBenders:");
        if (this.earthBenders.size() > 0) {
            for (EarthBender earthBender : this.earthBenders) {
                System.out.printf("%n###Earth Bender: %s, Power: %d, Ground Saturation: %.2f", earthBender.name(), earthBender.power(), earthBender.getGroundSaturation());
            }
        } else {
            System.out.printf(" None");
        }
        System.out.printf("%nMonuments:");
        if (this.earthMonuments.size() > 0) {
            for (EarthMonument earthMonument : this.earthMonuments) {
                System.out.printf("%n###Fire Monument: %s, Fire Affinity: %d", earthMonument.name(), earthMonument.getEarthAffinity());
            }
        } else {
            System.out.printf(" None");
        }
    }

    public void war(String nation) {
        this.warHistory.add(nation);

        if (getWaterNationsPower() > getFireNationsPower() && getWaterNationsPower() > getAirNationsPower() && getWaterNationsPower() > getEarthNationsPower()) {
            this.fireMonuments.clear();
            this.fireBenders.clear();
            this.airMonuments.clear();
            this.airBenders.clear();
            this.earthMonuments.clear();
            this.earthBenders.clear();
        } else if (getFireNationsPower() > getEarthNationsPower() && getFireNationsPower() > getWaterNationsPower() && getFireNationsPower() > getAirNationsPower()) {
            this.waterMonuments.clear();
            this.waterBenders.clear();
            this.airMonuments.clear();
            this.airBenders.clear();
            this.earthMonuments.clear();
            this.earthBenders.clear();
        } else if (getAirNationsPower() > getFireNationsPower() && getAirNationsPower() > getWaterNationsPower() && getAirNationsPower() > getEarthNationsPower()) {
            this.waterMonuments.clear();
            this.waterBenders.clear();
            this.fireMonuments.clear();
            this.fireBenders.clear();
            this.earthMonuments.clear();
            this.earthBenders.clear();
        } else {
            this.waterMonuments.clear();
            this.waterBenders.clear();
            this.airMonuments.clear();
            this.airBenders.clear();
            this.fireMonuments.clear();
            this.fireBenders.clear();
        }
    }

    void warHistory() {
        for (int i = 1; i <= this.warHistory.size(); i++) {
            System.out.printf("War %d issued by %s%n", i, this.warHistory.get(i - 1));

        }
    }
}

