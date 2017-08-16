package bigdata3.service;

import java.util.List;

import bigdata3.domain.Student;

public interface StudentService {
  List<Student> list(int pageNo, int pageSize) throws Exception;
<<<<<<< HEAD
  void add(Student student) throws Exception; 
=======
  void add(Student student) throws Exception;
  void update(Student student) throws Exception;
>>>>>>> branch 'master' of https://github.com/dngngnt98/Student-project.git
}