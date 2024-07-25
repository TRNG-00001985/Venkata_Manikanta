package revaturecodingexcercise;

public class Mostcommanchar {
	public static void main(String[] args) {
		String str = "Manikanta";
		char arr[] = str.toCharArray();
		int c1=0;
		int c2=0;
		char mostcommaonchar = arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c2+=1;
				}
			}
			if(c2>c1) {
				c1=c2;
				mostcommaonchar=arr[i];
			}
		}
		System.out.println(mostcommaonchar);
	}
}
