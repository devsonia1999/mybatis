package com.example.demo.vo;

import lombok.Data;
//롬복 라이브러리를 추가하면 getter/setter 역할을 하는 클래스에
//getter/setter 메서드를 추가하지 않아도 된다!

@Data
public class TestVO {
  private int t_no = 0;
  private String t_title = null;
  private String t_content = null;
}
