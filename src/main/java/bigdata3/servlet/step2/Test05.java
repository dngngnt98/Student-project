/* 클라이언트가 보낸 값 꺼내기: get 요청과 post 요청
 * => get 요청 예:
-------------------------------------------------------------------------------
GET /bit-web01/step2/test05?name=%EC%9E%84%EA%BA%BD%EC%A0%95&age=30 HTTP/1.1
Host: localhost:8080
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,...
Referer: http://localhost:8080/bit-web01/step2/test05.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4

-------------------------------------------------------------------------------
 * => GET 요청 특징
 *    - URL에 보내는 데이터가 포함되어 있다.
 *    - URL에 데이터가 포함되어 있기 때문에 "즐겨 찾기"에 저장하거나,
 *      이메일이나 게시판에 글을 올릴 때 데이터와 함께 URL을 올릴 수 있다.
 *      예) 검색URL, 게시판조회URL 등  
 *      그래서 링크를 클릭하는 순간 원하는 결과를 바로 얻을 수 있다.
 * => GET 요청의 문제점
 *    - URL에 보내는 데이터가 포함되기 때문에 외부에 쉽게 노출되어 보안에 취약하다.
 *      즉 웹브라우저의 캐시에 보관되기 때문에 타인에게 쉽게 노출될 수 있다.
 *    - 그래서 데이터가 노출되어서는 안되는 부분에는 get 요청을 해서는 안된다.
 *      예) 로그인 등
 *    - 데이터를 URL에 포함시켜야 하는데, 웹서버 마다 URL의 크기를 제한한다.
 *      그래서 대용량의 데이터를 보낼 수 없다. 
 *    - URL은 문자열이다. 문자열에 바이너리 데이터를 포함할 수 없다.
 *      그래서 바이너리 데이터(그림, 동영상, 음성 등)를 전송할 수 없다.
 *      (Base64로 인코딩 하면, 바이너리 데이터를 문자열 형식으로 변환할 수 있고 따라서 
 *       GET으로도 보낼 수 있다. 그러나 URL의 크기 제한 때문에 역시 대용량 데이터를 보낼 수 없다.
 *       그래서 파일 업로드를 할 때는 GET 요청을 하지 않는 것이다.)   
 * => GET 요청을 적용하는 분야
 *    - 주로 데이터를 조회하는 서비스에 대해 get 요청을 보내면 된다.   
 *    - 예) 회원정보조회, 게시물조회, 블로그조회 등 
 *    
 *    
 *    
 *    
 * => post 요청 예:
-------------------------------------------------------------------------------
POST /bit-web01/step2/test05 HTTP/1.1
Host: localhost:8080
Content-Length: 39
Cache-Control: max-age=0
Origin: http://localhost:8080
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36
Content-Type: application/x-www-form-urlencoded
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,...
Referer: http://localhost:8080/bit-web01/step2/test05.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4

name=%EC%9C%A0%EA%B4%80%EC%88%9C&age=16
-------------------------------------------------------------------------------
 * => POST 요청 특징
 *    - URL에 보내는 데이터가 포함되어 있지 않다. 대신 message-body 부분에 보내는 데이터가 있다.
 *    - URL에 데이터 포함되어 있지 않기 때문에 "즐겨 찾기"에 저장해봐야 소용없다.
 *      즉 이메일로 URL을 보내봐야 소용없다.
 *    - URL에 데이터가 포함되어 있지 않기 때문에 웹브라우저의 캐시에 보관되지 않는다. 
 *      그래서 데이터가 노출되지 않아야 하는 부분에서는 POST 요청을 하라.
 *    - HTTP 요청의 맨 끝인 message-body 부분에 데이터를 보내기 때문에
 *      대용량의 데이터를 보낼 수 있다. 
 *    - "멀티파트 전송 방식"을 사용하면 대용량 바이너리 데이터를 보낼 수 있다.
 * => POST 요청을 적용하는 분야
 *    - 데이터가 URL에 노출되지 않기 때문에, 주로 입력 서비스에 적용한다.    
 *    - 예) 로그인, 회원가입, 게시물등록, 댓글등록, 댓글수정, 게시물수정 등
 */
package bigdata3.servlet.step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step2/test05")
public class Test05 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // getParameter() 메서드는 get이든 post이든 상관없이 데이터를 꺼낼 수 있다.
    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));
    
    resp.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = resp.getWriter();
    out.printf("요청명령=%s\n", req.getMethod());
    out.printf("name=%s\n", name);
    out.printf("age=%d\n", age);
  }
}










