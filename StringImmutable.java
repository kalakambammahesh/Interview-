
public class StringImmutable {
	public static void main(String... args) {
		String s1 = "Mahesh";
		System.out.println(s1.hashCode());
		String s2 = "K";
		System.out.println(s2.hashCode());
		 s1 = s1.concat(s2);
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		System.out.println(s1);
	}
}
