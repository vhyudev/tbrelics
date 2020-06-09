package com.lxtech.tbrelics.dataacquisition;

import java.io.*;
import java.util.Properties;

/**
 * @author RLL
 * @date 2020/4/27
 */
public class ReadProperties {
    /**
     * 读取Properties
     * @param key
     * @param propertiesFile
     * @return
     */
    public String getPropertiesString(String key, String propertiesFile) {
        Properties properties = new Properties();
        InputStream inputStream = this.getClass().getResourceAsStream("/" + propertiesFile);
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            properties.load(bf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = properties.getProperty(key);
        return value;
    }

}
