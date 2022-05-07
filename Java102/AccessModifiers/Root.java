import first.First;
import second.Second;

public class Root {
	int abc;

	public static void main(String[] args) {
		First first = new First("Hello World");
		first.getNameFromFirstClass();
		Second second = new Second();
		// second.callMeeFromSecondClass(); // it can not call from second clas because
		// this method has protected access modifier
	}
}
