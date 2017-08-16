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
  public void add(Student student) throws Exception {
    memberDao.insert(student);
    studentDao.insert(student); 
  }
  
  public void update(Student student) throws Exception {
    int count = memberDao.update(student);
    if (count < 1) {
      throw new Exception(student.getNo() + "번 학생을 찾을 수 없습니다.");
    }
}
