package ch.panter.jmock.gettingstarted;

public class MyExample implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		return s.length() == 0;
	}

	@Override
	public String capitalize(String s) {
		return s.toUpperCase();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		return new StringBuffer(s).reverse().toString();
	}

	@Override
	public String join(String... strings) {
		String str = "";
		for(String string:strings){
			str += string;
		}
		return str;
	}

}
