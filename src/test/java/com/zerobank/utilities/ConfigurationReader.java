package com.zerobank.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    /**
     * Bu class configuration.properties dosyasında bulunan verileri okumaya yarar.
     */

    private static Properties properties;


    static {
        try {

            String path = "configuration.properties";


            /**
             * FileInputString  --> javaya dışarıdan veri alamak için kullanılır.
             * FileOutputStream --> javadan dışarıya veri vermek için kullanılır.
             */

            FileInputStream input = new FileInputStream(path);


            properties = new Properties();


            properties.load(input);

            input.close();
        } catch (Exception e) {
          e.printStackTrace();
        }


    }

    public static String  get(String keyName) {
       return properties.getProperty(keyName);

    }

}
