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
		
        // ���� ������� �׷��� Ž��
        System.out.println();
        System.out.print("���� 1���� Ž�� : ");
        dfs.dfs(1);
        
        System.out.println();
        System.out.print("���� 2���� Ž�� : ");
        dfs.clearVisitArr();
        dfs.dfs(2);
        
        System.out.println();
        System.out.print("���� 3���� Ž�� : ");
        dfs.clearVisitArr();
        dfs.dfs(3);
        
        System.out.println();
        System.out.print("���� 4���� Ž�� : ");
        dfs.clearVisitArr();
        dfs.dfs(4);
        
        System.out.println();
        System.out.print("���� 5���� Ž�� : ");
        dfs.clearVisitArr();
        dfs.dfs(5);
        
        System.out.println();
        System.out.print("���� 6���� Ž�� : ");
        dfs.clearVisitArr();
        dfs.dfs(6);
        
        System.out.println();
        System.out.print("���� 7���� Ž�� : ");
        dfs.clearVisitArr();
        dfs.dfs(7);
        
        System.out.println();
        System.out.print("���� 8���� Ž�� : ");
        dfs.clearVisitArr();
        dfs.dfs(8);

	}
}
