package org.launchcode.studio7;

import java.util.HashMap;
import java.util.Map;

public interface OpticalDisc {
    // using hashmaps to specify constants based on discType
    static final Map<String, Integer> CAPACITIES = new HashMap<>() {{
        // initialize disc capacities (MB)
        put("CD", 700);
        put("DVD", 17000);
    }};

    static final Map<String, Integer> SPEEDS = new HashMap<>() {{
        // initialize disc speeds (rpm)
        put("CD", 400);
        put("DVD", 1200);
    }};

    // METHODS

    void spinDisc();

    void readData();

    void runFile(File file); // takes the file name you're trying to run

    void writeData(File file); // takes the file name you're trying to write to the disc
}
