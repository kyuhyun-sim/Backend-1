package com.sparta.instagramclone.repository;

import com.sparta.instagramclone.domain.Like;
import com.sparta.instagramclone.domain.Member;
import com.sparta.instagramclone.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findByMemberAndPost(Member member, Post post);
}