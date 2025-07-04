package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestDao;
import com.example.demo.vo.testVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class TestService {
  @Autowired
  private TestDao testDao = null;

  public List<testVO> testList() {
    log.info("testList");
    List<testVO> list = null;
    list = testDao.testList();
    return list;
  }
}
