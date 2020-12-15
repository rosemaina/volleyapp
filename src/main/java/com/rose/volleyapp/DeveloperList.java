package com.rose.volleyapp;

public class DeveloperList {

    // Define variables
    private String devName;
    private String avatarURL;
    private String gitHubURL;

    // Contructor
    public DeveloperList( String devName, String gitHubURL, String avatarURL) {
        this.devName = devName;
        this.avatarURL = avatarURL;
        this.gitHubURL = gitHubURL;
    }

    // Getters
    public String getDevName() {
        return devName;
    }
    public String getAvatarURL() {
        return avatarURL;
    }
    public String getGitHubURL() { return gitHubURL; }
}
