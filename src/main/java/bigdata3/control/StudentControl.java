package bigdata3.control;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bigdata3.domain.Student;
import bigdata3.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentControl {
  @Autowired StudentService studentService;
  @Autowired ServletContext servletContext;
  
  
  @RequestMapping("list")
  public String list( @RequestParam(defaultValue="1") int pageNo, @RequestParam(defaultValue="5") int pageSize, Model model) throws Exception {
    List<Student> list = studentService.list(pageNo, pageSize);
      model.addAttribute("list", list);
        return "student/list";
  }
  
  @RequestMapping("form")
  public void form() {
  }
}
