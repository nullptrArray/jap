package com.example.demo;

import com.example.demo.domain.Member;
import com.example.demo.domain.RoleType;
import com.example.demo.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //implement your business logic here
        memberRepository.save(Member.builder()
                .name("test")
                .type(RoleType.ADMIN)
                .description("desc!!")
                .build());
    }
}

