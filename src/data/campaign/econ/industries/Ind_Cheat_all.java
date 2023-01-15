package data.campaign.econ.industries;

import com.fs.starfarer.api.impl.campaign.econ.impl.BaseIndustry;
import com.fs.starfarer.api.impl.campaign.ids.Commodities;
import com.fs.starfarer.api.impl.campaign.ids.Stats;

public class Ind_Cheat_all extends BaseIndustry {

    @Override
    public void apply() {

        super.apply(true);
        int size = market.getSize() * 5;

        supply(Commodities.SUPPLIES, size);
        supply(Commodities.FUEL, size);
        supply(Commodities.CREW, size );
        supply(Commodities.MARINES, size);
        supply(Commodities.FOOD, size);
        supply(Commodities.ORGANICS, size);
        supply(Commodities.VOLATILES, size);
        supply(Commodities.ORE, size);
        supply(Commodities.RARE_ORE, size);
        supply(Commodities.METALS, size);
        supply(Commodities.RARE_METALS, size);
        supply(Commodities.HEAVY_MACHINERY, size);
        supply(Commodities.DOMESTIC_GOODS, size);
        supply(Commodities.ORGANS, size);
        supply(Commodities.DRUGS, size);
        supply(Commodities.HAND_WEAPONS, size);
        supply(Commodities.LUXURY_GOODS, size);
        supply(Commodities.LOBSTER, size);
        supply(Commodities.SHIPS, size);
        market.getStats().getDynamic().getMod(Stats.PRODUCTION_QUALITY_MOD).modifyFlat(getModId(1), 10.0f, "Cheat works");
        market.getStats().getDynamic().getMod(Stats.COMBAT_FLEET_SIZE_MULT).modifyFlat(getModId(1), 10.0f, "Cheat works");
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
