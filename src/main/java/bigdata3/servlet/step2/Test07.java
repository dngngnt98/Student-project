/* 클라이언트가 보낸 데이터의 한글이 깨지는 이유 
 * => GET 요청인 경우 톰캣 8부터 한글이 깨지지 않는다.
 *    그러나 그 이하 버전에서는 한글이 깨진다.
 *    만약 깨진다면 톰캣 서버의 설정 파일 중에서 다음의 파일을 편집하라
 *    <Connector port="9090" protocol="HTTP/1.1" 
 *       connectionTimeout="20000" 
 *       redirectPort="8443"
 *       URIEncoding="utf-8" />
 *     - 즉 connector 태그에 URIEncoding 속성을 추가한다.
 * => POST 요청인 경우 getParameter()를 호출하여 값을 꺼내기 전에
 */
package bigdata3.servlet.step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step2/test07")
public class Test07 extends HttpServlet {
  // service(HttpServletRequest, HttpServletresponse)를 직접 오버라이딩 하지 말고,
  // 이 메소드가 호출하는 doXxx() 메소드를 오버라이딩 하라!
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));
    resp.setContentType("text/plane;charset=UTF-8");

    PrintWriter out = resp.getWriter();
    out.println("GET 요청");
    out.println("이름:" + name);
    out.println("나이:" + age);

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    // POST 요청은 반드시 getParameter()를 최초로 호출하기 전에
    // 클라이너트가 보낸 데이터가 어떤 형식인지 
    req.setCharacterEncoding("UTF-8");
    
    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));
    resp.setContentType("text/plane;charset=UTF-8");

    PrintWriter out = resp.getWriter();
    out.println("POST 요청");
    out.println("이름:" + name);
    out.println("나이:" + age);
  }
}
