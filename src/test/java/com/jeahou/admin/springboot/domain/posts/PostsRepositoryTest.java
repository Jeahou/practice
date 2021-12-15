package com.jeahou.admin.springboot.domain.posts;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.Assert.assertEquals;

// 최신버전으로 바꾸게 되면 수정해야합니다. 2.1버전에서 사용가능
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void save_return(){
        String title = "테스트 게시글";
        String content = "테스트 본문";

        final Posts posts = Posts.builder()
                .title(title)
                .content(content)
                .author("jjjj@gmail.com")
                .build();

        //when
        final Posts savePosts = postsRepository.save(posts);

        //then
        assertEquals(content, savePosts.getContent());
    }

}
