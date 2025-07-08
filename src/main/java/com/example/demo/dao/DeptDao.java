package com.example.demo.dao;

import com.example.demo.vo.DeptVO;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Repository
public class DeptDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate = null;

    public List<DeptVO> deptList(DeptVO dvo) {
        log.info("deptList");
        log.info(dvo);
        List<DeptVO> list = null;
        list = sqlSessionTemplate.selectList("deptList", dvo);
        return list;
    }

    public int deptDelete(DeptVO dvo) {
        log.info("deptDelete");
        int result = 0;
        result = sqlSessionTemplate.delete("deptDelete", dvo);
        return result;
    }

    // 단위테스트를 위해서 insert문 처리한 후에 commit에 대한 미처리로
    // 코드가 이상이 없없음에도 불구하고 result값이 0이 출력됨
    // 조치사항
    // 작업관리자 -> 서비스 -> 알파벳 O를 눌렀더니
    // -> 오라클 서비스와 오라클 리스너가 목록에 있음
    // -> 각각 메뉴아이템에서 오른쪽 버튼을 눌렀을 때 다시시작 메뉴아이템이 있었고
    // 이것으로 오라클 서버를 재가동 후에 토드에서 조회를 다시 조회를 해보니
    // 50번 로우가 존재하지 않았다.
    // 토드와 스프링 부트를 오가면서 insert, delete, update 번갈아
    // 요청할 때는 commit과 rollback 확인이 필요함!

    public int deptUpdate(DeptVO dvo) {
        log.info("deptUpdate");
        int result = 0;
        result = sqlSessionTemplate.update("deptUpdate", dvo);
        return result;
    }
}