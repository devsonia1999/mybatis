package com.example.demo.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.testVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
public class TestDao {
  @Autowired
  private SqlSessionTemplate sqlSessionTemplate = null;
  public List<testVO> testList() {
    log.info("testList");
    List<testVO> list = null;
    list = sqlSessionTemplate.selectList("testList", null);
    return list;
  }
  
}
