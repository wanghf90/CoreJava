package unit3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(Paths.get("abc.txt"), "gbk");
//		String str = sc.nextLine();
//		System.out.println(str);
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.print("这是一行字符串");
		pw.flush();
		
//		System.out.println(System.getProperty("user.dir"));
	}
}
