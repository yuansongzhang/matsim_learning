package org.matsim.matsim_learning;

import org.matsim.api.core.v01.Scenario;
import org.matsim.contrib.otfvis.OTFVisLiveModule;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy;
import org.matsim.core.scenario.ScenarioUtils;


public class Equil {

    public static void main(String[] args) {

        Config config;
        if (args == null || args.length == 0 || args[0] == null) {
            config = ConfigUtils.loadConfig("./src/main/resources/scenarios/equil/config.xml");
        } else {
            config = ConfigUtils.loadConfig(args);
        }
        config.controler()
                .setOverwriteFileSetting(OutputDirectoryHierarchy.OverwriteFileSetting.deleteDirectoryIfExists);

        // possibly modify config here

        // ---

        Scenario scenario = ScenarioUtils.loadScenario(config);

        // possibly modify scenario here

        // ---

        Controler controler = new Controler(scenario);

        // possibly modify controler here

        controler.addOverridingModule(new OTFVisLiveModule());

        // ---

        controler.run();
    }

}
