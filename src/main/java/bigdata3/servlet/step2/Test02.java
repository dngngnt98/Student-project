/* 클라이언트로 출력하기 : 한글이 깨지는 이유
 * => getWrter()가 리턴한 출력 도구는 기본적으로 ISO-8859
 * 
 */
package bigdata3.servlet.step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step2/test02")
public class Test02 extends HttpServlet{

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 자바에서는 문자열을 2바이트 유니코드를 사용하여 표현한다.
    // 이 유니코드를 출력할 때 어떤 문자셋을 가지고 변환하여 출력할 것인지 설정해야 한다.
    // "text/html" => MIME 타입이다. 웹 서버가 보내는 데이터가 무슨 데이터인지 클라이언트에게 알려준다.
    //                널리 알려진 데이터 형식에 대해 MIME 타입이 부여되어 있다.
    //                그래서 데이터의 형식을 표현할 때는 가능한 기존에 정의된 MIME 타입을 사용하라!
    // "charset=UTF-8" => 자바 유니코드를 UTF-8 코드로 변환하여 출력하라는 명령이다.
    //                    보통 국제적으로 다국어를 출력할 때 오리지널 유니코드를 사용하지 않고
    //                    이렇게 UTF-8을 사용한다.
    resp.setContentType("text/plane;charset=UTF-8");
    // 출력 도구를 얻는다.
    PrintWriter out =  resp.getWriter();
    // 출력한다.
    out.println("Hello");
    out.println("안녕하세요");
    out.println("오하이오");
  }
  
}
