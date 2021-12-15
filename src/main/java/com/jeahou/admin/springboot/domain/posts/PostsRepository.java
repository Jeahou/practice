package com.jeahou.admin.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
// ibats나 myBatis등에서 DAO라고 불리는 DB Layer접근자
// Jpa에선 Repository라고 부르며 인터페이스로 생성한다.
// Entity클래스와 기본 Entity Repository는 함께 위치해야한다.
public interface PostsRepository  extends JpaRepository<Posts, Long> {

}
