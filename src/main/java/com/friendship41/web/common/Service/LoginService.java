package com.friendship41.web.common.Service;

import com.friendship41.web.repository.entity.Member;

public interface LoginService {
    public Member login();
    public Member login(String code);
}
