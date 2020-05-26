package com.friendship41.web.song4music.service.kakaoauth;

import com.fasterxml.jackson.annotation.JsonProperty;


public class KakaoTokenResponse {
    @JsonProperty("access_token")
    private String access_token;
    @JsonProperty("token_type")
    private String token_type;
    @JsonProperty("refresh_token")
    private String refresh_token;
    @JsonProperty("expires_in")
    private int expires_in;
    @JsonProperty("scope")
    private String scope;

    public String getAccess_token()
    {
        return access_token;
    }

    public void setAccess_token(String access_token)
    {
        this.access_token = access_token;
    }

    public String getToken_type()
    {
        return token_type;
    }

    public void setToken_type(String token_type)
    {
        this.token_type = token_type;
    }

    public String getRefresh_token()
    {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token)
    {
        this.refresh_token = refresh_token;
    }

    public int getExpires_in()
    {
        return expires_in;
    }

    public void setExpires_in(int expires_in)
    {
        this.expires_in = expires_in;
    }

    public String getScope()
    {
        return scope;
    }

    public void setScope(String scope)
    {
        this.scope = scope;
    }

    @Override
    public String toString()
    {
        return "KakaoTokenResponse{" +
                "access_token='" + access_token + '\'' +
                ", token_type='" + token_type + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", expires_in=" + expires_in +
                ", scope='" + scope + '\'' +
                '}';
    }
}
