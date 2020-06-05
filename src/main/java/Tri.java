
public class Tri {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public String triangle (int sideA, int sideB , int sideC) throws Exception{
		assert sideA>0&&sideB>0&&sideC>0;
		if((sideA+sideB<=sideC)||(sideA+sideC<=sideB)||(sideC+sideB<=sideA)) {
			throw new Exception();
		}
		if((sideA==sideB)&&(sideB==sideC)) {
			return "正三角形";
		}
		else if((sideA==sideB)||(sideB==sideC)) {
			return "等腰三角形";
		}
		else {
			return "一般三角形";
		}
	}
}