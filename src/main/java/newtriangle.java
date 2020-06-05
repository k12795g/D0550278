package exercise;

import java.util.*;
import java.util.Arrays;


public class newtriangle {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		try {
//			double a = sc.nextDouble();
//			double b = sc.nextDouble();
//			double c = sc.nextDouble();
//			if (a + b <= c || a + c <= b || b + c <= a)// 判斷是否構成三角形
//			{
//				throw new triException("此三邊長無法構成三角形");
//			} else {
//				System.out.print(triangle(a, b, c));
//			}
//		} catch (Exception e) {
//			System.out.print(e);
//		}
//		sc.close();
	}

	public String triangle(double a, double b, double c) {
		double[] tri = { a, b, c };
		String result = "";
		Arrays.sort(tri);
		if (tri[0] == tri[2]) {
			result = "正";
		} else if (tri[0] == tri[1] || tri[1] == tri[2]) {
			result += "等腰";
		}
		if (Math.abs(tri[2] * tri[2] - tri[0] * tri[0] - tri[1] * tri[1]) < 0.01) {
			result += "直角";
		}
		result += "tri";
		return result;
	}
}
