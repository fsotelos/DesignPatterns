package com.example.singleton;

public class AppsConfig {
    private static volatile AppsConfig instance;
    private String databaseUrl;
    private String apiKey;

    private AppsConfig() {
    
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "myApiKey";
    }

    public static AppsConfig getInstance() {
    
        if (instance == null) {
            synchronized (AppsConfig.class) {
                if (instance == null) {
                    instance = new AppsConfig();
                }
            }
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
