package GUI;
import java.awt.Point;

public class GUIForm {

	public static Login login= new Login();
	public static Menu menu= new Menu();
	public static AddAccount addaccount= new AddAccount();
	public static ADD_CURRENT addcurrentacc= new ADD_CURRENT();
	public static ADD_SAVINGS addsavingsaccount = new ADD_SAVINGS();
	public static ADD_STUDENT addstudentaccount = new ADD_STUDENT();
	public static Display_List displaylist= new Display_List();
	public static Deposit_Acc depositacc= new Deposit_Acc();
	public static Withdraw_Acc withdraw = new Withdraw_Acc();
	
	public static void UpdateDisplay()
	{
		
		if(displaylist.isVisible())
		{
			Point O= displaylist.getLocation();
			displaylist.dispose();
			displaylist = new Display_List();
			displaylist.setVisible(true);
			displaylist.setLocation(O);;
		}
		
		else {
			displaylist = new Display_List();
		}
		
	}
	
	
}
