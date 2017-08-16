package bigdata3.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bigdata3.dao.MemberDao;
import bigdata3.dao.StudentDao;
import bigdata3.domain.Student;
import bigdata3.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
  MemberDao memberDao;
  
  @Autowired
  StudentDao studentDao;
  
  public List<Student> list(int pageNo, int pageSize) throws Exception {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("startIndex", (pageNo - 1) * pageSize);
    valueMap.put("pageSize", pageSize);
    
    return studentDao.selectList(valueMap);
  }
}
