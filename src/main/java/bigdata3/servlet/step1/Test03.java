/* 서블릿 만들기 : javax.servlet.GenericServlet 추상 클래스
 * => Servlet 인터페이스를 구현한 추상 클래스이다.
 * => "추상 클래스"의 목적?
 *    - 추상 클래스는 그 자신을 직접 사용하기 위해서 만든 클래스가 아니다.
 *    - 서브 클래스에게 필드나 메소드를 상속해주기 위해 만든 클래스이다.
 * => Genericservlet 추상 클래스?
 *    - 즉 서블릿 인터페이스에 선언된 메소드 중에서 다음의 메소드를 구현하였다.
 *      init(), destroy(), getServletInfo(), getServletConfig()
 *    - 서블릿 클래스에게 이 메소드들을 상속해 준다.
 *    - 개발자들이 서블릿 클래스를 만들 때 Servlet 인터페이스를 직접 구현하는 것 보다
 *      이 추상 클래스를 상속 받아서 service() 메소드만 구현하면 편하다.
 * => 상속 관계
 *    Servlet 인터페이스
 *      => GenericServlet 추상 클래스
 *        => Test03
 */
package bigdata3.servlet.step1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step1/test03") 
public class Test03 extends GenericServlet {
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("step1.Test03.service()");
  }
}
