/* 서블릿 만들기 : javax.servlet.GenericServlet 추상 클래스2
 * => HttpServlet을 상속 받아 서블릿 클래스를 만드는 이유는
 *    HttpServlet 클래스에 추가된 메소드를 이용하기 위함이다.
 *    이들 메소드에는 HTTP 프로토콜을 다루는 기능이 있다.
 */
package bigdata3.servlet.step1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step1/test05") 
public class Test05 extends HttpServlet {
  // 개발자가 서블릿을 만들 때 HttpServlet을 상속 받아 만들기로 했다면 ,
  // 어떤 메소드를 오버라이딩 할 것인지 결정해야 한다.
  
  // 2) HttpSerlet에 오버로딩 된 service()메소드를 재정의 한다.
  //    => 기존의 service() 메소드와 차이점은 파라미터이다.
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    System.out.println("step1.Test05.service()");
    
    // 파라미터 HttpServletRequest와 HttpServletResponse에는
    // 기존에 HttpServletRequest와 HttpServletResponse에 없던 기능들이 있다.
    
    // HTTP 요청 프로토콜에서 헤더 값 알아내기
    System.out.println(req.getHeader("user-Agent"));
    // 웹 브라우저가 요청한 명령을 알아내기
    System.out.println(req.getMethod());
  }
}
