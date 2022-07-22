# 퀵 정렬(Quick Sort)

## 순서
1. [정의](#정의)
2. [복잡도](#복잡도)
3. [동작과정](#동작과정)
4. [코드](#코드)

## 정의
  피벗을 정해서 피벗을 기준으로 왼쪽, 오른쪽으로 정렬하는 알고리즘
  
## 복잡도
  - 시간복잡도(최선,평균) O(n log n)
  - 시간복잡도(최악) O(n^2) 
  - 공간복잡도 O(n)

## 동작과정
  1. 배열 값 중 피벗을 정한다.(맨 앞,맨 뒤, 중간값, 랜덤 값)
  2. 가장 오른쪽 배열의 인덱스부터 피벗과 비교한다. 피벗보다 큰 경우 작은 값을 찾을때까지 왼쪽으로 이동하면서 비교를 반복한다.
  3. 가장 왼쪽 배열의 인덱스부터 피벗과 비교한다. 피벗보다 작을 경우 큰 값을 찾을때까지 오른쪽으로 이동하면서 비교를 반복한다.
  4. 그리고 값을 찾을겨우 왼쪽과 오른쪽 값을 교환한다.
  5. 2-3과정을 서로 교차할때까지 반복한다.
  6. 왼쪽 기준점과 오른쪽 기준점이 교차하면 왼쪽과 피벗을 교환한다.
  7. 피벗을 기준으로 왼쪽 배열과 오른쪽 배열에 위 과정을 반복한다.
  
## 코드
  ```java
  public void quick_sort(int[] array, int left, int right){
    int i, j, pivot, temp;
    if(left < right){
      i = left;
      j = right;
      pivot = array[(left+right)/2)];
      
      while(i < j){
        while(array[j] > pivot) j--;
        while(i < j && array[i] < pivot) i++;
        
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
      quick_sort(array, left, i-1);
      quick_sort(array, i+1, right);
    }
  }
  ```
