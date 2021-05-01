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
		
        // Á¤Á¡ ¼ø¼­´ë·Î ±×·¡ÇÁ Å½»ö
        System.out.println();
        System.out.print("Á¤Á¡ 1ºÎÅÍ Å½»ö : ");
        dfs.dfs(1);
        
        System.out.println();
        System.out.print("Á¤Á¡ 2ºÎÅÍ Å½»ö : ");
        dfs.clearVisitArr();
        dfs.dfs(2);
        
        System.out.println();
        System.out.print("Á¤Á¡ 3ºÎÅÍ Å½»ö : ");
        dfs.clearVisitArr();
        dfs.dfs(3);
        
        System.out.println();
        System.out.print("Á¤Á¡ 4ºÎÅÍ Å½»ö : ");
        dfs.clearVisitArr();
        dfs.dfs(4);
        
        System.out.println();
        System.out.print("Á¤Á¡ 5ºÎÅÍ Å½»ö : ");
        dfs.clearVisitArr();
        dfs.dfs(5);
        
        System.out.println();
        System.out.print("Á¤Á¡ 6ºÎÅÍ Å½»ö : ");
        dfs.clearVisitArr();
        dfs.dfs(6);
        
        System.out.println();
        System.out.print("Á¤Á¡ 7ºÎÅÍ Å½»ö : ");
        dfs.clearVisitArr();
        dfs.dfs(7);
        
        System.out.println();
        System.out.print("Á¤Á¡ 8ºÎÅÍ Å½»ö : ");
        dfs.clearVisitArr();
        dfs.dfs(8);

	}
}
