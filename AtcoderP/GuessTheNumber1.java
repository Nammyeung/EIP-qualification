package AtcoderP;

import java.io.IOException;
import java.util.Scanner;

// https://freestrokes.tistory.com/87
public class GuessTheNumber1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է��Ͻÿ� : ");
		int N = sc.nextInt();
		
		ArrGraph server = new ArrGraph(N);
		
		System.out.print("�ȷο� ������ ���� �Է��Ͻÿ� : ");
		int M = sc.nextInt();
		System.out.print("����� ������ ���� �Է��Ͻÿ� : ");
		int K = sc.nextInt();
		
		for(int i = 0 ; i < M ; i++) {
		System.out.print((i+1) + "��° �ȷο� ���踦 �Է��Ͻÿ� : ");	
		String input = sc.next();
		String[] input1 = input.split(",");
		server.put(Integer.parseInt(input1[0]), Integer.parseInt(input1[1]));	
					
//		System.out.print(i+1 + "��° �ȷο� ���踦 �Է��Ͻÿ� : ");
//		int firstuser = sc.nextInt();
//		System.out.print(i+1 + "��° �ȷο� ���踦 �Է��Ͻÿ� : ");
//		int seconduser = sc.nextInt();
//		server.put(firstuser, seconduser);
		}
		
		for(int i = 0 ; i < K ; i++) {
		System.out.print((i+1) + "��° ��� ���踦 �Է��Ͻÿ� : ");
		String blockinput = sc.next();
		String[] blockinput1 = blockinput.split(",");
		server.putblock(Integer.parseInt(blockinput1[0]), Integer.parseInt(blockinput1[1]));	
//		System.out.print(blockinput1[0]);
		}
		System.out.println("\n");
		System.out.println("------------------------�ȷο� �׷���-------------------------");
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
	
	// �׷��� return
    public int[][] getGraph() {
        return this.arrGraph;
    }
 
    // �׷��� �߰� (�����)
    public void put(int x, int y) {
        arrGraph[x][y] = arrGraph[y][x] = 1;
    }
 
    public void putblock(int x, int y) {
    	arrGraph[x][y] = arrGraph[y][x] = -1;
    }
    
    // �׷��� �߰� (�ܹ���)
    public void putSingle(int x, int y) {
        arrGraph[x][y] = 1;
    }
    
    // �׷��� ��� (�������)
    public void printGraphToAdjArr() {
    	System.out.print("   ");
    	for(int i = 1 ; i < arrGraph.length ; i++) {
    	System.out.print(i + "�� ");
    	}
    	System.out.print("\n");
        for(int i=1 ; i<arrGraph.length; i++) {
        	System.out.print(i + "�� ");
            for(int j=1 ; j<arrGraph[i].length; j++) {
                System.out.print(" " + arrGraph[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void printPotentialRel() {
    	System.out.println("-----------------������ ������ �ȷο��� ��----------------");
    	for(int i = 1 ; i < arrGraph.length ; i++) {
        	System.out.print("���� " + i +"\t");
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