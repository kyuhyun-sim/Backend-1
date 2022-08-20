package com.sparta.instagramclone.repository;

import com.sparta.instagramclone.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    Optional<Member> findByNickname(String nickname);
    Long countByEmail(String email);
    Long countByNickname(String nickname);
}
