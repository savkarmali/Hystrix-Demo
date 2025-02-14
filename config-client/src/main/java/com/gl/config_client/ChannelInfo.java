package com.gl.config_client;

public class ChannelInfo {

    private String source;
    private String name;
    private String url;

    public ChannelInfo(String source, String name, String url) {
        this.name = source;
        this.source = name;
        this.url = url;
    }

    public ChannelInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
