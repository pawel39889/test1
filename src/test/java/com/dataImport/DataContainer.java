package com.dataImport;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.HashMap;
import java.util.Set;

public class DataContainer {

    public static void gatherDataFromFile(String filePath) throws IOException {
        Properties dataProperties = new Properties();
        FileInputStream propertiesFileLocation = new FileInputStream(filePath);
        dataProperties.load(propertiesFileLocation);
        HashMap<String, String> dataFromFile = new HashMap<String, String>();

        dataFromFile = DataContainer.propertiesToHashmap(dataProperties);
    }

    public static HashMap<String, String> propertiesToHashmap(Properties dataProperties) {
        HashMap<String, String> tmpHashMap = new HashMap<String, String>();
        Set<Object> keys = dataProperties.keySet();

        for (Object tmpObject: keys) {
            String key = (String) tmpObject;
            String value = dataProperties.getProperty(key);
            tmpHashMap.put(key, value);
        }

        //HaspMap test
        Set<String> keysFromHashmap = tmpHashMap.keySet();

            for (String stringFromHashMap : keysFromHashmap) {
                System.out.println(stringFromHashMap);
                System.out.println(tmpHashMap.get(stringFromHashMap));
            }

        return tmpHashMap;
    }
}

