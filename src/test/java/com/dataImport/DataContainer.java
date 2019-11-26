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

        //Converting data from properties file
        Set<String> keys = dataFromFile.keySet();


        for (String tmpString : keys) {
            dataFromFile.put(tmpString, dataProperties.getProperty(tmpString));
        }

        keys = dataFromFile.keySet();

        for (String tmpString1 : keys) {
            System.out.println(tmpString1);
            System.out.println(dataFromFile.get(tmpString1));
        }







    }
}
