package DFS;

// �����࿭�� �̿��� DFS

public class dfsAdj {
	private int nV;		//������ ����
	private int[][] dfsGraph;	// �׷���
	private boolean[] visitArr;  //�湮 ���� Ȯ�� �迭
	
	public dfsAdj(int nV) {
		this.nV = nV;
		// IndexOutOf ���� ������ ���� ������ ������ 1�� ���� �ʱ�ȭ��
		this.dfsGraph = new int[this.nV+1][this.nV+1];
		this.visitArr = new boolean[this.nV+1];
	}
	
	public int[][] getGraph() {
		return this.dfsGraph;
	}
	
	//����� �׷��� �߰�
	public void put(int x, int y) {
		this.dfsGraph[x][y] = this.dfsGraph[y][x] = 1; 
	} 
	
	public void putSingle(int x, int y) {
		this.dfsGraph[x][y] = 1;
	}
	
	//������� ���
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
