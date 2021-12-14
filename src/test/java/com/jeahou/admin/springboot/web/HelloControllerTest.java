package com.jeahou.admin.springboot.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;

//테스트를 진행할 때 junit에 내장된 실행자외에 다른 실행자를 실행시키는 부분
// springrunner라는 스프링실행자를 사용
@RunWith(SpringRunner.class)
//여러 스프링 어노테이션 중 web에 집중할수 있는 어노테이션
// 선언할경우 controller, controlleradvice 등을 사용가능 service component repository 사용 불가
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    // 웹 api를 테스트할 때 사용합니다.
    // 스프링 mvc테스트의 시작점
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello_return() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));

    }

    @Test
    public void helloDto_return() throws  Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                .param("name", name)
                .param("amount", String.valueOf(amount))
        ).andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
