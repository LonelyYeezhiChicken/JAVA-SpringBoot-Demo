package com.lwdevelop.backend.resources;

import com.lwdevelop.backend.models.Member;
import com.lwdevelop.backend.repositorys.MemberRepository;
import com.lwdevelop.backend.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DatabaseLoden implements CommandLineRunner {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        // memberService.SaveMember();
        Member member = new Member("michael@gmail.com", "abc12345", "michael", "jordan");
        memberRepository.save(member);
    }
}
