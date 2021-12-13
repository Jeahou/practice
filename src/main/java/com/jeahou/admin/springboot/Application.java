package com.jeahou.admin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//메인 클래스
//@Springbootapplication으로 인해 스프링부트의 자동설정, bean 읽기 생성 모두 자동으로 설정
//springbootapplication이 있는 위치부터 설정을 읽어가기 때문에 현재 클래스는 항상 프로젝트 최상단에 위치해야한다
// main 메소드에서 실행하는 springApplication.run으로 인해 내장 was를 실행합니다.
// 언제 어디서나 같은 환경에서 스프링부트를 배포 할수 있기에 내장 was를 사용하는 것을 권장
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
