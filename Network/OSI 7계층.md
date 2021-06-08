# OSI 7계층

<br>

## OSI(Open Systems Interconnection) 7계층
  - 국제표준화기구(ISO)에서 개발한 프로토콜을 기능별로 나눈 모델
  - 각 계층은 하위 계층의 기능만을 이용, 상위 계층에게 기능을 제공
  - 통신이 일어나는 과정을 단계별로 파악할 수 있음(이상이 있는 단계만 수정 가능)

<br>

## OSI 계층 구조
  ![image](https://user-images.githubusercontent.com/38275652/121131504-df195500-c86a-11eb-9a3d-ec7558b5a4cd.png)

  <br>

  ### 1. 물리 계층(Physcial Layer)
  - 통신 단위 : **비트(Bit)**
  - 역할 : **물리적 링크의 설정, 유지, 해제를 담당**
  - 장치 : **네트워크 어댑터, 리피터, 네트워크 허브, 모뎀 등**

  <br>
 
  ### 2. 데이터 링크 계층(DataLink Layer)
  - 통신 단위 : **프레임(Frame)**
  - 역할 : **Mac주소 할당, 흐름제어, 오류제어, 재전송**
  - 장치 : **브릿지, 스위치 등**

  <br>
 
   ### 3. 네트워크 계층(Network Layer)
  - 통신 단위 : **패킷(Packet)**
  - 역할 : **라우팅, 패킷 단편화, 논리적 링크 설정**
  - 장치 : **라우터, 스위치 등**
  - 프로토콜 : **IP, ARP, RIP 등의 라우팅 프로토콜**

  <br>

   ### 4. 전송 계층(Transport Layer)
  - 통신 단위 : **세그먼트(Segment)**
  - 역할 : **메세지의 종달간 전달, 흐름제어, 오류제어**
  - 장치 : **L4 Switch 등**
  - 프로토콜 : **TCP, UDP**

  <br>

   ### 5. 세션 계층(Session Layer)
  - 통신 단위 : **데이터(Data)**
  - 역할 : **세션의 설정 및 유지, 종료**
  - 장치 : **L4 Switch 등**

  <br>

   ### 6. 표현 계층(Presentation Layer)
  - 통신 단위 : **데이터(Data)**
  - 역할 : **전송데이터의 구문과 의미에 대한 처리를 담당**

  <br>
  
   ### 7. 응용 계층(Application Layer)
  - 통신 단위 : **데이터(Data)**
  - 역할 : **응용프로세스에게 네트워크 접근 수단 제공**
  - 장치 : **Layer7 Switch 등**

  <br>
