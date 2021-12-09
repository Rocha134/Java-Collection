package libreria;
import java.util.*;
public class ejecutableCriba {
	//metodo recorre izq
	public static void recorreIz(int[]arre, int n,int posI) {
		for (int i=posI;i<(n-1);i++) {
			arre[i]=arre[i+1];
		}
		arre[n-1]=0;
	}
	//criba
	public static ArrayList<Integer> criba(int []arr){
		ArrayList<Integer> resp;

		resp=new ArrayList<Integer>();
		int mult, j, pos =0;
		for (int i = 0; i < (arr.length-1); i++) {
			mult = arr[pos];
			j=pos+1;
			while(arr[j] != 0) {
				if (arr[j]%mult == 0) {
					resp.add(arr[j]);
					recorreIz(arr,arr.length,j);
				}
				j++;
			}
			pos++;
		}
		
		return resp;
	}
	//metodo 2
	public static ArrayList<Integer> criba2(int []arre){
		ArrayList<Integer> resp;
		resp=new ArrayList<Integer>();
		for (int i=2;i<arre.length;i++) {
			int cont =0;
			while(arre[i]%i+2!=0) {
				cont++;
			}
			if (cont>1) {
				resp.add(arre[i]);
			}
		}
		
		return resp;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lee;
		lee=new Scanner(System.in);
		int M;
		System.out.println("Dame el valor de M");
		M=lee.nextInt();
		int [] arre;
		arre=new int[M-1];
		for (int i=0;i<=(M-2);i++) {
			arre[i]=i+2;
		}
		for (int i=0;i<arre.length;i++)
			System.out.print(arre[i]+",");
		System.out.println();
		//recorre izq
		/*recorreIz(arre,(M-1),1);
		for (int i=0;i<arre.length;i++)
			System.out.print(arre[i]+",");
		System.out.println();*/
		//criba
		ArrayList<Integer> l=criba(arre);
		for (int i=0;i<arre.length;i++)
			System.out.print(arre[i]+",");
		System.out.println();
		System.out.println("arrrayList "+l);
	}

}
