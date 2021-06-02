# 힙 정렬(Merge Sort)

## 순서
1. [정의](#정의)
2. [복잡도](#복잡도)
3. [동작과정](#동작과정)
4. [코드](#코드)

## 정의
  최대 힙 트리나 최소 힙 트리를 구성해 정렬 하는 방법 *최대 힙, 최소 힙 -> 완전이진트리의 일부*
  <br>
  불안정 정렬에 속함
  
## 복잡도
  - **시간복잡도** *O(n log n)* 
  - **공간복잡도** *O(1)*

## 동작과정
  1. 최대 힙을 구성한다.
  2. 루트의 값을 마지막 요소와 바꾼 후, 힙의 사이즈를 하나 줄인다.
  3. 힙의 사이즈가 1보다 크면 위 과정을 반복한다.

  
## 코드
  ```java
  public void heap_sort(int[] array){
    int n = array.length;
    
    for(int i=n/2-1;i>=0;i--){
      heapify(array, n, i);
    }
    
    for(int i=n-1;i>0;i--){
      swap(array, 0. i);
      heapify(array, i, 0);
    }
  }
  
  public void heapify(int[] array, int n, int i){
    int parent = i;
    int left = i*2+1;
    int right = i*2+2;
    
    if(left<n && array[parent] < array[left]){
      parent = left;
    }
    
    if(right<n && array[parent] < array[right]){
      parent = right;
    }
    
    if(i != parent){
      swap(array, parent, i);
      heapfity(array, n, parent);
    }
  }
  
  public void swap(int[] array, int a, int b){
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
  ```
