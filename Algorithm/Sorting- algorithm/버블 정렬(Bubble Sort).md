# 버블 정렬(Bubble Sort)

## 순서
1. [정의](#정의)
2. [복잡도](#복잡도)
3. [동작과정](#동작과정)
4. [코드](#코드)

## 정의
  서로 인접한 두 원소를 비교하여 정렬하는 알고리즘
  
## 복잡도
  - 시간복잡도(최선) O(n)
  - 시간복잡도(평균,최악) O(n^2) 
  - 공간복잡도 O(n)

## 동작과정
  1. 인접한 두 원소를 비교하여 큰 수를 뒤로 교환한다
  2. 해당 작업을 마지막 인덱스까지 반복 비교한다.
  3. 마지막 인덱스까지 비교한 후 마지막 인덱스를 제외하고 n-1회차까지 1-3방법을 반복한다.
  
## 코드
  ```java
  void bubble_sort(int[] array){
    int temp = 0;
    for(int i=0;i<array.length-1;i++){
      for(int j=1;j<array.length-i;j++){
        if(array[j]<array[j-1]){
          temp = array[j-1];
          array[j-1] = array[j];
          array[j] = temp;
        }
      }
    }
  }
  ```
