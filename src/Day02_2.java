
public class Day02_2 {
	public static void main(String[] args) {
		int num = 1;
		num = num + 1;
		System.out.println(num);
		num++;// num=num+1
		System.out.println(num); // 3
		++num;
		System.out.println(num); // 4
		--num; // num = num -1
		System.out.println(num);
		int r = num++;
		System.out.println("num : " + num); // 4
		System.out.println("r : " + r);
		r = ++num;
		System.out.println("num : " + num);
		System.out.println("r : " + r);
		//혼자씀
		num = 0;
		num = ++num + num++;
		System.out.println(num);
	}
}
