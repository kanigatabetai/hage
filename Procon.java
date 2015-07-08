import java.io.*;
import java.util.Arrays;
public class Procon{
		public static void main(String[] args)throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			int L;
			int N;
			L = Integer.parseInt(br.readLine());
			N = Integer.parseInt(br.readLine());
			
			
			long start = System.currentTimeMillis();
			
			int[] arrbuf = new int[N];
			int inputbuf;
			int cnt = 0;
			for(int i = 0;i < arrbuf.length;i++){
				//inputbuf = Integer.parseInt(br.readLine());
				inputbuf = i+1;
				if(inputbuf > L-2){
					//continue;
				}
				arrbuf[i] = inputbuf;
				cnt++;
			}
			int[] arr = new int[cnt];
			System.arraycopy(arrbuf, 0, arr, 0, cnt);
			
			int pat=0;
			for(int i = 0;arr[i] < L/3;i++){
//System.out.println("i="+i);
				for(int j = i+1;arr[j]<=L/2;j++){
//System.out.println(" j="+j);
					if(Arrays.binarySearch(arr,j+1,cnt,L-(arr[i]+arr[j])) > 0){
					//	System.out.println("("+arr[i]+","+arr[j]+","+(L-(arr[i]+arr[j]))+") ");
						pat++;
					}
				}
			}
			
			System.out.println(pat);
			long end = System.currentTimeMillis();
			System.out.println((end - start)+"ms");
		}
}
//ただの三重ループ
//10000行
//1232ms
//
//99999
//99999999
//833266668
//76904ms