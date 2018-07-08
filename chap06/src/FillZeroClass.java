import java.util.Arrays;
public class FillZeroClass {
	
	public static String fillZero(String src, int length) {
		if(src == null || src.length() == length)
			return src;
		if(length <= 0)
			return "";
		if(src.length() > length) {
			String delstr = src.substring(length);
			return src.replace(delstr, "");
		}else {
			char[] charr = new char[length];
			Arrays.fill(charr, '0');
			System.arraycopy(src.toCharArray(), 0, charr, length-src.length(), src.length());
			return new String(charr);
		}
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println("length(10): " + fillZero(src,10));
		System.out.println("length(5): " + fillZero(src,5));
		System.out.println("length(-1): " + fillZero(src,-1));
		System.out.println("length(3): " + fillZero(src,3));
	}

}
