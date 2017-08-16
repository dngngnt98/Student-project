/* 서블릿 만들기 : javax.servlet.Servlet 인터페이스 구현
 * => 서블릿 컨테이너는 클라이언트 요청이 들어왔을때
 *    Servlet 인터페이스를 구현한 클래스를 실행한다.
 *    그래서 Servlet 인터페이스를 구현하지 않으면 클라이언트에서 실행을 요청할 수 없다.
 * => 이렇게 만든 서블릿 클래스에 대해 URL을 부여해야 한다.
 *    그래야 클라이언트에서 실행을 요청할 수 있다.
 * => 서블릿 실행을 요청하는 방법
 *    - 웹 브라우저에서 다음과 같이 URL을 작성하여 요청한다.
 *    - 문법
 *      http://서버주소:포트번호/웹애플리케이션이름/서블릿URL
 *      예)
 *      http://localhost:8080/bit-web01/step1/test01
 */
package bigdata3.servlet.step1;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step1/test01") // 클라이언트가 이 클래스를 실행 요청하려면 이 URL을 사용해야 한다.
                             // 서블릿 URL은 루트 "/"로 시작한다.
public class Test01 implements Servlet {
  ServletConfig config;
  @Override
  public void init(ServletConfig config) throws ServletException {
    // 클라이언트가 이 클래스를 실행시켜 달라고 최초 요청이 들어 왔을 때
    // 서블릿 컨테이너는 이 클래스에 객체를 만들고 이 메소드를 호출한다.
    // (물론, 이 메소드를 호출하기 전에 생성자가 먼저 호출되는 것을 당연하다.)
    // 주의!
    // => 한번 객체가 만들어지면 서버가 종료할 때까지 그 객체를 사용한다.
    //    즉 객체는 딱 한 개만 생성해서 사용한다.
    // => 클라이언트 요청이 천 번 들어 오든 만 번 들어 오든 Test01 객체는 한 개만 생성된다.
    this.config = config;
  }

  @Override
  public ServletConfig getServletConfig() {
    // Servlet Container나 이 객체를 실행할 때 Servlet 설정 정보를 다루고 싶을 때 호출된다.
    // 이 메소드는 init()가 호출될 때 파라미터로 받은  객체를 그대로 리턴한다. 
    return this.config;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    // 클라이언트가 이 클래스의 실행을 요청할 때 마다 호출된다.
  }

  @Override
  public String getServletInfo() {
    // Servlet Container의 관리자 페이지에서 Servlet에 대한 간단한 정보를 출력할 때 호출된다.
    // 간단한 Servlet 정보를 문자열로 리턴하면 된다.
    return "Test01 Servlet";
  }

  @Override
  public void destroy() {
    // 웹 애플리케이션이 종료 되기 전에 이 메소드가 호출된다.
    // 용도?
    // => 서블릿이 사용했던 자원 중에서 파일이나, 소켓, DB커넥션처럼 자원을 해제해야 하는 
    //    자원 해제를 시켜야 하는 명령을 이 메소드에서 수행한다.
  }
  
}
