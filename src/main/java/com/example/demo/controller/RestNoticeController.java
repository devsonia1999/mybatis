package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.NoticeVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/notice/*")
public class RestNoticeController {
  @GetMapping("noticeList3")
  public String noticeList3(NoticeVO nvo) throws Exception
  {
    log.info("noticeList3");
    log.info(nvo.getN_no());
    log.info(nvo.getN_title());
    log.info(nvo.getN_content());
    return "[{n_no: 3, n_title: '제목3', n_content: '내용3'}]";
  }

  @GetMapping("noticeList2")
  //파라미터 자리에 VO타입은 추가 어노테이션없이 사용이 가능하지만
  //Map타입을 사용시에는 @RequestParam 을 생략할 수 없다!!
  public String noticeList2(@RequestParam Map<String, Object> pmap) throws Exception
  {
    log.info("noticeList2");
    log.info(pmap.get("n_title"));
    log.info(pmap.get("n_content"));
    return "[{n_no: 2, n_title: '제목2', n_content: '내용2'}]";
  }

  @GetMapping("noticeList")
  public void noticeList(HttpServletRequest request, HttpServletResponse Response)
  throws Exception
  {
    log.info("noticeList");
    log.info(request.getParameter("n_title"));
    log.info(request.getParameter("n_content"));
    Response.setContentType("application/json;charset=UTF-8");
    PrintWriter out = Response.getWriter();
    out.println("[{n_no: 1, n_title: '제목1', n_content: '내용1'}]");
    // return "noticeList";
  }
  // @GetMapping("noticeDetail")
  // @PostMapping("noticeInsert")
  // @PutMapping("noticeUpdate")
  // @DeleteMapping("noticeDelete")
}
