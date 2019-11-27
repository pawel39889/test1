package com.dataImport;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.HashMap;
import java.util.Set;

public class DataContainer {

  public static HashMap getPropertiesHashMap(String filePath) throws IOException {
    Properties dataProperties = new Properties();
    FileInputStream propertiesFileLocation = new FileInputStream(filePath);
    dataProperties.load(propertiesFileLocation);
    HashMap<String, String> dataFromProperties = new HashMap<String, String>();

    DataContainer.convertPropertiesToHashmap(dataProperties, dataFromProperties);

    return dataFromProperties;
  }

  public static void convertPropertiesToHashmap(Properties dataProperties, HashMap referenceToHashMap) {
    HashMap<String, String> dataFromProperties = referenceToHashMap;
    Set<Object> keys = dataProperties.keySet();

    for (Object tmpObject : keys) {
      String key = (String) tmpObject;
      String value = dataProperties.getProperty(key);
      dataFromProperties.put(key, value);
    }

    /* Additional internal method for testing HaspMap
         Set<String> keysFromHashmap = dataFromProperties.keySet();

         for (String stringFromHashMap : keysFromHashmap) {
           System.out.println(stringFromHashMap);
           System.out.println(dataFromProperties.get(stringFromHashMap));
         }
    */

  }
}
