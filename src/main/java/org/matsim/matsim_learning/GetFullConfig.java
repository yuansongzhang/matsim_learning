package org.matsim.matsim_learning;

import java.io.File;
import org.matsim.run.CreateFullConfig;

public class GetFullConfig {

        // Get full config file
        public static void main(String[] args) {

                String path = System.getProperty("user.dir") + "/output";
                File file = new File(path);
		if(!file.exists()){
                        file.mkdirs();
                }
                String[] filename = {path + "/full_config.xml" };
                CreateFullConfig.main(filename);
        }

}
