package myAlgorism;

public class BinaraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []Arr = {1,3,5,11,15,21,25,35,42,50};
		int key = 35;
		int min = 1;
		int max = 50;
		int mid = 0;
		int cnt = 0;
		
		while (min < max) {
			mid = (min + max) / 2;
			if (key > mid) {
				min = mid + 1;
			}else {
				max = mid - 1;
			}
			cnt++;
			System.out.println(min+ "/"+ max+ "/" + mid+ "/" + cnt);
		}
	}

}
