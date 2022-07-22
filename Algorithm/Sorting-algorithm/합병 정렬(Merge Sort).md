# 합병 정렬(Merge Sort)

## 순서
1. [정의](#정의)
2. [복잡도](#복잡도)
3. [동작과정](#동작과정)
4. [코드](#코드)

## 정의
  최소단위로 분할하여 결합하면서 정렬하는 알고리즘
  <br>
  분할 정복 알고리즘의 하나이며 안정정렬에 속함
  
## 복잡도
  - 시간복잡도 O(n log n) 
  - 공간복잡도 O(n)

## 동작과정
  1. 리스트의 길이가 1이면 이미 정렬된 것으로본다.
  2. **분할(divide)** : 그렇지 않은 경우, 리스트를 절반으로 나누어 비슷한 크기의 두 부분 리스트로 분리한다.
  3. **정복(conquer)** : 각 부분 리스트를 재귀적으로 합병 정렬을 이용하여 정렬한다.
  4. **결합(combine)** : 두 부분 리스트를 하나의 정렬된 리스트로 합병한다. 이 리스트는 임시배열에 저장된다.
  5. **복사(copy)** : 임시 배열에 저장된 결과를 원래 배열에 복사한다.
  
## 코드
  ```java
  int n = array.length;
  int[] temp = new int[n];
  public void merge_sort(int[] array, int start, int end){
    if(start<end){
      int mid = (start+end) / 2;
      merge_sort(array, start, mid);
      merge_sort(array, mid+1, end);
      
      int left = start;
      int right = mid+1;
      int index = left;
      
      while(left<=mid || right<=end){
        if(right>end || (left<=mid && array[left]<=array[right])){
          temp[index++] = array[left++];
        }else{
          temp[index++] = array[right++];
        }
      }
      
      for(int i=start;i<=end;i++){
        array[i] = temp[i];
      }
    }
  }
  ```
