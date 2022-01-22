package com.lwdevelop.backend.services;

import com.lwdevelop.backend.models.Member;
import com.lwdevelop.backend.repositorys.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void SaveMember() {
        Member member = new Member("michael@gmail.com", "abc12345", "michael", "jordan");
        memberRepository.save(member);
    }
}
