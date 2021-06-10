# HTTP vs HTTPS

<br>

## HTTP
**HTTP**란 **HyperText Transfer Protocl**로 w3상에서 서버와 클라이언트가 데이터를 주고 받기 위한 요청/응답(request/response)하는 프로토콜이다.  
**응용 계층 레벨의 프로토콜**이며 TCP/IP위에서 동작한다.  
**평문 데이터**를 주고 받는다.

<br>

  ### HTTP의 단점
  - 평문통신이라서 **도청이 가능**
  - 통신 상대를 확인하지 않아서 **위장이 가능**
  - 완전성을 증명할 수 없어서 **변조가 가능**

<br>

## HTTPS
**HTTPS**는 HTTP Secure, HTTP over SSL, HTTP over TLS 등으로 불리는데 HTTPS는 **HTTP의 보안이 강화된 프로토콜**이다.  
HTTP가 통신하는 소켓 부분을 SSL(Secure Socket Layer) 또는 TLS(Transport Layer Security) 프로토콜로 대체한다.  
HTTP가 TCP와 직접 통신하였지만, HTTPS는 HTTP와 TCP 사이에 SSL이 들어가 통신하게 된다.
SSL은 공개키 암호화 방식을 사용한다.

<br>

  ### HTTPS의 단점
  - 암호화/복호화하는 과정에 리소스를 많이 소비하게 돤다.
  - HTTP에 보다 처리 속도가 느림
  - 인터넷 연결이 끊기면 재인증이 필요
