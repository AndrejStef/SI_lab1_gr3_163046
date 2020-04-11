package prv;
import java.io.*;

public class Item {
	
	double DDV;
	public Item(double ddv) {
		DDV = ddv;
	}
	public void setDDV(double ddv) {
		this.DDV = ddv;
	}
	public double getDDV() {
		return DDV;
	}
	double getTaxReturn() {
			return DDV * 0.15;		
	}
	
	
}
