package com.friendship41.web.song4music.service;

import com.friendship41.web.repository.entity.Member;

public interface LoginService {
    public Member login();
    public Member login(String code);
}
