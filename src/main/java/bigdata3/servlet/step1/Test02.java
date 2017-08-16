/* 서블릿 만들기 : javax.servlet.Servlet 인터페이스의 메소드
 * => Servlet 인터페이스에 선언된 메소드는 서븍릿 컨테이너가 호출한다.
 * => init()
 *    - 서블릿 객체가 생성된 후 호출된다.
 *    - 서블릿이 작업하는 동안 사용할 객체를 준비시킨다.
 * => service()
 *    - 클라이언트의 실행 요청일 들어 올 때 마다 호출된다.
 *    - 서블릿이 실제 작업하는 코드를 둔다.
 * => destroy()
 *    - 웹애플리케이션이 종료되기 전에 호출한다.
 *    - 보통 init() 메소드에서 준비한 자원을 해제시키는 코드를 둔다.
 * => getServletConfig(), getServetInfo()
 *    - 서블릿 컨테이너의 관리자 페이지에서 호출한다.
 *    - 또는 service()를 실행하는 중에 필요에 따라 호출한다.
 * => 서블릿 라이프 사이클(lifecycle : 생성과 실행, 소멸)과 관련된 메소드?
 *    - init(), service(), destroy()
 */
package bigdata3.servlet.step1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step1/test02") 
public class Test02 implements Servlet {
  ServletConfig config;
  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("stpe1.Test02.init()");
    this.config = config;
  }

  @Override
  public ServletConfig getServletConfig() {
    System.out.println("step1.Test02.getServletConfig()");
    return this.config;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    getServletInfo();
    System.out.println("step1.Test02.service()");
  }

  @Override
  public String getServletInfo() {
    System.out.println("step1.Test02.getServletInfo()");
    return "Test02 Servlet";
  }

  @Override
  public void destroy() {
    System.out.println("step1.Test02.destroy()");
  }
  
}
