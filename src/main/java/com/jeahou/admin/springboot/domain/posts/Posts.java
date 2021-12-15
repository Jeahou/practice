package com.jeahou.admin.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
//기본 생성자 자동 생성
@NoArgsConstructor
//jpa와 관련 어노테이션/ 테이블과 링크될 클래스임을 나타냅니다.
@Entity
public class Posts {
    //PK 필드를 나타냅니다.
    //PK의 생성 규칙을 나타냅니다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
