package AtcoderP;

import java.io.IOException;
import java.util.Scanner;

// https://freestrokes.tistory.com/87
public class GuessTheNumber1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("유저의 수를 입력하시오 : ");
		int N = sc.nextInt();
		
		ArrGraph server = new ArrGraph(N);
		
		System.out.print("팔로우 관계의 수를 입력하시오 : ");
		int M = sc.nextInt();
		System.out.print("블록인 관계의 수를 입력하시오 : ");
		int K = sc.nextInt();
		
		for(int i = 0 ; i < M ; i++) {
		System.out.print((i+1) + "번째 팔로우 관계를 입력하시오 : ");	
		String input = sc.next();
		String[] input1 = input.split(",");
		server.put(Integer.parseInt(input1[0]), Integer.parseInt(input1[1]));	
					
//		System.out.print(i+1 + "번째 팔로우 관계를 입력하시오 : ");
//		int firstuser = sc.nextInt();
//		System.out.print(i+1 + "번째 팔로우 관계를 입력하시오 : ");
//		int seconduser = sc.nextInt();
//		server.put(firstuser, seconduser);
		}
		
		for(int i = 0 ; i < K ; i++) {
		System.out.print((i+1) + "번째 블록 관계를 입력하시오 : ");
		String blockinput = sc.next();
		String[] blockinput1 = blockinput.split(",");
		server.putblock(Integer.parseInt(blockinput1[0]), Integer.parseInt(blockinput1[1]));	
//		System.out.print(blockinput1[0]);
		}
		System.out.println("\n");
		System.out.println("------------------------팔로우 그래프-------------------------");
		server.printGraphToAdjArr();
		System.out.println("\n");
		server.printPotentialRel();
	}

}

class ArrGraph {
	private int[][] arrGraph;
	
	public ArrGraph(int initSize) {
		this.arrGraph = new int[initSize+1][initSize+1];
	}
	
	// 그래프 return
    public int[][] getGraph() {
        return this.arrGraph;
    }
 
    // 그래프 추가 (양방향)
    public void put(int x, int y) {
        arrGraph[x][y] = arrGraph[y][x] = 1;
    }
 
    public void putblock(int x, int y) {
    	arrGraph[x][y] = arrGraph[y][x] = -1;
    }
    
    // 그래프 추가 (단방향)
    public void putSingle(int x, int y) {
        arrGraph[x][y] = 1;
    }
    
    // 그래프 출력 (인접행렬)
    public void printGraphToAdjArr() {
    	System.out.print("   ");
    	for(int i = 1 ; i < arrGraph.length ; i++) {
    	System.out.print(i + "번 ");
    	}
    	System.out.print("\n");
        for(int i=1 ; i<arrGraph.length; i++) {
        	System.out.print(i + "번 ");
            for(int j=1 ; j<arrGraph[i].length; j++) {
                System.out.print(" " + arrGraph[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void printPotentialRel() {
    	System.out.println("-----------------가능한 잠재적 팔로우의 수----------------");
    	for(int i = 1 ; i < arrGraph.length ; i++) {
        	System.out.print("유저 " + i +"\t");
        	}
    	int count = 0;
    	System.out.print("\n");
    	for(int i = 1 ; i < arrGraph.length ; i++) {
    		for(int j = 1 ; j < arrGraph.length ; j++) {
    			if(i != j && arrGraph[i][j] == 0) {
    				count++;
    			}
    		}
    		System.out.print(count + "\t");
    		count = 0;
    	}
    	    	
    }

}