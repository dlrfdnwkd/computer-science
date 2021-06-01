# 삽입 정렬(Insertion Sort)

## 순서
1. [정의](#정의)
2. [복잡도](#복잡도)
3. [동작과정](#동작과정)
4. [코드](#코드)

## 정의
  앞에서부터 차례대로 정렬된 배열 부분과 비교하여 값이 들어갈 위치를 찾아 삽입해주는 정렬 알고리즘
  
## 복잡도
  - 시간복잡도(최선) O(n)
  - 시간복잡도(평균,최악) O(n^2) 
  - 공간복잡도 O(n)

## 동작과정
  1. 정렬 되어있지 않는 배열에서 값을 선택한다.(처음은 두번째값)
  2. 해당 값을 정렬된 배열 부분과 비교하여 작으면 인덱스를 -1하고 비교를 반복한다.
  3. 변수 값이 더 큰 경우 비교 인덱스 +1에 삽입한다.
  
## 코드
  ```java
  void insertion_sort(int[] array){
    for(int index = 1 ; index < array.length ; index++){
    
      int temp = array[index];
      int aux = index - 1;

      while( (aux >= 0) && ( array[aux] > temp ) ) {

        array[aux+1] = array[aux];
        aux--;
      }
      array[aux + 1] = temp;
   }
  }
  ```
