# Web Server vs WAS

<br>

![image](https://user-images.githubusercontent.com/38275652/122181763-9c87f600-cec4-11eb-984a-628e2b8d7786.png)


<br>

## Web Server
  ### 기능
  - HTTP 프로토콜을 통해 html, js, css, image 등 **정적 페이지 제공**
  - 동적인 요청이 들어왔을 때, 해당 요청을 **컨테이너로 보내주는 역할**
  ### 종류
  - Apache, Nginx, IIS 등

<br>

## WAS(Web Application Server)
  ### 구조
  - 웹 서버 + 웹 컨테이너
  ### 기능
  - **동적 페이지 제공**
  - **프로그램 실행 환경**과 **데이터베이스 접속 기능 제공**
  - 여러 개의 **트랜잭션 관리**
  - **비즈니스 로직 수행**
  ### 종류
  - Tomcat, JBoss, JRun, JEUS 등

<br>

## Web Server, WAS 구분 이유
1. 기능을 분리하여 서버 부하 방지
  - WAS는 정적, 동적페이지 제공이 가능하지만 정적 페이지를 Web Server가 제공한다면 빠르게 제공할 수 있으며 WAS 서버 부하를 방지할 수 있음
2. 물리적으로 분리하여 보안 강화
  - SSL에 대한 암/복호화 처리에 Web Server를 사용
3. 여러 대의 WAS를 연결 가능
  - Load Balancing을 위해 Web Server 사용
  - 장애 극복에 유리함
4. 여러 웹 어플리케이션 서비스 가능
  - 하나의 서버에서 PHP Application과 Java Application을 함께 사용 가능 

<br>

## Reference
- http://melonicedlatte.com/web/2019/06/23/210300.html
- https://gmlwjd9405.github.io/2018/10/27/webserver-vs-was.html
