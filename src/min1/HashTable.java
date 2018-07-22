package min1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HashTable<K, V> {
	private int n; //number of items in the table
	private int m; //table size
	private K[] keys;
	private V[] values;
	
	public HashTable(int capacity) {
		m = capacity;
		n = 0;
		keys = (K[]) new Object[m];
		values = (V[]) new Object[m];
	}
	
	private int hashValue(K key) {
		int hv = (key.hashCode() & 0x7fffffff) % m;
		return hv;
	}
	
	public void put(K key, V val) {
		if(key!=null && val!=null) { //nullPointer 방지
			
			if ((double)(n+1)/m >= 0.5) {
				resize(m);
			}
			
			int idx = hashValue(key);
			int myIdx = idx;
			do { //중복값 체크
				if(key.equals(keys[idx]))	{
				//if(key==keys[idx]){
					values[idx] =val;
					return ;
				}
				else idx =(idx+1) % m;
				
				
			}while(idx != myIdx); //

			int c = 0;
			while(true) { 
				if (keys[idx]!=null) { //넣을려는 자리가 비어있지 않다
					c++;
					idx = (myIdx+(c*c))%m;
				}
				else break;
			}

			keys[idx] = key;
			values[idx] = val;
			n++;
		}
	}
	
	public V get(K key) {
		int idx = hashValue(key);
		int myIdx = idx;
		int cnt = 0;
		do {
			if(keys[idx].equals(key)) return values[idx];
			//if(keys[idx]==key) return values[idx];
			else {
				cnt++;
				idx = (myIdx + (cnt*cnt))%m;
			}
		}while(cnt != m);
		
		return null;
	}
	
	private void resize(int capacity) {
		K[] keys_tmp = (K[]) new Object[m];
		V[] values_tmp = (V[]) new Object[m];
		
		for(int i=0; i<m; i++) { //tmp에 값 복사
			keys_tmp[i] = keys[i]; 
			values_tmp[i] = values[i];
		}

		m = capacity*2;
		
		keys = (K[]) new Object[m];
		values = (V[]) new Object[m];
		
		n=0;// put과 연관이 있기 때문에 초기화
		for(int i=0; i<(m/2); i++) {
			put(keys_tmp[i],values_tmp[i]);
		}
	}
	
	public void printHT() {
		System.out.println("K V");
		
		for(int i=0; i<m; i++) {
			System.out.println(keys[i]+" "+values[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashTable<String, String> ht2 = new HashTable<String, String>(8);
		HashTable<Integer, Integer> ht2 = new HashTable<Integer, Integer>(8);
		BufferedReader fin = null;
		String line;
		
		try {
			fin = new BufferedReader(new FileReader("src/hashhash/hashing_demo2.txt"));
			while((line = fin.readLine()) != null) {
				//ht2.put(line.split("\t")[0], line.split("\t")[1]);
				ht2.put(Integer.parseInt(line.split(",")[0]),Integer.parseInt(line.split(",")[1]));
			}
			fin.close();
		} catch(IOException e) {
			System.err.println("File Error");
			System.exit(1);
		}
		
		System.out.println(ht2.get(2220));
		
//		System.out.println(ht2.get("Peru"));
//		System.out.println(ht2.get("Cambodia"));
		
		//ht2.put("South Korea", "aa");
		//System.out.println(ht2.get("South Korea"));
		
//		ht2.put("SEOUL","KOREAAAAAAAAAAAAA");
//		ht2.put("jkjkj","ggghAAAAAAAAAAAAAa");
//		ht2.printHT();
	}

}