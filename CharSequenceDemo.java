
public class CharSequenceDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("a");
		System.out.println(sb.hashCode());
		sb.append('b');
		System.out.println(sb.hashCode());
		StringBuffer str = new StringBuffer();
		str.append("a");
		System.out.println(str.hashCode());
		str.append("b");
		System.out.println(str.hashCode());
	}

}
