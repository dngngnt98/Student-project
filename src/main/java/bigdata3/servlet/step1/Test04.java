/* 서블릿 만들기 : javax.servlet.GenericServlet 추상 클래스
 * => GeneircServlet 추상 클래스의 서브 클래스이다.
 * => GenericServlet 클래스에는 없는 HTTP 프로토콜을 다루는 기능을 포함하고 있다.
 *    HTTP 프로토콜을 다루려면 이 클래스를 상속 받아 서블릿을 만드는 것이 편리하다.
 * => HttpServlet 추상 클래스는 service()메소드를 구현하였다.
 *    service(ServletRequest, ServletResponse) 메소드가 호출되면 내부적으로 다음 메소드를 호출한다.
 *    => servlet(HttpServletRequest, HttpServletResponse) 메소드는 또 다음 메소드를 호출한다.
 *      - 이 메소드는 클라이언트의 요청 명령에 따라 다음 메소드를 호출한다.
 *      => doGet(HttpServletRequest, HttpServletResponse) : GET 명령
 *      => doPost(HttpServletRequest, HttpServletResponse) : POST 명령
 *      => doHead(HttpServletRequest, HttpServletResponse) : HEAD 명령
 *      => doDelete(HttpServletRequest, HttpServletResponse) : DELETE 명령
 *      => doPut(HttpServletRequest, HttpServletResponse) : PUT 명령
 *      ...
 *      
 *      
 * => 상속 관계
 *    Servlet 인터페이스
 *      => GenericServlet 추상 클래스
 *        => HttpServlet 추상 클래스
 *          => Test04 서블릿 클래스
 */
package bigdata3.servlet.step1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/step1/test04")
public class Test04 extends HttpServlet {
  // 개발자가 서블릿을 만들 때 HttpServlet을 상속 받아 만들기로 했다면 ,
  // 어떤 메소드를 오버라이딩 할 것인지 결정해야 한다.

  // 1) Servlet 인터페이스에 선언된 오리지널 service()를 구현하고 싶다면 다음과 같이 오버라이딩 한다.
  // 그러면 GenericServlet 클래스를 상속 받은 것과 마찬가지이다.
  // => 이 메소드를 오버라이딩 할 것 같으면 굳이 HttpServlet 클래스를 상속 받을 필요가 없었다.
  // 그냥 이전 예제처럼 GenericServlet클래스를 상속 받으면 된다.
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("step1.Test04.service()");

    // ServletRequest와 ServletResponsedps 에는 HTTP 프로토콜을 다루는 메소드가 없다.
    // System.out.println(req.getHeader("user-Agent")); // 컴파일 오류!
  }
}
