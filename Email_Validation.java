package Regular_Expressions;
import java.util.*;
public class Email_Validation {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("valid Email Id returns 'True' or else return 'False'");
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("abc@domain.com");
		ar.add("bcd@domain.com");
		ar.add("cde@domain.com");
		ar.add("def@domain.com");
		ar.add("efg@domain.com");
		ar.add("fgh@domain.com");
		ar.add("ghi@domain.com");
		ar.add("hij@domain.com");
		ar.add("ijk@domain.com");
		ar.add("jkl@domain.com");
		ar.add("klm@domain.com");
		ar.add("lmn@domain.com");
		ar.add("mno@domain.com");
		System.out.println("Enter a email id for validation :-");
		str=sc.next();
		System.out.println("\n");
		System.out.println(ar.contains(str));
	}

}
