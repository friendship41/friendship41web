package com.friendship41.web.common.Service;

import com.friendship41.web.repository.entity.Member;

import java.util.List;

public interface MemberService
{
    public List<Member> getMemberList();
    public Member getMemberById(String mMemberId);
    public Member save(Member member);
    public void updateTokenById(String mMemberId, Member member);
}
