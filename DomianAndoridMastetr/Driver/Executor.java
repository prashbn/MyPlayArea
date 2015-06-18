package Driver;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncationalComponents f1 = new FuncationalComponents();
		f1.setUpDriver();
		f1.setdevice();
		f1.launchApplication("com.google.samples.apps.iosched/.ui.BrowseSessionsActivity");
		f1.testTC001();
	}

}
