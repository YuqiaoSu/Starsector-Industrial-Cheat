package data.campaign.econ.industries;

import com.fs.starfarer.api.impl.campaign.econ.impl.BaseIndustry;
import com.fs.starfarer.api.impl.campaign.ids.Commodities;
import com.fs.starfarer.api.impl.campaign.ids.Stats;

public class  Ind_Cheat_profits extends BaseIndustry {

    @Override
    public void apply() {

        super.apply(true);
        int size = market.getSize() * 10;
        supply(Commodities.DRUGS, size);
        supply(Commodities.LOBSTER, size);


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
