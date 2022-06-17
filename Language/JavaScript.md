# JavaScript

## 목록
   [호이스팅](#호이스팅hoisting)

## 호이스팅(Hoisting)
  > 현재 스코프에 있는 **모든 선언(변수 or 함수)** 을 **현재 스코프의 최상단**으로 옮겨주는 동작(=**현재 컨텍스트에 등록**하는 행위)
  
  * ### 대상
  **변수(var, let, const)** 와 **함수 선언식**
  
  * ### 이유
    자바스크립트 엔진은 해석 - 등록 - 실행순으로 진행되는데 등록과정에서 **변수와 함수선언을 현재 콘텍스트에 등록**한다.  
    그래서 호출문이 선언문보다 위에 존재하더라도 **호출이 가능**하다.
  
  * ### TDZ(Temporal Dead Zone)  일시적 사각지대
    const, let 같은 변수들도 **호이스팅이 되기는 하지만** 초기화 하기 전 **값을 참조하면 에러**가 나온다.(ReferenceError)
    그래서 현재 스코프 시작부터 변수 초기화 단계까지의 구간을 **TDZ**라고 한다.
  
  * ### 코드
    * #### var
      ```javascript
        console.log(name);  //undefined
        name = "Hoisting";
        console.log(name);  //Hoisting
        var name;
      ```

    * #### function
      ```javascript
        printName("Hoisting");  //Name is Hoisting
        function  printName(name){
          console.log("Name is "+name);
        }
      ```
    
    * #### let, const
      > 초기화 하기 전 참조에러
      ```javascript
        console.log(name);  //RefrenceError
        name = "Hoisting"; //RefrenceError
        let name;
      ```
      
  * ## Reference
    - https://developer.mozilla.org/ko/docs/Glossary/Hoisting
    - https://www.w3schools.com/js/js_hoisting.asp
    - https://kimmeh1.tistory.com/375
    - https://noogoonaa.tistory.com/78
