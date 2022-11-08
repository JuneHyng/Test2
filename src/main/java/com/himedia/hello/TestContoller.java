package com.himedia.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TestContoller {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("testVO")
    public List<TestVO> voTest(){
        List<TestVO> list=new ArrayList<TestVO>();
        for(int i=0;i<10;i++) {
            TestVO vo = new TestVO();
            vo.setSeq(0);
            vo.setName("홍길동" + i);
            vo.setPassword("1234");
            vo.setContent(i + "번째 테스트용");
            vo.setCreated_at(new Date());
            list.add(vo);
        }
        return list;
    }
}
