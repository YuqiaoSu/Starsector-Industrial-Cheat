package data.campaign.econ.industries;

import com.fs.starfarer.api.impl.campaign.econ.impl.BaseIndustry;
import com.fs.starfarer.api.impl.campaign.ids.Commodities;
import com.fs.starfarer.api.impl.campaign.ids.Stats;

public class Ind_Cheat_patrol extends BaseIndustry {

    @Override
    public void apply() {

        super.apply(true);
        supply(Commodities.SHIPS, 10);
        market.getStats().getDynamic().getMod(Stats.PRODUCTION_QUALITY_MOD).modifyFlat(getModId(2), 10.0f, "Patrol cheat works");
        market.getStats().getDynamic().getMod(Stats.COMBAT_FLEET_SIZE_MULT).modifyFlat(getModId(2), 10.0f, "Patrol cheat works");

    }

    @Override
    public void unapply() {
        super.unapply();
    }

    @Override
    public boolean isAvailableToBuild() {
        return true;
    }

    @Override
    public boolean showWhenUnavailable() {
        return true;
    }
}
