package project1;

public class ConvUtil {

	public int stringToInt(String intStr) {
		int n=0;
		try {
			n= Integer.parseInt(intStr);
			}catch (NumberFormatException e) {
				System.out.println(ConvUtil.class.getSimpleName()
						+":ERROR: Invalid String representation '"+intStr+"'");
				e.printStackTrace();
			}
		return n;
	}
	
	public double stringToDouble(String doubleStr) {
		double p=0.0;
		try {
			p= Double.parseDouble(doubleStr);
			}catch (NumberFormatException e) {
				System.out.println(ConvUtil.class.getSimpleName()
						+":ERROR: Invalid String representation '"+doubleStr+"'");
				e.printStackTrace();
			}
		return p;
	}
}
