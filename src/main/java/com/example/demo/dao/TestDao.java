package com.example.demo.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.TestVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
public class TestDao {
  @Autowired
  private SqlSessionTemplate sqlSessionTemplate = null;
  public List<TestVO> testList() {
    log.info("testList");
    List<TestVO> list = null;
    list = sqlSessionTemplate.selectList("testList", null);
    return list;
  }
  public int testInsert(TestVO tvo) {
    log.info("testInsert");
    int result = 0;
    result = sqlSessionTemplate.insert("testInsert",tvo);
    return result;
  }
  public int testUpdate(TestVO tvo) {
    log.info("testUpdate");
    int result = 0;
    result = sqlSessionTemplate.update("testUpdate",tvo);
    return result;
  }
  public int testDelete(int t_no) {
    log.info("testDelete");
    int result = 0;
    result = sqlSessionTemplate.delete("testDelete",t_no);
    return result;
  }
  
}
