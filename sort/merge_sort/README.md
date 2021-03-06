 # merge sort
 > 오름차순 기준
  ## 알고리즘의 개념
    * 하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음 두 개의 정렬된 부분 리스트를
      합하여 전체가 정렬된 리스트로 되게 하는 방법
    * 합병 정렬은 다음 3개의 단계를 거친다
      * 분할(Divide) : 입력받은 배열은 같은 크기의 2개의 부분 배열로 분할한다.
      * 정복(Comquer) : 부분 배열을 정렬한다. 만약 부분 배열의 크기가 충분히 작지 않으면 순환 호출을 이용하여 다시 분할을 적용한다.
      * 결합(Combine) : 정렬된 부분 배열들을 하나의 배열에 합병한다
  ## 특징
    * 장점
      * 안정적인 정렬 시간(항상 O(nlogn) 으로 동일한 시간복잡도)
      * 레코드를 LinkedList로 구성한다면 링크 인덱스만 변경되므로 데이터 이동은 무시할 수 있을 정도로 작아진다
      * 따라서 크기가 큰 레코드를 정렬할 경우 연결 리스트를 사용한다면 다른 어떤 정렬 방법보다 효율적이다
    * 단점
      * 레코드가 배열일 경우 임시 배열이 필요
      * 레코드들의 크기가 큰 경우 이동횟수가 많아 비효율적
  ## 예제
![mergeSort](https://user-images.githubusercontent.com/64050689/116818440-542ba780-aba6-11eb-829e-cf43d71cbe9a.gif)
  ###### 출처 : https://coding-factory.tistory.com/615
