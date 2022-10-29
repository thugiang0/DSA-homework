// Bai 5

package hw2_19000258;

public class Data implements Comparable<Data> {
	private int integer;
	private String word;
	private double realNumber;
	public Data(int integer, String word, double realNumber) {
		super();
		this.integer = integer;
		this.word = word;
		this.realNumber = realNumber;
	}
	public int getInteger() {
		return integer;
	}
	public void setInteger(int integer) {
		this.integer = integer;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public double getRealNumber() {
		return realNumber;
	}
	public void setRealNumber(double realNumber) {
		this.realNumber = realNumber;
	}

	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		return this.word.compareTo(o.word);
	}
	
}

