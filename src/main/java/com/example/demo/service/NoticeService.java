package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.NoticeDao;
import com.example.demo.vo.NoticeVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class NoticeService {
  @Autowired
  private NoticeDao noticeDao;
  //조회
  public List<NoticeVO> noticeList(NoticeVO nvo){
    log.info("noticeList");
    List<NoticeVO> list = null;
    list = noticeDao.noticeList(nvo);
    return list;
  }

  //입력
  public int noticeInsert(NoticeVO nvo){
    log.info("noticeInsert");
    int result = 0;
    result = noticeDao.noticeInsert(nvo);
    return result;
  }

  //수정
  public int noticeUpdate(NoticeVO nvo){
    log.info("noticeUpdate");
    int result = 0;
    result = noticeDao.noticeUpdate(nvo);
    return result;
  }

  //삭제
  public int noticeDelete(int n_no){
    log.info("noticeDelete");
    int result = 0;
    result = noticeDao.noticeDelete(n_no);
    return result;
  }
}
