package DFS;

public class dfsAdjTest {
	public static void main(String[] args) {
		int nV = 8;
		dfsAdj dfs = new dfsAdj(8);
		
		dfs.put(1, 2);
		dfs.put(1, 3);
		dfs.put(2, 4);
		dfs.put(2, 5);
		dfs.put(3, 6);
		dfs.put(3, 7);
		dfs.put(4, 8);
		dfs.put(5, 8);
		dfs.put(6, 8);
		dfs.put(7, 8);
		
		dfs.printGraphToAdjArr();
		
        // 정점 순서대로 그래프 탐색
        System.out.println();
        System.out.print("정점 1부터 탐색 : ");
        dfs.dfs(1);
        
        System.out.println();
        System.out.print("정점 2부터 탐색 : ");
        dfs.clearVisitArr();
        dfs.dfs(2);
        
        System.out.println();
        System.out.print("정점 3부터 탐색 : ");
        dfs.clearVisitArr();
        dfs.dfs(3);
        
        System.out.println();
        System.out.print("정점 4부터 탐색 : ");
        dfs.clearVisitArr();
        dfs.dfs(4);
        
        System.out.println();
        System.out.print("정점 5부터 탐색 : ");
        dfs.clearVisitArr();
        dfs.dfs(5);
        
        System.out.println();
        System.out.print("정점 6부터 탐색 : ");
        dfs.clearVisitArr();
        dfs.dfs(6);
        
        System.out.println();
        System.out.print("정점 7부터 탐색 : ");
        dfs.clearVisitArr();
        dfs.dfs(7);
        
        System.out.println();
        System.out.print("정점 8부터 탐색 : ");
        dfs.clearVisitArr();
        dfs.dfs(8);

	}
}
