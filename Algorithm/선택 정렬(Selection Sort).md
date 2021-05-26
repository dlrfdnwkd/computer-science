# 선택 정렬(Selection Sort)

## 순서
1. [정의](#정의)
2. [복잡도](#복잡도)
3. [동작과정](#동작과정)
4. [코드](#코드)

## 정의
  최소값을 찾아서 선택한 인덱스에 값을 교체하는 정렬 알고리즘
  
## 복잡도
  - 시간복잡도 O(n^2)
  - 공간복잡도 O(n)

## 동작과정
  1. 주어진 리스트 중에 최소값을 찾는다.
  2. 그 값을 맨 앞에 위치한 값과 교체한다.
  3. 해당 위치를 제외하고 나머지 리스트를 같은 방법으로 교체한다.
  
## 코드
  ```java
  public void selection_sort(int[] array){
    int min_index, temp;    
    for(int i=0; i<array.length-1; i++){
      min_index = i;
      for(int j=i+1; j<array.length; j++){
        if(array[j] < array[min_index])
          min_index = j;
      }
      temp = array[mn_index];
      array[min_index] = array[i];
      array[i] = temp;
    }
  ```
