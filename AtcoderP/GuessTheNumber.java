package AtcoderP;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheNumber {
	// https://freestrokes.tistory.com/87
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-------------NMWORLD에 계정 정보----------------");
		System.out.print("SNS의 친구 후보의 수는 : ");
		int N = sc.nextInt();
		
		ListGraph grap = new ListGraph(N);
		
		System.out.print("상호 팔로우가 되어 있는 관계의 수는 : ");
		int M = sc.nextInt();
		
		System.out.print("상호 블록이 되어 있는 관계의 수는 : ");
		int K = sc.nextInt();
	
		for(int i = 0 ; i < M ; i++) {
			System.out.printf("1부터 %s유저에서 팔로우할 첫번째 유저를 입력하시오 : ",N);
			int rel1 = sc.nextInt();
			
			System.out.printf("1부터 %s유저에서 팔로우할 두번째 유저를 입력하시오 : ",N);
			int rel2 = sc.nextInt();
			
			grap.put(rel1, rel2);
		}
		System.out.println("-------------팔로우 유저 입력 종료----------------");
		
		int blockrel1 = 0;
		int blockrel2 = 0;
		
		for(int i = 0 ; i < K ; i++) {
			System.out.printf("1부터 %s유저에서 불록할 첫번째 유저를 입력하시오 : ",N);
			blockrel1 = sc.nextInt();
			
			System.out.printf("1부터 %s유저에서 블록할 첫번째 유저를 입력하시오 : ",N);
			blockrel2 = sc.nextInt();
			
			System.out.printf("유저 %s님 와 유저 %s님은 블록이 되었습니다.",blockrel1, blockrel2);

			}
		
		
		System.out.println("-------------블록 유저 입력 종료----------------");
		System.out.println("\n");
		System.out.println("---------------그래프 출력------------------");
		grap.printGraphToAdjList();
		System.out.println("\n");
		System.out.println("---------------잠재 분석------------------");
		grap.potentialRel(blockrel1, blockrel2);
				
		
		for(int i = 0 ; i < N ; i++) {
			int answer = grap.potentialRel(blockrel1, blockrel2);
			System.out.print(answer + "\t");
		}
	}
	
}	


class ListGraph{
	private ArrayList<ArrayList<Integer>> listGraph;
	
	
	public ListGraph(int initSize) {
		this.listGraph = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0 ; i < initSize+1; i++) {
			listGraph.add(new ArrayList<Integer>());
		}
	}
	
	// 그래프 return
	public ArrayList<ArrayList<Integer>> getGraph() {
		return this.listGraph;
	}
	
	// 그래프의 특정 노드 return
    public ArrayList<Integer> getNode(int i) {
        return this.listGraph.get(i);
    }
 
    // 그래프 추가 (양방향)
    public void put(int x, int y) {
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }
 
    // 그래프 추가 (단방향)
    public void putSingle(int x, int y) {
        listGraph.get(x).add(y);
    }
    
    // 그래프 출력 (인접리스트)
    public void printGraphToAdjList() {
        for(int i=1; i<listGraph.size(); i++) {
            System.out.print("정점 " + i + "의 인접리스트");
                 
            for(int j=0; j<listGraph.get(i).size(); j++) {
                System.out.print(" -> " + listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    public int potentialRel(int blockrel1, int blockrel2) {
    	int count = 0;
    	for(int i = 1 ; i < listGraph.size() ; i++) {
    		System.out.printf("정점 %s의 잠재적 팔로우 친구의 수\n",i);
    		System.out.println(listGraph.get(i));
    	}
    	
    	for(int i = 1 ; i < listGraph.size() ; i++) {
    		System.out.printf("정점 %s의 현재 팔로우 친구의 수\n",i);
    		System.out.println(listGraph.get(i));
    		for(int j = 0; j < listGraph.get(i).size(); j++) {
    			System.out.println(listGraph.get(i).get(j));	
    		}
    		System.out.println("\n");
    	}
    	
    	for(int i = 1 ; i < listGraph.size(); i++) {
    		for(int j = 1 ; j < listGraph.size(); j++) {
    			if()
    		}
    	}
    	
    	for(int i = 1 ; i<listGraph.size(); i++) {
    		System.out.printf("정점 %s의 잠재적 팔로우 친구의 수\n",i);
    		for(int j = 0; j < listGraph.get(i).size(); j++) {
    			if(blockrel1 == i && blockrel2 == listGraph.get(i).get(j)) {
    				continue;
    			}
    			else if(!listGraph.get(i).get(j).equals(j)) {
    				System.out.printf("정점 %s는 %s를 팔로우 할 수 있습니다.\n",i,j);
    				count++;
    			}
    		}
    		System.out.println("\n");
    	}
    	return count/2;
    }

}	
	

