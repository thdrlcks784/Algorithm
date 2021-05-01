package DFS;

// 인접행열을 이용한 DFS

public class dfsAdj {
	private int nV;		//정점의 개수
	private int[][] dfsGraph;	// 그래프
	private boolean[] visitArr;  //방문 여부 확인 배열
	
	public dfsAdj(int nV) {
		this.nV = nV;
		// IndexOutOf 오류 방지를 위해 정점의 개수에 1을 더해 초기화함
		this.dfsGraph = new int[this.nV+1][this.nV+1];
		this.visitArr = new boolean[this.nV+1];
	}
	
	public int[][] getGraph() {
		return this.dfsGraph;
	}
	
	//양방향 그래프 추가
	public void put(int x, int y) {
		this.dfsGraph[x][y] = this.dfsGraph[y][x] = 1; 
	} 
	
	public void putSingle(int x, int y) {
		this.dfsGraph[x][y] = 1;
	}
	
	//인접행렬 출력
	public void printGraphToAdjArr() {
		for(int i = 0; i<this.dfsGraph.length;i++) {
			System.out.print("[ ");
			for(int j = 0;j<this.dfsGraph[i].length;j++) {
				System.out.print(this.dfsGraph[i][j] + " ");
			}
			System.out.println("]");
		}
	}
	
	public void clearVisitArr() {
		for(int i = 0; i<this.visitArr.length; i++) {
			this.visitArr[i] = false;
		}
	}
	
	public void dfs(int vIndex) {
		this.visitArr[vIndex] = true;
		System.out.print(vIndex + " ");
		for(int i =1;i<=this.nV;i++) {
			if(dfsGraph[vIndex][i]==1 && !visitArr[i]) {
				dfs(i);
			}
		}
	}
}
