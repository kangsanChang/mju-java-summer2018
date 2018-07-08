import java.util.StringTokenizer;
public class avgManWeight {

	public static void main(String[] args) {
		String test = "홍길동,남,65,170/김새영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165";
		StringTokenizer st = new StringTokenizer(test,"/");
		int count = 0;
		int totalWeight = 0;
		while(st.hasMoreTokens()) {
			String nextTkn = st.nextToken();
			if(nextTkn.contains("남")){
				String man[] = nextTkn.split(",");
				count ++;
				totalWeight += Integer.parseInt(man[2]);
			}
		}
		System.out.println("남자의 평균체중은 : " + totalWeight/count);
	}
}
