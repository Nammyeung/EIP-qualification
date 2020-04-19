package AtcoderP;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheNumber {
	// https://freestrokes.tistory.com/87
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-------------NMWORLD�� ���� ����----------------");
		System.out.print("SNS�� ģ�� �ĺ��� ���� : ");
		int N = sc.nextInt();
		
		ListGraph grap = new ListGraph(N);
		
		System.out.print("��ȣ �ȷο찡 �Ǿ� �ִ� ������ ���� : ");
		int M = sc.nextInt();
		
		System.out.print("��ȣ ����� �Ǿ� �ִ� ������ ���� : ");
		int K = sc.nextInt();
	
		for(int i = 0 ; i < M ; i++) {
			System.out.printf("1���� %s�������� �ȷο��� ù��° ������ �Է��Ͻÿ� : ",N);
			int rel1 = sc.nextInt();
			
			System.out.printf("1���� %s�������� �ȷο��� �ι�° ������ �Է��Ͻÿ� : ",N);
			int rel2 = sc.nextInt();
			
			grap.put(rel1, rel2);
		}
		System.out.println("-------------�ȷο� ���� �Է� ����----------------");
		
		int blockrel1 = 0;
		int blockrel2 = 0;
		
		for(int i = 0 ; i < K ; i++) {
			System.out.printf("1���� %s�������� �ҷ��� ù��° ������ �Է��Ͻÿ� : ",N);
			blockrel1 = sc.nextInt();
			
			System.out.printf("1���� %s�������� ����� ù��° ������ �Է��Ͻÿ� : ",N);
			blockrel2 = sc.nextInt();
			
			System.out.printf("���� %s�� �� ���� %s���� ����� �Ǿ����ϴ�.",blockrel1, blockrel2);

			}
		
		
		System.out.println("-------------��� ���� �Է� ����----------------");
		System.out.println("\n");
		System.out.println("---------------�׷��� ���------------------");
		grap.printGraphToAdjList();
		System.out.println("\n");
		System.out.println("---------------���� �м�------------------");
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
	
	// �׷��� return
	public ArrayList<ArrayList<Integer>> getGraph() {
		return this.listGraph;
	}
	
	// �׷����� Ư�� ��� return
    public ArrayList<Integer> getNode(int i) {
        return this.listGraph.get(i);
    }
 
    // �׷��� �߰� (�����)
    public void put(int x, int y) {
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }
 
    // �׷��� �߰� (�ܹ���)
    public void putSingle(int x, int y) {
        listGraph.get(x).add(y);
    }
    
    // �׷��� ��� (��������Ʈ)
    public void printGraphToAdjList() {
        for(int i=1; i<listGraph.size(); i++) {
            System.out.print("���� " + i + "�� ��������Ʈ");
                 
            for(int j=0; j<listGraph.get(i).size(); j++) {
                System.out.print(" -> " + listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    public int potentialRel(int blockrel1, int blockrel2) {
    	int count = 0;
    	for(int i = 1 ; i < listGraph.size() ; i++) {
    		System.out.printf("���� %s�� ������ �ȷο� ģ���� ��\n",i);
    		System.out.println(listGraph.get(i));
    	}
    	
    	for(int i = 1 ; i < listGraph.size() ; i++) {
    		System.out.printf("���� %s�� ���� �ȷο� ģ���� ��\n",i);
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
    		System.out.printf("���� %s�� ������ �ȷο� ģ���� ��\n",i);
    		for(int j = 0; j < listGraph.get(i).size(); j++) {
    			if(blockrel1 == i && blockrel2 == listGraph.get(i).get(j)) {
    				continue;
    			}
    			else if(!listGraph.get(i).get(j).equals(j)) {
    				System.out.printf("���� %s�� %s�� �ȷο� �� �� �ֽ��ϴ�.\n",i,j);
    				count++;
    			}
    		}
    		System.out.println("\n");
    	}
    	return count/2;
    }

}	
	

